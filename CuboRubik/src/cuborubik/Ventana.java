
package cuborubik;

import java.awt.Color;
import java.awt.Panel;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(){
        
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ventana");
        this.setSize(960,540);
        this.Componente();
        
    }
    
    public void Componente(){
        
        Panel Pan = new Panel();
        Pan.setBounds(5,5,100,100);
        Pan.setBackground(Color.lightGray);
        this.add(Pan);
        
        Panel Pan1 = new Panel();
        Pan1.setBounds(100,5,100,100);
        Pan1.setBackground(Color.gray);
        this.add(Pan1);
        
        Panel Pan2 = new Panel();
        Pan2.setBounds(200,5,100,100);
        Pan2.setBackground(Color.darkGray);
        this.add(Pan2);
        
        Panel Pan3 = new Panel();
        Pan3.setBounds(5,100,100,100);
        Pan3.setBackground(Color.magenta);
        this.add(Pan3);
        
        Panel Pan4 = new Panel();
        Pan4.setBounds(100,100,100,100);
        Pan4.setBackground(Color.red);
        this.add(Pan4);
        
        Panel Pan5 = new Panel();
        Pan5.setBounds(200,100,100,100);
        Pan5.setBackground(Color.pink);
        this.add(Pan5);
        
        Panel Pan6 = new Panel();
        Pan6.setBounds(5,200,100,100);
        Pan6.setBackground(Color.orange);
        this.add(Pan6);
        
        Panel Pan7 = new Panel();
        Pan7.setBounds(100,200,100,100);
        Pan7.setBackground(Color.yellow);
        this.add(Pan7);
        
        Panel Pan8 = new Panel();
        Pan8.setBounds(200,200,100,100);
        Pan8.setBackground(Color.green);
        this.add(Pan8);
    }
}
