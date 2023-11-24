
package juego;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Ellioth_Riot
 */
public class Ventana extends JFrame{
    Panel Personaje, Enemigo,Limite, Ganar;
    Panel Pared,Pared1,Pared2,Pared3,Pared4,Pared5,Pared6,Pared7,Pared8,Pared9,
            Pared10,Pared11,Pared12,Pared13,Pared14,Pared15,Pared16,Pared17,
            Pared18,Pared19,Pared20,Pared21,Pared22,Pared23,Pared24,Pared25,Pared26;
    int X,Y;
    int speed = 50, speed2= 50;
    
    MovimientoPersonaje mov1;
    MovimientoEnemigo mov2;
    
    public Ventana(){
        
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Juego");
        this.setSize(960,960);
        this.addKeyListener(new MovimientoPersonaje());
        this.addKeyListener(new MovimientoEnemigo());
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.Componente();
        
        
    }
    
    public void Componente(){
        
        Enemigo = new Panel();
        Enemigo.setLayout(null);
        Enemigo.setBounds(350, 350, 50, 50);
        Enemigo.setBackground(Color.black);
        Enemigo.setFocusable(true);
        Enemigo.requestFocusInWindow();
        this.add(Enemigo);
        
        //Enemigo
        Panel EnemigoC = new Panel();
        EnemigoC.setBounds(6,24,3,21);
        EnemigoC.setBackground(Color.red);
        Enemigo.add(EnemigoC);
        Panel EnemigoC1 = new Panel();
        EnemigoC1.setBounds(9,15,3,27);
        EnemigoC1.setBackground(Color.red);
        Enemigo.add(EnemigoC1);
        Panel OjoEnemigo = new Panel();
        OjoEnemigo.setBounds(12,18,3,9);
        OjoEnemigo.setBackground(Color.white);
        Enemigo.add(OjoEnemigo);
        Panel OjoEnemigo1 = new Panel();
        OjoEnemigo1.setBounds(15,15,3,9);
        OjoEnemigo1.setBackground(Color.white);
        Enemigo.add(OjoEnemigo1);
        Panel OjoEnemigo2 = new Panel();
        OjoEnemigo2.setBounds(18,15,3,9);
        OjoEnemigo2.setBackground(Color.white);
        Enemigo.add(OjoEnemigo2);
        Panel OjoEnemigo3 = new Panel();
        OjoEnemigo3.setBounds(15,24,6,6);
        OjoEnemigo3.setBackground(Color.blue);
        Enemigo.add(OjoEnemigo3);
        Panel OjoEnemigo4 = new Panel();
        OjoEnemigo4.setBounds(21,18,3,9);
        OjoEnemigo4.setBackground(Color.white);
        Enemigo.add(OjoEnemigo4);
        Panel OjoEnemigo5 = new Panel();
        OjoEnemigo5.setBounds(30,18,3,9);
        OjoEnemigo5.setBackground(Color.white);
        Enemigo.add(OjoEnemigo5);
        Panel OjoEnemigo6 = new Panel();
        OjoEnemigo6.setBounds(33,15,3,9);
        OjoEnemigo6.setBackground(Color.white);
        Enemigo.add(OjoEnemigo6);
        Panel OjoEnemigo7 = new Panel();
        OjoEnemigo7.setBounds(36,15,3,9);
        OjoEnemigo7.setBackground(Color.white);
        Enemigo.add(OjoEnemigo7);
        Panel OjoEnemigo8 = new Panel();
        OjoEnemigo8.setBounds(33,24,6,6);
        OjoEnemigo8.setBackground(Color.blue);
        Enemigo.add(OjoEnemigo8);
        Panel OjoEnemigo9 = new Panel();
        OjoEnemigo9.setBounds(39,18,3,9);
        OjoEnemigo9.setBackground(Color.white);
        Enemigo.add(OjoEnemigo9);
        Panel EnemigoC2 = new Panel();
        EnemigoC2.setBounds(12,12,3,27);
        EnemigoC2.setBackground(Color.red);
        Enemigo.add(EnemigoC2);        
        Panel EnemigoC3 = new Panel();
        EnemigoC3.setBounds(15,9,3,33);
        EnemigoC3.setBackground(Color.red);
        Enemigo.add(EnemigoC3);
        Panel EnemigoC4 = new Panel();
        EnemigoC4.setBounds(18,9,3,36);
        EnemigoC4.setBackground(Color.red);
        Enemigo.add(EnemigoC4);
        Panel EnemigoC5 = new Panel();
        EnemigoC5.setBounds(21,6,3,39);
        EnemigoC5.setBackground(Color.red);
        Enemigo.add(EnemigoC5);
        Panel EnemigoC6 = new Panel();
        EnemigoC6.setBounds(24,6,3,36);
        EnemigoC6.setBackground(Color.red);
        Enemigo.add(EnemigoC6);
        Panel EnemigoC7 = new Panel();
        EnemigoC7.setBounds(27,6,3,36);
        EnemigoC7.setBackground(Color.red);
        Enemigo.add(EnemigoC7);
        Panel EnemigoC8 = new Panel();
        EnemigoC8.setBounds(30,6,3,39);
        EnemigoC8.setBackground(Color.red);
        Enemigo.add(EnemigoC8);
        Panel EnemigoC9 = new Panel();
        EnemigoC9.setBounds(33,9,3,36);
        EnemigoC9.setBackground(Color.red);
        Enemigo.add(EnemigoC9);
        Panel EnemigoC10 = new Panel();
        EnemigoC10.setBounds(36,9,3,33);
        EnemigoC10.setBackground(Color.red);
        Enemigo.add(EnemigoC10);
        Panel EnemigoC11 = new Panel();
        EnemigoC11.setBounds(39,12,3,27);
        EnemigoC11.setBackground(Color.red);
        Enemigo.add(EnemigoC11);
        Panel EnemigoC12 = new Panel();
        EnemigoC12.setBounds(42,15,3,27);
        EnemigoC12.setBackground(Color.red);
        Enemigo.add(EnemigoC12);
        Panel EnemigoC13 = new Panel();
        EnemigoC13.setBounds(45,24,3,21);
        EnemigoC13.setBackground(Color.red);
        Enemigo.add(EnemigoC13);
        
        
        Personaje= new Panel();
        Personaje.setLayout(null);
        Personaje.setBounds(0, 0, 50, 50);
        Personaje.setBackground(Color.black);
        Personaje.setFocusable(true);
        Personaje.requestFocusInWindow();
        this.add(Personaje);
        
        //Personaje
        Panel Cuerpo = new Panel();
        Cuerpo.setBounds(21,6,15,3);
        Cuerpo.setBackground(Color.yellow);
        Personaje.add(Cuerpo);
        Panel Cuerpo1 = new Panel();
        Cuerpo1.setBounds(15,9,27,3);
        Cuerpo1.setBackground(Color.yellow);
        Personaje.add(Cuerpo1);
        Panel Cuerpo2 = new Panel();
        Cuerpo2.setBounds(12,12,33,3);
        Cuerpo2.setBackground(Color.yellow);
        Personaje.add(Cuerpo2);
        Panel Cuerpo3 = new Panel();
        Cuerpo3.setBounds(12,15,33,3);
        Cuerpo3.setBackground(Color.yellow);
        Personaje.add(Cuerpo3);
        Panel Cuerpo4 = new Panel();
        Cuerpo4.setBounds(9,18,30,3);
        Cuerpo4.setBackground(Color.yellow);
        Personaje.add(Cuerpo4);
        Panel Cuerpo5 = new Panel();
        Cuerpo5.setBounds(9,21,24,3);
        Cuerpo5.setBackground(Color.yellow);
        Personaje.add(Cuerpo5);
        Panel Cuerpo6 = new Panel();
        Cuerpo6.setBounds(9,24,18,3);
        Cuerpo6.setBackground(Color.yellow);
        Personaje.add(Cuerpo6);
        Panel Cuerpo7 = new Panel();
        Cuerpo7.setBounds(9,27,24,3);
        Cuerpo7.setBackground(Color.yellow);
        Personaje.add(Cuerpo7);
        Panel Cuerpo8 = new Panel();
        Cuerpo8.setBounds(9,30,30,3);
        Cuerpo8.setBackground(Color.yellow);
        Personaje.add(Cuerpo8);
        Panel Cuerpo9 = new Panel();
        Cuerpo9.setBounds(12,33,33,3);
        Cuerpo9.setBackground(Color.yellow);
        Personaje.add(Cuerpo9);
        Panel Cuerpo10 = new Panel();
        Cuerpo10.setBounds(12,36,33,3);
        Cuerpo10.setBackground(Color.yellow);
        Personaje.add(Cuerpo10);
        Panel Cuerpo11 = new Panel();
        Cuerpo11.setBounds(15,39,27,3);
        Cuerpo11.setBackground(Color.yellow);
        Personaje.add(Cuerpo11);
        Panel Cuerpo12 = new Panel();
        Cuerpo12.setBounds(21,42,15,3);
        Cuerpo12.setBackground(Color.yellow);
        Personaje.add(Cuerpo12);
        
        
        Pared = new Panel();
        Pared.setLayout(null);
        Pared.setBounds(50,50,100, 100);
        Pared.setBackground(Color.blue);
        Pared.setFocusable(true);
        Pared.requestFocusInWindow();
        this.add(Pared);       
        Pared1 = new Panel();
        Pared1.setLayout(null);
        Pared1.setBounds(50,200,50, 150);
        Pared1.setBackground(Color.blue);
        Pared1.setFocusable(true);
        Pared1.requestFocusInWindow();
        this.add(Pared1);       
        Pared2 = new Panel();
        Pared2.setLayout(null);
        Pared2.setBounds(50,400,50, 150);
        Pared2.setBackground(Color.blue);
        Pared2.setFocusable(true);
        Pared2.requestFocusInWindow();
        this.add(Pared2);        
        Pared3 = new Panel();
        Pared3.setLayout(null);
        Pared3.setBounds(50,600,100, 100);
        Pared3.setBackground(Color.blue);
        Pared3.setFocusable(true);
        Pared3.requestFocusInWindow();
        this.add(Pared3);        
        Pared4 = new Panel();
        Pared4.setLayout(null);
        Pared4.setBounds(150,300,50, 150);
        Pared4.setBackground(Color.blue);
        Pared4.setFocusable(true);
        Pared4.requestFocusInWindow();
        this.add(Pared4);       
        Pared5 = new Panel();
        Pared5.setLayout(null);
        Pared5.setBounds(100,200,50, 50);
        Pared5.setBackground(Color.blue);
        Pared5.setFocusable(true);
        Pared5.requestFocusInWindow();
        this.add(Pared5);        
        Pared6 = new Panel();
        Pared6.setLayout(null);
        Pared6.setBounds(100,500,50, 50);
        Pared6.setBackground(Color.blue);
        Pared6.setFocusable(true);
        Pared6.requestFocusInWindow();
        this.add(Pared6);        
        Pared7 = new Panel();
        Pared7.setLayout(null);
        Pared7.setBounds(200,0,400, 50);
        Pared7.setBackground(Color.blue);
        Pared7.setFocusable(true);
        Pared7.requestFocusInWindow();
        this.add(Pared7);        
        Pared8 = new Panel();
        Pared8.setLayout(null);
        Pared8.setBounds(350,50,100, 50);
        Pared8.setBackground(Color.blue);
        Pared8.setFocusable(true);
        Pared8.requestFocusInWindow();
        this.add(Pared8);        
        Pared9 = new Panel();
        Pared9.setLayout(null);
        Pared9.setBounds(200,100,100, 50);
        Pared9.setBackground(Color.blue);
        Pared9.setFocusable(true);
        Pared9.requestFocusInWindow();
        this.add(Pared9);        
        Pared10 = new Panel();
        Pared10.setLayout(null);
        Pared10.setBounds(500,100,100, 50);
        Pared10.setBackground(Color.blue);
        Pared10.setFocusable(true);
        Pared10.requestFocusInWindow();
        this.add(Pared10);        
        Pared11 = new Panel();
        Pared11.setLayout(null);
        Pared11.setBounds(200,200,400, 50);
        Pared11.setBackground(Color.blue);
        Pared11.setFocusable(true);
        Pared11.requestFocusInWindow();
        this.add(Pared11);        
        Pared12 = new Panel();
        Pared12.setLayout(null);
        Pared12.setBounds(250,300,50, 150);
        Pared12.setBackground(Color.blue);
        Pared12.setFocusable(true);
        Pared12.requestFocusInWindow();
        this.add(Pared12);       
        Pared13 = new Panel();
        Pared13.setLayout(null);
        Pared13.setBounds(300,400,200, 50);
        Pared13.setBackground(Color.blue);
        Pared13.setFocusable(true);
        Pared13.requestFocusInWindow();
        this.add(Pared13);
        Pared14 = new Panel();
        Pared14.setLayout(null);
        Pared14.setBounds(500,300,50, 150);
        Pared14.setBackground(Color.blue);
        Pared14.setFocusable(true);
        Pared14.requestFocusInWindow();
        this.add(Pared14);
        Pared15 = new Panel();
        Pared15.setLayout(null);
        Pared15.setBounds(200,500,400, 50);
        Pared15.setBackground(Color.blue);
        Pared15.setFocusable(true);
        Pared15.requestFocusInWindow();
        this.add(Pared15);
        Pared16 = new Panel();
        Pared16.setLayout(null);
        Pared16.setBounds(200,600,100, 50);
        Pared16.setBackground(Color.blue);
        Pared16.setFocusable(true);
        Pared16.requestFocusInWindow();
        this.add(Pared16);
        Pared17 = new Panel();
        Pared17.setLayout(null);
        Pared17.setBounds(500,600,100, 50);
        Pared17.setBackground(Color.blue);
        Pared17.setFocusable(true);
        Pared17.requestFocusInWindow();
        this.add(Pared17);
        Pared18 = new Panel();
        Pared18.setLayout(null);
        Pared18.setBounds(350,650,100, 50);
        Pared18.setBackground(Color.blue);
        Pared18.setFocusable(true);
        Pared18.requestFocusInWindow();
        this.add(Pared18);
        Pared19 = new Panel();
        Pared19.setLayout(null);
        Pared19.setBounds(200,700,400, 50);
        Pared19.setBackground(Color.blue);
        Pared19.setFocusable(true);
        Pared19.requestFocusInWindow();
        this.add(Pared19);
        Pared20 = new Panel();
        Pared20.setLayout(null);
        Pared20.setBounds(650,50,100, 100);
        Pared20.setBackground(Color.blue);
        Pared20.setFocusable(true);
        Pared20.requestFocusInWindow();
        this.add(Pared20);
        Pared21 = new Panel();
        Pared21.setLayout(null);
        Pared21.setBounds(700,200,50, 150);
        Pared21.setBackground(Color.blue);
        Pared21.setFocusable(true);
        Pared21.requestFocusInWindow();
        this.add(Pared21);
        Pared22 = new Panel();
        Pared22.setLayout(null);
        Pared22.setBounds(700,400,50, 150);
        Pared22.setBackground(Color.blue);
        Pared22.setFocusable(true);
        Pared22.requestFocusInWindow();
        this.add(Pared22);
        Pared23 = new Panel();
        Pared23.setLayout(null);
        Pared23.setBounds(650,200,50, 50);
        Pared23.setBackground(Color.blue);
        Pared23.setFocusable(true);
        Pared23.requestFocusInWindow();
        this.add(Pared23);
        Pared24 = new Panel();
        Pared24.setLayout(null);
        Pared24.setBounds(650,500,50, 50);
        Pared24.setBackground(Color.blue);
        Pared24.setFocusable(true);
        Pared24.requestFocusInWindow();
        this.add(Pared24);
        Pared25 = new Panel();
        Pared25.setLayout(null);
        Pared25.setBounds(600,300,50, 150);
        Pared25.setBackground(Color.blue);
        Pared25.setFocusable(true);
        Pared25.requestFocusInWindow();
        this.add(Pared25);
        Pared26 = new Panel();
        Pared26.setLayout(null);
        Pared26.setBounds(650,600,100, 100);
        Pared26.setBackground(Color.blue);
        Pared26.setFocusable(true);
        Pared26.requestFocusInWindow();
        this.add(Pared26);
        
        
        Ganar = new Panel();
        Ganar.setLayout(null);
        Ganar.setBounds(760, 710, 30, 30); // Ajusta la ubicación y el tamaño según sea necesario
        Ganar.setBackground(Color.white);
        this.add(Ganar);
        
        Panel Flecha = new Panel();
        Flecha.setBounds(5,13,20,4);
        Flecha.setBackground(Color.black);
        Ganar.add(Flecha);
        Panel Flecha1 = new Panel();
        Flecha1.setBounds(18,9,4,4);
        Flecha1.setBackground(Color.black);
        Ganar.add(Flecha1);
        Panel Flecha2 = new Panel();
        Flecha2.setBounds(18,17,4,4);
        Flecha2.setBackground(Color.black);
        Ganar.add(Flecha2);
        Panel Flecha3 = new Panel();
        Flecha3.setBounds(15,6,4,4);
        Flecha3.setBackground(Color.black);
        Ganar.add(Flecha3);
        Panel Flecha4 = new Panel();
        Flecha4.setBounds(15,21,4,4);
        Flecha4.setBackground(Color.black);
        Ganar.add(Flecha4);
        
        
        Limite = new Panel();
        Limite.setLayout(null);
        Limite.setBounds(0,0,800, 750);
        Limite.setBackground(Color.black);
        Limite.setFocusable(true);
        Limite.requestFocusInWindow();
        this.add(Limite);
        
        
        Personaje.addKeyListener(mov1);
        Enemigo.addKeyListener(mov2);
    }
    
    
    private class MovimientoPersonaje implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            String ch = String.valueOf(e.getKeyChar());
                if (ch.equals("w")) {
                    moverPersonaje(0,-speed);
                } else if (ch.equals("s")) {
                    moverPersonaje(0,speed);
                }if (ch.equals("a")) {
                   moverPersonaje(-speed,0);

                } else if (ch.equals("d")) {
                   moverPersonaje(speed, 0);
                } 
                
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
        
    }
    
    private class MovimientoEnemigo implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int TeclaCodigo = e.getKeyCode();
            
            if (KeyEvent.VK_UP == TeclaCodigo){
                moverEnemigo(0,-speed2);
            }
            else if (KeyEvent.VK_DOWN == TeclaCodigo){
                moverEnemigo(0,speed2);
            }
            if (KeyEvent.VK_LEFT == TeclaCodigo){
                moverEnemigo(-speed2,0);
            }
            else if (KeyEvent.VK_RIGHT == TeclaCodigo){
                moverEnemigo(speed2,0);
            } 
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
        
    }

    private void moverPersonaje(int deltaX, int deltaY) {
        int newPosX = Personaje.getX() + deltaX;
        int newPosY = Personaje.getY() + deltaY;

        // Checa colisiones
        if (cColision(newPosX, newPosY)) {
            return;
        }

        // Checa colisiones con limite
        if (newPosX >= 0 && newPosX + Personaje.getWidth() <= Limite.getWidth()
                && newPosY >= 0 && newPosY + Personaje.getHeight() <= Limite.getHeight()) {
            Personaje.setLocation(newPosX, newPosY);
            verificarColisionGanar();
            verificarColisionEnemigo();
            
        }
    }
    
    private void moverEnemigo(int deltaX, int deltaY) {
        int newPosX = Enemigo.getX() + deltaX;
        int newPosY = Enemigo.getY() + deltaY;

        // Checa colisiones
        if (cColisionEnemigo(newPosX, newPosY)) {
            return;
        }

        // Checa colisiones con limite
        if (newPosX >= 0 && newPosX + Enemigo.getWidth() <= Limite.getWidth()
                && newPosY >= 0 && newPosY + Enemigo.getHeight() <= Limite.getHeight()) {
            Enemigo.setLocation(newPosX, newPosY);
            verificarColisionEnemigoPersonaje();
            verificarColisionEnemigoGanar();
        }
    }

    private boolean cColision(int x, int y) {
        // Checa las colisiones con la pared
        if (x + Personaje.getWidth() > Pared.getX() && x < Pared.getX() + Pared.getWidth()
                && y + Personaje.getHeight() > Pared.getY() && y < Pared.getY() + Pared.getHeight()) {
            return true;
        }
        if (x + Personaje.getWidth() > Pared1.getX() && x < Pared1.getX() + Pared1.getWidth()
                && y + Personaje.getHeight() > Pared1.getY() && y < Pared1.getY() + Pared1.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared2.getX() && x < Pared2.getX() + Pared2.getWidth()
                && y + Personaje.getHeight() > Pared2.getY() && y < Pared2.getY() + Pared2.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared3.getX() && x < Pared3.getX() + Pared3.getWidth()
                && y + Personaje.getHeight() > Pared3.getY() && y < Pared3.getY() + Pared3.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared4.getX() && x < Pared4.getX() + Pared4.getWidth()
                && y + Personaje.getHeight() > Pared4.getY() && y < Pared4.getY() + Pared4.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared5.getX() && x < Pared5.getX() + Pared5.getWidth()
                && y + Personaje.getHeight() > Pared5.getY() && y < Pared5.getY() + Pared5.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared6.getX() && x < Pared6.getX() + Pared6.getWidth()
                && y + Personaje.getHeight() > Pared6.getY() && y < Pared6.getY() + Pared6.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared7.getX() && x < Pared7.getX() + Pared7.getWidth()
                && y + Personaje.getHeight() > Pared7.getY() && y < Pared7.getY() + Pared7.getHeight()) {
            return true;
        }
        if (x + Personaje.getWidth() > Pared8.getX() && x < Pared8.getX() + Pared8.getWidth()
                && y + Personaje.getHeight() > Pared8.getY() && y < Pared8.getY() + Pared8.getHeight()) {
            return true;
        }
        if (x + Personaje.getWidth() > Pared9.getX() && x < Pared9.getX() + Pared9.getWidth()
                && y + Personaje.getHeight() > Pared9.getY() && y < Pared9.getY() + Pared9.getHeight()) {
            return true;
        }
        if (x + Personaje.getWidth() > Pared10.getX() && x < Pared10.getX() + Pared10.getWidth()
                && y + Personaje.getHeight() > Pared10.getY() && y < Pared10.getY() + Pared10.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared11.getX() && x < Pared11.getX() + Pared11.getWidth()
                && y + Personaje.getHeight() > Pared11.getY() && y < Pared11.getY() + Pared11.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared12.getX() && x < Pared12.getX() + Pared12.getWidth()
                && y + Personaje.getHeight() > Pared12.getY() && y < Pared12.getY() + Pared12.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared13.getX() && x < Pared13.getX() + Pared13.getWidth()
                && y + Personaje.getHeight() > Pared13.getY() && y < Pared13.getY() + Pared13.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared14.getX() && x < Pared14.getX() + Pared14.getWidth()
                && y + Personaje.getHeight() > Pared14.getY() && y < Pared14.getY() + Pared14.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared15.getX() && x < Pared15.getX() + Pared15.getWidth()
                && y + Personaje.getHeight() > Pared15.getY() && y < Pared15.getY() + Pared15.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared16.getX() && x < Pared16.getX() + Pared16.getWidth()
                && y + Personaje.getHeight() > Pared16.getY() && y < Pared16.getY() + Pared16.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared17.getX() && x < Pared17.getX() + Pared17.getWidth()
                && y + Personaje.getHeight() > Pared17.getY() && y < Pared17.getY() + Pared17.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared18.getX() && x < Pared18.getX() + Pared18.getWidth()
                && y + Personaje.getHeight() > Pared18.getY() && y < Pared18.getY() + Pared18.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared19.getX() && x < Pared19.getX() + Pared19.getWidth()
                && y + Personaje.getHeight() > Pared19.getY() && y < Pared19.getY() + Pared19.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared20.getX() && x < Pared20.getX() + Pared20.getWidth()
                && y + Personaje.getHeight() > Pared20.getY() && y < Pared20.getY() + Pared20.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared21.getX() && x < Pared21.getX() + Pared21.getWidth()
                && y + Personaje.getHeight() > Pared21.getY() && y < Pared21.getY() + Pared21.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared22.getX() && x < Pared22.getX() + Pared22.getWidth()
                && y + Personaje.getHeight() > Pared22.getY() && y < Pared22.getY() + Pared22.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared23.getX() && x < Pared23.getX() + Pared23.getWidth()
                && y + Personaje.getHeight() > Pared23.getY() && y < Pared23.getY() + Pared23.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared24.getX() && x < Pared24.getX() + Pared24.getWidth()
                && y + Personaje.getHeight() > Pared24.getY() && y < Pared24.getY() + Pared24.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared25.getX() && x < Pared25.getX() + Pared25.getWidth()
                && y + Personaje.getHeight() > Pared25.getY() && y < Pared25.getY() + Pared25.getHeight()) {
            return true; 
        }
        else if (x + Personaje.getWidth() > Pared26.getX() && x < Pared26.getX() + Pared26.getWidth()
                && y + Personaje.getHeight() > Pared26.getY() && y < Pared26.getY() + Pared26.getHeight()) {
            return true; 
        }

        return false;
    }
    
    private void verificarColisionGanar() {
        // Verificar si el personaje pasa por el panel de ganar
        if (Personaje.getBounds().intersects(Ganar.getBounds())) {
            JOptionPane.showMessageDialog(this, "¡Felicidades has ganado!: ", "Fin del juego", JOptionPane.INFORMATION_MESSAGE);
            reiniciarPosicionPersonaje();
            reiniciarPosicionEnemigo();
        }  
    }
    
    private void verificarColisionEnemigoGanar() {
        // Verificar si el personaje pasa por el panel de ganar
        if (Enemigo.getBounds().intersects(Ganar.getBounds())) {
            JOptionPane.showMessageDialog(this, "¡Felicidades el enemigo ha chocado!: ", "Fin del juego", JOptionPane.INFORMATION_MESSAGE);
            reiniciarPosicionPersonaje();
            reiniciarPosicionEnemigo();
        }  
    }
    
    private void verificarColisionEnemigo(){
        //Verifica si el personaje choco con el enemigo
        if (Personaje.getBounds().intersects(Enemigo.getBounds())) {
            // Colisión con el enemigo, terminar el juego
            JOptionPane.showMessageDialog(this, "¡Has chocado con el enemigo!", "Fin del juego", JOptionPane.INFORMATION_MESSAGE);
            reiniciarPosicionPersonaje();
            reiniciarPosicionEnemigo();
        }
    }
    
    private void verificarColisionEnemigoPersonaje(){
        //Verifica si el personaje choco con el enemigo
        if(Enemigo.getBounds().intersects(Personaje.getBounds())) {
            // Colisión con el enemigo, terminar el juego
            JOptionPane.showMessageDialog(this, "¡Te ha alcanzado el enemigo!", "Fin del juego", JOptionPane.INFORMATION_MESSAGE);
            reiniciarPosicionPersonaje();
            reiniciarPosicionEnemigo();
            
        }
        
    }
    
    private void reiniciarPosicionPersonaje() {
        Personaje.setLocation(X, Y);
    }
    private void reiniciarPosicionEnemigo() {
        Enemigo.setLocation(350, 350);
    }
    
    private boolean cColisionEnemigo(int x, int y) {
        // Checa las colisiones con la pared
        if (x + Enemigo.getWidth() > Pared.getX() && x < Pared.getX() + Pared.getWidth()
                && y + Enemigo.getHeight() > Pared.getY() && y < Pared.getY() + Pared.getHeight()) {
            return true;
        }
        if (x + Enemigo.getWidth() > Pared1.getX() && x < Pared1.getX() + Pared1.getWidth()
                && y + Enemigo.getHeight() > Pared1.getY() && y < Pared1.getY() + Pared1.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared2.getX() && x < Pared2.getX() + Pared2.getWidth()
                && y + Enemigo.getHeight() > Pared2.getY() && y < Pared2.getY() + Pared2.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared3.getX() && x < Pared3.getX() + Pared3.getWidth()
                && y + Enemigo.getHeight() > Pared3.getY() && y < Pared3.getY() + Pared3.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared4.getX() && x < Pared4.getX() + Pared4.getWidth()
                && y + Enemigo.getHeight() > Pared4.getY() && y < Pared4.getY() + Pared4.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared5.getX() && x < Pared5.getX() + Pared5.getWidth()
                && y + Enemigo.getHeight() > Pared5.getY() && y < Pared5.getY() + Pared5.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared6.getX() && x < Pared6.getX() + Pared6.getWidth()
                && y + Enemigo.getHeight() > Pared6.getY() && y < Pared6.getY() + Pared6.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared7.getX() && x < Pared7.getX() + Pared7.getWidth()
                && y + Enemigo.getHeight() > Pared7.getY() && y < Pared7.getY() + Pared7.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared8.getX() && x < Pared8.getX() + Pared8.getWidth()
                && y + Enemigo.getHeight() > Pared8.getY() && y < Pared8.getY() + Pared8.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared9.getX() && x < Pared9.getX() + Pared9.getWidth()
                && y + Enemigo.getHeight() > Pared9.getY() && y < Pared9.getY() + Pared9.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared10.getX() && x < Pared10.getX() + Pared10.getWidth()
                && y + Enemigo.getHeight() > Pared10.getY() && y < Pared10.getY() + Pared10.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared11.getX() && x < Pared11.getX() + Pared11.getWidth()
                && y + Enemigo.getHeight() > Pared11.getY() && y < Pared11.getY() + Pared11.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared12.getX() && x < Pared12.getX() + Pared12.getWidth()
                && y + Enemigo.getHeight() > Pared12.getY() && y < Pared12.getY() + Pared12.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared13.getX() && x < Pared13.getX() + Pared13.getWidth()
                && y + Enemigo.getHeight() > Pared13.getY() && y < Pared13.getY() + Pared13.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared14.getX() && x < Pared14.getX() + Pared14.getWidth()
                && y + Enemigo.getHeight() > Pared14.getY() && y < Pared14.getY() + Pared14.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared15.getX() && x < Pared15.getX() + Pared15.getWidth()
                && y + Enemigo.getHeight() > Pared15.getY() && y < Pared15.getY() + Pared15.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared16.getX() && x < Pared16.getX() + Pared16.getWidth()
                && y + Enemigo.getHeight() > Pared16.getY() && y < Pared16.getY() + Pared16.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared17.getX() && x < Pared17.getX() + Pared17.getWidth()
                && y + Enemigo.getHeight() > Pared17.getY() && y < Pared17.getY() + Pared17.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared18.getX() && x < Pared18.getX() + Pared18.getWidth()
                && y + Enemigo.getHeight() > Pared18.getY() && y < Pared18.getY() + Pared18.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared19.getX() && x < Pared19.getX() + Pared19.getWidth()
                && y + Enemigo.getHeight() > Pared19.getY() && y < Pared19.getY() + Pared19.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared20.getX() && x < Pared20.getX() + Pared20.getWidth()
                && y + Enemigo.getHeight() > Pared20.getY() && y < Pared20.getY() + Pared20.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared21.getX() && x < Pared21.getX() + Pared21.getWidth()
                && y + Enemigo.getHeight() > Pared21.getY() && y < Pared21.getY() + Pared21.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared22.getX() && x < Pared22.getX() + Pared22.getWidth()
                && y + Enemigo.getHeight() > Pared22.getY() && y < Pared22.getY() + Pared22.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared23.getX() && x < Pared23.getX() + Pared23.getWidth()
                && y + Enemigo.getHeight() > Pared23.getY() && y < Pared23.getY() + Pared23.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared24.getX() && x < Pared24.getX() + Pared24.getWidth()
                && y + Enemigo.getHeight() > Pared24.getY() && y < Pared24.getY() + Pared24.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared25.getX() && x < Pared25.getX() + Pared25.getWidth()
                && y + Enemigo.getHeight() > Pared25.getY() && y < Pared25.getY() + Pared25.getHeight()) {
            return true; 
        }
        else if(x + Enemigo.getWidth() > Pared26.getX() && x < Pared26.getX() + Pared26.getWidth()
                && y + Enemigo.getHeight() > Pared26.getY() && y < Pared26.getY() + Pared26.getHeight()) {
            return true; 
        }
        
        
        return false;
    }
}
