
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class ReflejarFiguraJava extends JPanel implements KeyListener {
    private boolean reflejada = false; // Para llevar un registro del estado de la figura

    public ReflejarFiguraJava() {
        setFocusable(true);
        addKeyListener(this);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llamamos a repaint() para que la figura se repinte automáticamente
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja tu figura aquí
        int width = 100;
        int height = 50;
        int x = 50;
        int y = 50;

        if (reflejada) {
            // Crea una transformación para reflejar horizontalmente
            AffineTransform tx = new AffineTransform();
            tx.scale(-1, 1);

            // Obtiene el Graphics2D
            Graphics2D g2d = (Graphics2D) g;

            // Aplica la transformación al Graphics2D
            g2d.transform(tx);

            // Dibuja la figura reflejada
            g2d.setColor(Color.red);
            g2d.fillRect(-x - width, y,width, height);
        } else {
            // Dibuja la figura en su estado original
            g.setColor(Color.blue);
            g.fillRect(x, y, width, height);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
            reflejada = true;
            repaint(); // Redibujar la figura reflejada
        } else if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
            reflejada = false;
            repaint(); // Redibujar la figura en su estado original
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Reflejar Figura en Java");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ReflejarFiguraJava panel = new ReflejarFiguraJava();
            frame.add(panel);
            frame.setSize(300, 200);
            frame.setVisible(true);
            panel.requestFocus();
        });
    }
}
