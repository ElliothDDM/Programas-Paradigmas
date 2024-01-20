
package eventosmousev2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
    
public class Ventana extends JFrame{
    
    public Ventana(){
        
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(960,540);
        this.Componente();
        
    }
    
    int a = 100,b = 50;
    int A = 250,B=100;
    JTextField caja;
    JLabel nomEvent,nomEvent1,nomEvent2,nomEvent3,nomEvent4;
    JButton boton,boton1,boton2,boton3,boton4;
    Raton raton;
    Raton1 raton1;
    Raton2 raton2;
    Raton3 raton3;
    Raton4 raton4;
    
    public void Componente(){
        
        raton = new Raton();
        nomEvent = new JLabel("Clicked");
        caja = new JTextField();
        boton = new JButton("Probar");
        
        raton1 = new Raton1();
        nomEvent1 = new JLabel("Pressed");
        boton1 = new JButton("Probar");
        
        raton2 = new Raton2();
        nomEvent2 = new JLabel("Released");
        boton2 = new JButton("Probar");
        
        raton3 = new Raton3();
        nomEvent3 = new JLabel("Entered");
        boton3 = new JButton("Probar");
        
        raton4 = new Raton4();
        nomEvent4 = new JLabel("Exited");
        boton4 = new JButton("Probar");
        
        
        caja.setBounds(250, 100, A, B);
        boton.setBounds(10, 40, a, b);
       
        boton1.setBounds(10, 140, a, b);
     
        boton2.setBounds(10, 240, a, b);
       
        boton3.setBounds(10, 340, a, b);
        
        boton4.setBounds(10, 440, a, b);
        
        nomEvent.setBounds(10, 0, 70, 50);
        nomEvent1.setBounds(10, 100, 70, 50);
        nomEvent2.setBounds(10, 200, 70, 50);
        nomEvent3.setBounds(10, 300, 70, 50);
        nomEvent4.setBounds(10, 400, 70, 50);
        
        boton.addMouseListener(raton);
        boton1.addMouseListener(raton1);
        boton2.addMouseListener(raton2);
        boton3.addMouseListener(raton3);
        boton4.addMouseListener(raton4);
        
        this.add(caja);
        this.add(boton);
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(nomEvent);
        this.add(nomEvent1);
        this.add(nomEvent2);
        this.add(nomEvent3);
        this.add(nomEvent4);
        
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
            
            caja.setText("Evento Pressed");
            
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
            
            caja.setText("Evento Released");
            
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
            
            caja.setText("Evento Entered");
            
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
            
            caja.setText("Evento Exited");
            
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
