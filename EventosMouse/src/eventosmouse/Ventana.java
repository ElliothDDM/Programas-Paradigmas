
package eventosmouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    
    public Ventana(){
        
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(960,540);
        this.Componente();
        
    }
    
    int a = 100,b = 50;
    JTextField caja,caja1,caja2,caja3,caja4;
    JButton boton,boton1,boton2,boton3,boton4;
    Raton raton;
    Raton1 raton1;
    Raton2 raton2;
    Raton3 raton3;
    Raton4 raton4;
    
    public void Componente(){
        
        raton = new Raton();
        caja = new JTextField();
        boton = new JButton();
        
        raton1 = new Raton1();
        caja1 = new JTextField();
        boton1 = new JButton();
        
        raton2 = new Raton2();
        caja2 = new JTextField();
        boton2 = new JButton();
        
        raton3 = new Raton3();
        caja3 = new JTextField();
        boton3 = new JButton();
        
        raton4 = new Raton4();
        caja4 = new JTextField();
        boton4 = new JButton();
        
        
        caja.setBounds(10, 10, a, b);
        boton.setBounds(10, 100, a, b);
        
        caja1.setBounds(150, 10, a, b);
        boton1.setBounds(150, 100, a, b);
        
        caja2.setBounds(300, 10, a, b);
        boton2.setBounds(300, 100, a, b);
        
        caja3.setBounds(450, 10, a, b);
        boton3.setBounds(450, 100, a, b);
        
        caja4.setBounds(600, 10, a, b);
        boton4.setBounds(600, 100, a, b);
        
        boton.addMouseListener(raton);
        boton1.addMouseListener(raton1);
        boton2.addMouseListener(raton2);
        boton3.addMouseListener(raton3);
        boton4.addMouseListener(raton4);
        
        this.add(caja);
        this.add(boton);
        
        this.add(caja1);
        this.add(boton1);
        
        this.add(caja2);
        this.add(boton2);
        
        this.add(caja3);
        this.add(boton3);
        
        this.add(caja4);
        this.add(boton4);
        
    }
    
    public class Raton implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            
            caja.setText("Evento Clicked");
            
        } 

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    }
    
    public class Raton1 implements MouseListener{

        @Override
        public void mousePressed(MouseEvent e) {
            
            caja1.setText("Evento Pressed");
            
        } 

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    }
    
    public class Raton2 implements MouseListener{

        @Override
        public void mouseReleased(MouseEvent e) {
            
            caja2.setText("Evento Released");
            
        } 

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    }
    
    public class Raton3 implements MouseListener{

        @Override
        public void mouseEntered(MouseEvent e) {
            
            caja3.setText("Evento Entered");
            
        } 

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    }
    
    public class Raton4 implements MouseListener{

        @Override
        public void mouseExited(MouseEvent e) {
            
            caja4.setText("Evento Exited");
            
        } 

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }
    }
}
