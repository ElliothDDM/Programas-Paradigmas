package mariobros1985;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    private JPanel character;
    private int x, y; 

    public Ventana(){
        
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ventana");
        this.setSize(960,540);
        this.Componente();

    }
        
    
    public void Componente(){
        
        
        character = new JPanel();
        character.setLayout(null);
        
        //Sombrero parte arriba
        Panel Pan = new Panel();
        Pan.setBounds(200,5,125,25);
        Pan.setBackground(Color.red);
        character.add(Pan);
        
        //Sombrero parte abajo
        Panel Pan1 = new Panel();
        Pan1.setBounds(175,25,225,25);
        Pan1.setBackground(Color.red);
        character.add(Pan1);
        
        //Cabello parte arriba
        Panel Pan2 = new Panel();
        Pan2.setBounds(175,50,75,25);
        Pan2.setBackground(Color.black);
        character.add(Pan2);
        
        //Cara parte 1 
        Panel Pan3 = new Panel();
        Pan3.setBounds(250,50,50,125);
        Pan3.setBackground(Color.orange);
        character.add(Pan3);
        
        //Ojo
        Panel Pan4 = new Panel();
        Pan4.setBounds(300,50,25,50);
        Pan4.setBackground(Color.black);
        character.add(Pan4);
        
        //Cara parte 2
        Panel Pan5 = new Panel();
        Pan5.setBounds(325,50,25,25);
        Pan5.setBackground(Color.orange);
        character.add(Pan5);
        
        //Cabello parte 1
        Panel Pan6 = new Panel();
        Pan6.setBounds(150,75,25,75);
        Pan6.setBackground(Color.black);
        character.add(Pan6);
        
        //Cabello parte 2
        Panel Pan7 = new Panel();
        Pan7.setBounds(175,125,25,25);
        Pan7.setBackground(Color.black);
        character.add(Pan7);
        
        //Cara parte 3
        Panel Pan8 = new Panel();
        Pan8.setBounds(225,75,25,25);
        Pan8.setBackground(Color.orange);
        character.add(Pan8);
        
        //Cara parte 4
        Panel Pan9 = new Panel();
        Pan9.setBounds(175,75,25,50);
        Pan9.setBackground(Color.orange);
        character.add(Pan9);
        
        //Patilla
        Panel Pan10 = new Panel();
        Pan10.setBounds(200,75,25,50);
        Pan10.setBackground(Color.black);
        character.add(Pan10);
        
        //Patilla 
        Panel Pan11 = new Panel();
        Pan11.setBounds(225,100,25,25);
        Pan11.setBackground(Color.black);
        character.add(Pan11);
        
        //Cara parte 5
        Panel Pan12 = new Panel();
        Pan12.setBounds(200,125,50,50);
        Pan12.setBackground(Color.orange);
        character.add(Pan12);
        
        //Cara parte 6
        Panel Pan13 = new Panel();
        Pan13.setBounds(300,100,25,25);
        Pan13.setBackground(Color.orange);
        character.add(Pan13);
        
        //Cara parte 7
        Panel Pan14 = new Panel();
        Pan14.setBounds(325,75,75,25);
        Pan14.setBackground(Color.orange);
        character.add(Pan14);
       
        //Boca parte 1 
        Panel Pan15 = new Panel();
        Pan15.setBounds(325,100,25,25);
        Pan15.setBackground(Color.black);
        character.add(Pan15);
        
        //Boca parte 2
        Panel Pan16 = new Panel();
        Pan16.setBounds(300,125,100,25);
        Pan16.setBackground(Color.black);
        character.add(Pan16);
        
        //Cara parte 8
        Panel Pan17 = new Panel();
        Pan17.setBounds(350,100,75,25);
        Pan17.setBackground(Color.orange);
        character.add(Pan17);
        
        //Cara parte 9
        Panel Pan18 = new Panel();
        Pan18.setBounds(300,150,75,25);
        Pan18.setBackground(Color.orange);
        character.add(Pan18);
        
        //Cuerpo parte 1
        Panel Pan19 = new Panel();
        Pan19.setBounds(175,175,50,75);
        Pan19.setBackground(Color.black);
        character.add(Pan19);
        
        //Cuerpo parte 2
        Panel Pan20 = new Panel();
        Pan20.setBounds(150,200,25,50);
        Pan20.setBackground(Color.black);
        character.add(Pan20);
        
        //Cuerpo parte 3
        Panel Pan21 = new Panel();
        Pan21.setBounds(125,225,25,25);
        Pan21.setBackground(Color.black);
        character.add(Pan21);
        
        //Cuerpo parte 4
        Panel Pan22 = new Panel();
        Pan22.setBounds(175,250,25,25);
        Pan22.setBackground(Color.black);
        character.add(Pan22);
        
        //Mano parte 1
        Panel Pan23 = new Panel();
        Pan23.setBounds(125,250,50,75);
        Pan23.setBackground(Color.orange);
        character.add(Pan23);
        
        //Mano parte 2
        Panel Pan24 = new Panel();
        Pan24.setBounds(175,275,25,25);
        Pan24.setBackground(Color.orange);
        character.add(Pan24);
        
        //Mandil parte 1
        Panel Pan25 = new Panel();
        Pan25.setBounds(225,175,25,75);
        Pan25.setBackground(Color.red);
        character.add(Pan25);
        
        //Mandil parte 2
        Panel Pan26 = new Panel();
        Pan26.setBounds(225,250,25,25);
        Pan26.setBackground(Color.orange);
        character.add(Pan26);
        
        //Mandil parte 3
        Panel Pan27 = new Panel();
        Pan27.setBounds(250,225,50,100);
        Pan27.setBackground(Color.red);
        character.add(Pan27);
        
        //Mandil parte 4
        Panel Pan28 = new Panel();
        Pan28.setBounds(200,250,25,50);
        Pan28.setBackground(Color.red);
        character.add(Pan28);
        
        //Mandil parte 5
        Panel Pan29 = new Panel();
        Pan29.setBounds(175,300,75,50);
        Pan29.setBackground(Color.red);
        character.add(Pan29);
        
        //Mandil parte 6
        Panel Pan30 = new Panel();
        Pan30.setBounds(225,275,50,50);
        Pan30.setBackground(Color.red);
        character.add(Pan30);
        
        //Mandil parte 7
        Panel Pan31 = new Panel();
        Pan31.setBounds(300,200,25,50);
        Pan31.setBackground(Color.red);
        character.add(Pan31);
        
        //Mandil parte 8
        Panel Pan32 = new Panel();
        Pan32.setBounds(300,250,25,25);
        Pan32.setBackground(Color.orange);
        character.add(Pan32);
        
        //Mandil parte 10
        Panel Pan33 = new Panel();
        Pan33.setBounds(325,250,25,50);
        Pan33.setBackground(Color.red);
        character.add(Pan33);
        
        //Mandil parte 11
        Panel Pan34 = new Panel();
        Pan34.setBounds(300,300,75,50);
        Pan34.setBackground(Color.red);
        character.add(Pan34);
        
        //Mandil parte 12
        Panel Pan35 = new Panel();
        Pan35.setBounds(300,275,25,25);
        Pan35.setBackground(Color.red);
        character.add(Pan35);
        
        //Cuerpo parte 5
        Panel Pan36 = new Panel();
        Pan36.setBounds(250,175,50,50);
        Pan36.setBackground(Color.black);
        character.add(Pan36);
        
        //Cuerpo parte 6
        Panel Pan37 = new Panel();
        Pan37.setBounds(300,175,50,25);
        Pan37.setBackground(Color.black);
        character.add(Pan37);
        
        //Cuerpo parte 7
        Panel Pan38 = new Panel();
        Pan38.setBounds(325,200,75,50);
        Pan38.setBackground(Color.black);
        character.add(Pan38);
        
        //Cuerpo parte 8
        Panel Pan39 = new Panel();
        Pan39.setBounds(400,225,25,25);
        Pan39.setBackground(Color.black);
        character.add(Pan39);
        
        //Cuerpo parte 9
        Panel Pan40 = new Panel();
        Pan40.setBounds(350,250,25,25);
        Pan40.setBackground(Color.black);
        character.add(Pan40);
        
        //Mano parte 3
        Panel Pan41 = new Panel();
        Pan41.setBounds(375,250,50,75);
        Pan41.setBackground(Color.orange);
        character.add(Pan41);
        
        //Mano parte 4
        Panel Pan42 = new Panel();
        Pan42.setBounds(350,275,25,25);
        Pan42.setBackground(Color.orange);
        character.add(Pan42);
        
        //Zapato parte 1
        Panel Pan43 = new Panel();
        Pan43.setBounds(150,350,75,50);
        Pan43.setBackground(Color.black);
        character.add(Pan43);
        
        //Zapato parte 2
        Panel Pan44 = new Panel();
        Pan44.setBounds(325,350,75,50);
        Pan44.setBackground(Color.black);
        character.add(Pan44);
        
        //Zapato parte 3
        Panel Pan45 = new Panel();
        Pan45.setBounds(125,375,25,25);
        Pan45.setBackground(Color.black);
        character.add(Pan45);
        
        //Zapato parte 4
        Panel Pan46 = new Panel();
        Pan46.setBounds(400,375,25,25);
        Pan46.setBackground(Color.black);
        character.add(Pan46);
        
        this.add(character);

        character.setBounds(x, y, 500, 500);
        //character.setBackground(Color.blue);
        character.setFocusable(true);

        character.addKeyListener(new KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                String ch = String.valueOf(e.getKeyChar());
                if (ch.equals("w")) {
                    y -=20;
                } else if (ch.equals("s")) {
                    y += 20;
                } else if (ch.equals("a")) {
                   x -=20;

                } else if (ch.equals("d")) {
                   x +=20;
                } 
                
                character.setBounds(x,y,500, 500);
            } 

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        character.requestFocusInWindow();
        
    }                  
}
