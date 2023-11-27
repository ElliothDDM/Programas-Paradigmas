
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
            Pared18,Pared19,Pared20,Pared21,Pared22,Pared23,Pared24,Pared25,Pared26,
            Pared27,Pared28,Pared29,Pared30,Pared31,Pared32,Pared33,Pared34,Pared35,Pared36,
            Pared37,Pared38,Pared39,Pared40,Pared41,Pared42,Pared43,Pared44,Pared45,Pared46,
            Pared47,Pared48,Pared49,Pared50,Pared51,Pared52,Pared53,Pared54,Pared55,Pared56,
            Pared57,Pared58,Pared59,Pared60,Pared61,Pared62,Pared64,Pared66,
            Pared67,Pared68,Pared69,Pared70,Pared71,Pared75,Pared76,Pared77,Pared78,Pared79,
            Pared80,Pared81,Pared82,Pared83,Pared84,Pared85,Pared86,Pared87,Pared88,Pared89,Pared90,Pared91,
            Pared92,Pared93,Pared94,Pared95,Pared96,Pared97,Pared98,Pared99,Pared100,Pared101,Pared102,Pared103,Pared104,
           Pared105,Pared106,Pared107,Pared108,Pared109,Pared110,Pared111,Pared112,Pared113,Pared114,Pared115,Pared116,
           Pared117,Pared118,Pared119,Pared120,Pared121,Pared122,Pared123,Pared124,Pared125,Pared126,Pared127,Pared128,
            Pared129,Pared130,Pared131,Pared132,Pared133,Pared134,Pared135,Pared136,Pared137,Pared138,Pared139,Pared140,
           Pared141,Pared142,Pared143,Pared144,Pared145,Pared146,Pared147,Pared148,Pared149,Pared150,Pared151,Pared152,
            Pared153,Pared154,Pared155,Pared156,Pared157,Pared158,Pared159,Pared160,Pared161,Pared162,Pared163,Pared164,Pared165,
            Pared166,Pared167,Pared168,Pared169,Pared170,Pared171,Pared172,Pared173,Pared174, Pared175,Pared176,Pared177,Pared178,
            Pared179,Pared180,Pared181,Pared182,Pared183;
    int X,Y;
    int speed = 10, speed2= 20;
    
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
        Enemigo.setBounds(350, 350, 45, 45);
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
        Personaje.setBounds(700, 5, 44, 44);
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
        
         
        Pared=new Panel();
        Pared.setLayout(null);
        Pared.setBounds(10,5,50,50);
        Pared.setBackground(Color.blue);
        Pared.setFocusable(true);
        Pared.requestFocusInWindow();
        this.add(Pared);
        Pared1=new Panel();
        Pared1.setLayout(null);
        Pared1.setBounds(10,50,50,50);
        Pared1.setBackground(Color.blue);
        Pared1.setFocusable(true);
        Pared1.requestFocusInWindow();
        this.add(Pared1);
        Pared2=new Panel();
        Pared2.setLayout(null);
        Pared2.setBounds(10,100,50,50);
        Pared2.setBackground(Color.blue);
        Pared2.setFocusable(true);
        Pared2.requestFocusInWindow();
        this.add(Pared2);
        Pared3=new Panel();
        Pared3.setLayout(null);
        Pared3.setBounds(10,150,50,50);
        Pared3.setBackground(Color.blue);
        Pared3.setFocusable(true);
        Pared3.requestFocusInWindow();
        this.add(Pared3);
        Pared4=new Panel();
        Pared4.setLayout(null);
        Pared4.setBounds(10,200,50,50);
        Pared4.setBackground(Color.blue);
        Pared4.setFocusable(true);
        Pared4.requestFocusInWindow();
        this.add(Pared4);
        Pared5=new Panel();
        Pared5.setLayout(null);
        Pared5.setBounds(10,250,50,50);
        Pared5.setBackground(Color.blue);
        Pared5.setFocusable(true);
        Pared5.requestFocusInWindow();
        this.add(Pared5);
        Pared6=new Panel();
        Pared6.setLayout(null);
        Pared6.setBounds(10,300,50,50);
        Pared6.setBackground(Color.black);
        Pared6.setFocusable(true);
        Pared6.requestFocusInWindow();
        this.add(Pared6);
        Pared7=new Panel();
        Pared7.setBounds(10,350,60,60);
        Pared7.setBackground(Color.blue);
        Pared7.setFocusable(true);
        Pared7.requestFocusInWindow();
        this.add(Pared7);
        Pared8=new Panel();
        Pared8.setLayout(null);
        Pared8.setBounds(10,400,50,50);
        Pared8.setBackground(Color.blue);
        Pared8.setFocusable(true);
        Pared8.requestFocusInWindow();
        this.add(Pared8);
        Pared9=new Panel();
        Pared9.setLayout(null);
        Pared9.setBounds(10,450,50,50);
        Pared9.setBackground(Color.blue);
        Pared9.setFocusable(true);
        Pared9.requestFocusInWindow();
        this.add(Pared9);
        Pared10=new Panel();
        Pared10.setLayout(null);
        Pared10.setBounds(10,500,50,50);
        Pared10.setBackground(Color.blue);
        Pared10.setFocusable(true);
        Pared10.requestFocusInWindow();
        this.add(Pared10);
        Pared11=new Panel();
        Pared11.setLayout(null);
        Pared11.setBounds(10,550,50,50);
        Pared11.setBackground(Color.blue);
        Pared11.setFocusable(true);
        Pared11.requestFocusInWindow();
        this.add(Pared11);
        Pared12=new Panel();
        Pared12.setLayout(null);
        Pared12.setBounds(10,600,50,50);
        Pared12.setBackground(Color.blue);
        Pared12.setFocusable(true);
        Pared12.requestFocusInWindow();
        this.add(Pared12);
        Pared13=new Panel();
        Pared13.setLayout(null);
        Pared13.setBounds(10,650,50,50);
        Pared13.setBackground(Color.blue);
        Pared13.setFocusable(true);
        Pared13.requestFocusInWindow();
        this.add(Pared13);
        
        Pared14=new Panel();
        Pared14.setLayout(null);
        Pared14.setBounds(70,5,50,50);
        Pared14.setBackground(Color.black);
        Pared14.setFocusable(true);
        Pared14.requestFocusInWindow();
        this.add(Pared14);
        Pared15=new Panel();
        Pared15.setLayout(null);
        Pared15.setBounds(70,65,50,50);
        Pared15.setBackground(Color.black);
        Pared15.setFocusable(true);
        Pared15.requestFocusInWindow();
        this.add(Pared15);
        Pared16=new Panel();
        Pared16.setLayout(null);
        Pared16.setBounds(70,100,50,50);
        Pared16.setBackground(Color.black);
        Pared16.setFocusable(true);
        Pared16.requestFocusInWindow();
        this.add(Pared16);
        Pared17=new Panel();
        Pared17.setLayout(null);
        Pared17.setBounds(70,150,50,50);
        Pared17.setBackground(Color.black);
        Pared17.setFocusable(true);
        Pared17.requestFocusInWindow();
        this.add(Pared17);
        Pared18=new Panel();
        Pared18.setLayout(null);
        Pared18.setBounds(70,200,50,50);
        Pared18.setBackground(Color.black);
        Pared18.setFocusable(true);
        Pared18.requestFocusInWindow();
        this.add(Pared18);
        Pared19=new Panel();
        Pared19.setLayout(null);
        Pared19.setBounds(70,250,50,50);
        Pared19.setBackground(Color.blue);
        Pared19.setFocusable(true);
        Pared19.requestFocusInWindow();
        this.add(Pared19);
        Pared20=new Panel();
        Pared20.setLayout(null);
        Pared20.setBounds(70,300,50,50);
        Pared20.setBackground(Color.black);
        Pared20.setFocusable(true);
        Pared20.requestFocusInWindow();
        this.add(Pared20);
        Pared21=new Panel();
        Pared21.setLayout(null);
        Pared21.setBounds(70,350,50,50);
        Pared21.setBackground(Color.blue);
        Pared21.setFocusable(true);
        Pared21.requestFocusInWindow();
        this.add(Pared21);
        Pared22=new Panel();
        Pared22.setLayout(null);
        Pared22.setBounds(70,400,50,50);
        Pared22.setBackground(Color.black);
        Pared22.setFocusable(true);
        Pared22.requestFocusInWindow();
        this.add(Pared22);
        Pared23=new Panel();
        Pared23.setLayout(null);
        Pared23.setBounds(70,450,50,50);
        Pared23.setBackground(Color.black);
        Pared23.setFocusable(true);
        Pared23.requestFocusInWindow();
        this.add(Pared23);
        Pared24=new Panel();
        Pared24.setLayout(null);
        Pared24.setBounds(70,500,50,50);
        Pared24.setBackground(Color.black);
        Pared24.setFocusable(true);
        Pared24.requestFocusInWindow();
        this.add(Pared24);
        Pared25=new Panel();
        Pared25.setLayout(null);
        Pared25.setBounds(70,550,50,50);
        Pared25.setBackground(Color.black);
        Pared25.setFocusable(true);
        Pared25.requestFocusInWindow();
        this.add(Pared25);
        Pared26=new Panel();
        Pared26.setLayout(null);
        Pared26.setBounds(70,600,50,50);
        Pared26.setBackground(Color.black);
        Pared26.setFocusable(true);
        Pared26.requestFocusInWindow();
        this.add(Pared26);
        
        Pared27=new Panel();
        Pared27.setLayout(null);
        Pared27.setBounds(130,5,50,50);
        Pared27.setBackground(Color.black);
        Pared27.setFocusable(true);
        Pared27.requestFocusInWindow();
        this.add(Pared27);
        Pared28=new Panel();
        Pared28.setLayout(null);
        Pared28.setBounds(130,50,50,50);
        Pared28.setBackground(Color.blue);
        Pared28.setFocusable(true);
        Pared28.requestFocusInWindow();
        this.add(Pared28);
        Pared29=new Panel();
        Pared29.setLayout(null);
        Pared29.setBounds(130,100,50,50);
        Pared29.setBackground(Color.black);
        Pared29.setFocusable(true);
        Pared29.requestFocusInWindow();
        this.add(Pared29);
        Pared30=new Panel();
        Pared30.setLayout(null);
        Pared30.setBounds(130,150,50,50);
        Pared30.setBackground(Color.blue);
        Pared30.setFocusable(true);
        Pared30.requestFocusInWindow();
        this.add(Pared30);
        Pared31=new Panel();
        Pared31.setBounds(130,200,50,50);
        Pared31.setBackground(Color.black);
        Pared31.setFocusable(true);
        Pared31.requestFocusInWindow();
        this.add(Pared31);
        Pared32=new Panel();
        Pared32.setLayout(null);
        Pared32.setBounds(130,250,50,50);
        Pared32.setBackground(Color.blue);
        Pared32.setFocusable(true);
        Pared32.requestFocusInWindow();
        this.add(Pared32);
        Pared33=new Panel();
        Pared33.setLayout(null);
        Pared33.setBounds(130,300,50,50);
        Pared33.setBackground(Color.black);
        Pared33.setFocusable(true);
        Pared33.requestFocusInWindow();
        this.add(Pared33);
        Pared34=new Panel();
        Pared34.setLayout(null);
        Pared34.setBounds(70,300,50,50);
        Pared34.setBackground(Color.black);
        Pared34.setFocusable(true);
        Pared34.requestFocusInWindow();
        this.add(Pared34);
        Pared35=new Panel();
        Pared35.setLayout(null);
        Pared35.setBounds(130,350,50,50);
        Pared35.setBackground(Color.blue);
        Pared35.setFocusable(true);
        Pared35.requestFocusInWindow();
        this.add(Pared35);
        Pared36=new Panel();
        Pared36.setLayout(null);
        Pared36.setBounds(130,400,50,50);
        Pared36.setBackground(Color.black);
        Pared36.setFocusable(true);
        Pared36.requestFocusInWindow();
        this.add(Pared36);
        Pared37=new Panel();
        Pared37.setLayout(null);
        Pared37.setBounds(130,450,50,50);
        Pared37.setBackground(Color.blue);
        Pared37.setFocusable(true);
        Pared37.requestFocusInWindow();
        this.add(Pared37);
        Pared38=new Panel();
        Pared38.setLayout(null);
        Pared38.setBounds(130,500,50,50);
        Pared38.setBackground(Color.black);
        Pared38.setFocusable(true);
        Pared38.requestFocusInWindow();
        this.add(Pared38);
        Pared39=new Panel();
        Pared39.setLayout(null);
        Pared39.setBounds(130,550,50,50);
        Pared39.setBackground(Color.blue);
        Pared39.setFocusable(true);
        Pared39.requestFocusInWindow();
        this.add(Pared39);
        Pared40=new Panel();
        Pared40.setLayout(null);
        Pared40.setBounds(130,600,50,50);
        Pared40.setBackground(Color.black);
        Pared40.setFocusable(true);
        Pared40.requestFocusInWindow();
        this.add(Pared40);
        
        Pared41=new Panel();
        Pared41.setLayout(null);
        Pared41.setBounds(190,5,50,50);
        Pared41.setBackground(Color.black);
        Pared41.setFocusable(true);
        Pared41.requestFocusInWindow();
        this.add(Pared41);
        Pared42=new Panel();
        Pared42.setLayout(null);
        Pared42.setBounds(190,50,50,50);
        Pared42.setBackground(Color.black);
        Pared42.setFocusable(true);
        Pared42.requestFocusInWindow();
        this.add(Pared42);
        Pared43=new Panel();
        Pared43.setLayout(null);
        Pared43.setBounds(190,100,50,50);
        Pared43.setBackground(Color.black);
        Pared43.setFocusable(true);
        Pared43.requestFocusInWindow();
        this.add(Pared43);
        Pared44=new Panel();
        Pared44.setLayout(null);
        Pared44.setBounds(190,150,50,50);
        Pared44.setBackground(Color.black);
        Pared44.setFocusable(true);
        Pared44.requestFocusInWindow();
        this.add(Pared44);
        Pared45=new Panel();
        Pared45.setLayout(null);
        Pared45.setBounds(190,200,50,50);
        Pared45.setBackground(Color.black);
        Pared45.setFocusable(true);
        Pared45.requestFocusInWindow();
        this.add(Pared45);
        Pared46=new Panel();
        Pared46.setLayout(null);
        Pared46.setBounds(190,250,50,50);
        Pared46.setBackground(Color.black);
        Pared46.setFocusable(true);
        Pared46.requestFocusInWindow();
        this.add(Pared46);
        Pared47=new Panel();
        Pared47.setLayout(null);
        Pared47.setBounds(190,300,50,50);
        Pared47.setBackground(Color.black);
        Pared47.setFocusable(true);
        Pared47.requestFocusInWindow();
        this.add(Pared47);
        Pared48=new Panel();
        Pared48.setLayout(null);
        Pared48.setBounds(190,350,50,50);
        Pared48.setBackground(Color.black);
        Pared48.setFocusable(true);
        Pared48.requestFocusInWindow();
        this.add(Pared48);
        Pared49=new Panel();
        Pared49.setLayout(null);
        Pared49.setBounds(190,400,50,50);
        Pared49.setBackground(Color.black);
        Pared49.setFocusable(true);
        Pared49.requestFocusInWindow();
        this.add(Pared49);
        Pared50=new Panel();
        Pared50.setLayout(null);
        Pared50.setBounds(190,450,50,50);
        Pared50.setBackground(Color.black);
        Pared50.setFocusable(true);
        Pared50.requestFocusInWindow();
        this.add(Pared50);
        Pared51=new Panel();
        Pared51.setLayout(null);
        Pared51.setBounds(190,500,50,50);
        Pared51.setBackground(Color.black);
        Pared51.setFocusable(true);
        Pared51.requestFocusInWindow();
        this.add(Pared51);
        Pared52=new Panel();
        Pared52.setLayout(null);
        Pared52.setBounds(190,550,50,50);
        Pared52.setBackground(Color.black);
        Pared52.setFocusable(true);
        Pared52.requestFocusInWindow();
        this.add(Pared52);
        Pared53=new Panel();
        Pared53.setLayout(null);
        Pared53.setBounds(190,600,50,50);
        Pared53.setBackground(Color.black);
        Pared53.setFocusable(true);
        Pared53.requestFocusInWindow();
        this.add(Pared53);
        
        Pared54=new Panel();
        Pared54.setLayout(null);
        Pared54.setBounds(250,5,50,50);
        Pared54.setBackground(Color.black);
        Pared54.setFocusable(true);
        Pared54.requestFocusInWindow();
        this.add(Pared54);
        Pared55=new Panel();
        Pared55.setLayout(null);
        Pared55.setBounds(250,50,50,50);
        Pared55.setBackground(Color.blue);
        Pared55.setFocusable(true);
        Pared55.requestFocusInWindow();
        this.add(Pared55);
        Pared56=new Panel();
        Pared56.setLayout(null);
        Pared56.setBounds(250,100,50,50);
        Pared56.setBackground(Color.black);
        Pared56.setFocusable(true);
        Pared56.requestFocusInWindow();
        this.add(Pared56);
        Pared57=new Panel();
        Pared57.setLayout(null);
        Pared57.setBounds(250,150,50,50);
        Pared57.setBackground(Color.blue);
        Pared57.setFocusable(true);
        Pared57.requestFocusInWindow();
        this.add(Pared57);
        Pared58=new Panel();
        Pared58.setLayout(null);
        Pared58.setBounds(250,200,50,50);
        Pared58.setBackground(Color.black);
        Pared58.setFocusable(true);
        Pared58.requestFocusInWindow();
        this.add(Pared58);
        Pared59=new Panel();
        Pared59.setLayout(null);
        Pared59.setBounds(250,250,50,50);
        Pared59.setBackground(Color.blue);
        Pared59.setFocusable(true);
        Pared59.requestFocusInWindow();
        this.add(Pared59);
        Pared60=new Panel();
        Pared60.setLayout(null);
        Pared60.setBounds(250,300,50,50);
        Pared60.setBackground(Color.blue);
        Pared60.setFocusable(true);
        Pared60.requestFocusInWindow();
        this.add(Pared60);
        Pared61=new Panel();
        Pared61.setLayout(null);
        Pared61.setBounds(250,350,50,50);
        Pared61.setBackground(Color.blue);
        Pared61.setFocusable(true);
        Pared61.requestFocusInWindow();
        this.add(Pared61);
        Pared62=new Panel();
        Pared62.setLayout(null);
        Pared62.setBounds(250,400,50,50);
        Pared62.setBackground(Color.black);
        Pared62.setFocusable(true);
        Pared62.requestFocusInWindow();
        this.add(Pared62);
         Pared64=new Panel();
        Pared64.setLayout(null);
        Pared64.setBounds(250,500,50,50);
        Pared64.setBackground(Color.black);
        Pared64.setFocusable(true);
        Pared64.requestFocusInWindow();
        this.add(Pared64);
        Pared66=new Panel();
        Pared66.setLayout(null);
        Pared66.setBounds(250,600,50,50);
        Pared66.setBackground(Color.black);
        Pared66.setFocusable(true);
        Pared66.requestFocusInWindow();
        this.add(Pared66);
        
        Pared67=new Panel();
        Pared67.setLayout(null);
        Pared67.setBounds(310,5,50,50);
        Pared67.setBackground(Color.black);
        Pared67.setFocusable(true);
        Pared67.requestFocusInWindow();
        this.add(Pared67);
        Pared68=new Panel();
        Pared68.setLayout(null);
        Pared68.setBounds(310,50,50,50);
        Pared68.setBackground(Color.blue);
        Pared68.setFocusable(true);
        Pared68.requestFocusInWindow();
        this.add(Pared68);
        Pared69=new Panel();
        Pared69.setLayout(null);
        Pared69.setBounds(310,100,50,50);
        Pared69.setBackground(Color.black);
        Pared69.setFocusable(true);
        Pared69.requestFocusInWindow();
        this.add(Pared69);
        Pared70=new Panel();
        Pared70.setLayout(null);
        Pared70.setBounds(310,150,50,50);
        Pared70.setBackground(Color.blue);
        Pared70.setFocusable(true);
        Pared70.requestFocusInWindow();
        this.add(Pared70);
        Pared71=new Panel();
        Pared71.setLayout(null);
        Pared71.setBounds(310,200,50,50);
        Pared71.setBackground(Color.black);
        Pared71.setFocusable(true);
        Pared71.requestFocusInWindow();
        this.add(Pared71);
        Pared75=new Panel();
        Pared75.setLayout(null);
        Pared75.setBounds(310,400,50,50);
        Pared75.setBackground(Color.black);
        Pared75.setFocusable(true);
        Pared75.requestFocusInWindow();
        this.add(Pared75);
        Pared76=new Panel();
        Pared76.setLayout(null);
        Pared76.setBounds(310,450,50,50);
        Pared76.setBackground(Color.blue);
        Pared76.setFocusable(true);
        Pared76.requestFocusInWindow();
        this.add(Pared76);
        Pared77=new Panel();
        Pared77.setLayout(null);
        Pared77.setBounds(310,500,50,50);
        Pared77.setBackground(Color.black);
        Pared77.setFocusable(true);
        Pared77.requestFocusInWindow();
        this.add(Pared77);
        Pared78=new Panel();
        Pared78.setLayout(null);
        Pared78.setBounds(310,550,50,50);
        Pared78.setBackground(Color.blue);
        Pared78.setFocusable(true);
        Pared78.requestFocusInWindow();
        this.add(Pared78);
        Pared79=new Panel();
        Pared79.setLayout(null);
        Pared79.setBounds(310,600,50,50);
        Pared79.setBackground(Color.black);
        Pared79.setFocusable(true);
        Pared79.requestFocusInWindow();
        this.add(Pared79);
        
        Pared80=new Panel();
        Pared80.setLayout(null);
        Pared80.setBounds(370,5,50,50);
        Pared80.setBackground(Color.black);
        Pared80.setFocusable(true);
        Pared80.requestFocusInWindow();
        this.add(Pared80);
        Pared81=new Panel();
        Pared81.setLayout(null);
        Pared81.setBounds(370,50,50,50);
        Pared81.setBackground(Color.black);
        Pared81.setFocusable(true);
        Pared81.requestFocusInWindow();
        this.add(Pared81);
        Pared82=new Panel();
        Pared82.setLayout(null);
        Pared82.setBounds(370,100,50,50);
        Pared82.setBackground(Color.black);
        Pared82.setFocusable(true);
        Pared82.requestFocusInWindow();
        this.add(Pared82);
        Pared83=new Panel();
        Pared83.setLayout(null);
        Pared83.setBounds(370,150,50,50);
        Pared83.setBackground(Color.black);
        Pared83.setFocusable(true);
        Pared83.requestFocusInWindow();
        this.add(Pared83);
        Pared84=new Panel();
        Pared84.setLayout(null);
        Pared84.setBounds(370,200,50,50);
        Pared84.setBackground(Color.black);
        Pared84.setFocusable(true);
        Pared84.requestFocusInWindow();
        this.add(Pared84);
        Pared85=new Panel();
        Pared85.setLayout(null);
        Pared85.setBounds(370,250,50,50);
        Pared85.setBackground(Color.black);
        Pared85.setFocusable(true);
        Pared85.requestFocusInWindow();
        this.add(Pared85);
        Pared86=new Panel();
        Pared86.setLayout(null);
        Pared86.setBounds(370,300,50,50);
        Pared86.setBackground(Color.black);
        Pared86.setFocusable(true);
        Pared86.requestFocusInWindow();
        this.add(Pared86);
        Pared87=new Panel();
        Pared87.setLayout(null);
        Pared87.setBounds(370,350,50,50);
        Pared87.setBackground(Color.black);
        Pared87.setFocusable(true);
        Pared87.requestFocusInWindow();
        this.add(Pared87);
        Pared88=new Panel();
        Pared88.setLayout(null);
        Pared88.setBounds(370,400,50,50);
        Pared88.setBackground(Color.black);
        Pared88.setFocusable(true);
        Pared88.requestFocusInWindow();
        this.add(Pared88);
        Pared89=new Panel();
        Pared89.setLayout(null);
        Pared89.setBounds(370,450,50,50);
        Pared89.setBackground(Color.black);
        Pared89.setFocusable(true);
        Pared89.requestFocusInWindow();
        this.add(Pared89);
        Pared90=new Panel();
        Pared90.setLayout(null);
        Pared90.setBounds(370,500,50,50);
        Pared90.setBackground(Color.black);
        Pared90.setFocusable(true);
        Pared90.requestFocusInWindow();
        this.add(Pared90);
        Pared91=new Panel();
        Pared91.setLayout(null);
        Pared91.setBounds(370,550,50,50);
        Pared91.setBackground(Color.black);
        Pared91.setFocusable(true);
        Pared91.requestFocusInWindow();
        this.add(Pared91);
        Pared92=new Panel();
        Pared92.setLayout(null);
        Pared92.setBounds(370,600,50,50);
        Pared92.setBackground(Color.black);
        Pared92.setFocusable(true);
        Pared92.requestFocusInWindow();
        this.add(Pared92);
        
        Pared93=new Panel();
        Pared93.setLayout(null);
        Pared93.setBounds(430,5,50,50);
        Pared93.setBackground(Color.blue);
        Pared93.setFocusable(true);
        Pared93.requestFocusInWindow();
        this.add(Pared93);
        Pared94=new Panel();
        Pared94.setLayout(null);
        Pared94.setBounds(430,50,50,50);
        Pared94.setBackground(Color.blue);
        Pared94.setFocusable(true);
        Pared94.requestFocusInWindow();
        this.add(Pared94);
        Pared95=new Panel();
        Pared95.setLayout(null);
        Pared95.setBounds(430,100,50,50);
        Pared95.setBackground(Color.black);
        Pared95.setFocusable(true);
        Pared95.requestFocusInWindow();
        this.add(Pared95);
        Pared96=new Panel();
        Pared96.setLayout(null);
        Pared96.setBounds(430,150,50,50);
        Pared96.setBackground(Color.blue);
        Pared96.setFocusable(true);
        Pared96.requestFocusInWindow();
        this.add(Pared96);
        Pared97=new Panel();
        Pared97.setLayout(null);
        Pared97.setBounds(430,200,50,50);
        Pared97.setBackground(Color.black);
        Pared97.setFocusable(true);
        Pared97.requestFocusInWindow();
        this.add(Pared97);
        Pared98=new Panel();
        Pared98.setLayout(null);
        Pared98.setBounds(430,250,50,50);
        Pared98.setBackground(Color.black);
        Pared98.setFocusable(true);
        Pared98.requestFocusInWindow();
        this.add(Pared98);
        Pared99=new Panel();
        Pared99.setLayout(null);
        Pared99.setBounds(430,300,50,50);
        Pared99.setBackground(Color.black);
        Pared99.setFocusable(true);
        Pared99.requestFocusInWindow();
        this.add(Pared99);
        Pared100=new Panel();
        Pared100.setLayout(null);       
        Pared100.setBounds(430,350,50,50);
        Pared100.setBackground(Color.black);
        Pared100.setFocusable(true);
        Pared100.requestFocusInWindow();
        this.add(Pared100);
        Pared101=new Panel();
        Pared101.setLayout(null); 
        Pared101.setBounds(430,400,50,50);
        Pared101.setBackground(Color.black);
        Pared101.setFocusable(true);
        Pared101.requestFocusInWindow();
        this.add(Pared101);
        Pared102=new Panel();
        Pared102.setLayout(null);
        Pared102.setBounds(430,450,50,50);
        Pared102.setBackground(Color.blue);
        Pared102.setFocusable(true);
        Pared102.requestFocusInWindow();
        this.add(Pared102);
        Pared103=new Panel();
        Pared103.setLayout(null);
        Pared103.setBounds(430,500,50,50);
        Pared103.setBackground(Color.black);
        Pared103.setFocusable(true);
        Pared103.requestFocusInWindow();
        this.add(Pared103);
        Pared104=new Panel();
        Pared104.setLayout(null);
        Pared104.setBounds(430,550,50,50);
        Pared104.setBackground(Color.blue);
        Pared104.setFocusable(true);
        Pared104.requestFocusInWindow();
        this.add(Pared104);
        Pared105=new Panel();
        Pared105.setLayout(null);
        Pared105.setBounds(430,600,50,50);
        Pared105.setBackground(Color.blue);
        Pared105.setFocusable(true);
        Pared105.requestFocusInWindow();
        this.add(Pared105);
        
        Pared106=new Panel();
        Pared106.setLayout(null);
        Pared106.setBounds(490,5,50,50);
        Pared106.setBackground(Color.black);
        Pared106.setFocusable(true);
        Pared106.requestFocusInWindow();
        this.add(Pared106);
        Pared107=new Panel();
        Pared107.setLayout(null);
        Pared107.setBounds(490,50,50,50);
        Pared107.setBackground(Color.black);
        Pared107.setFocusable(true);
        Pared107.requestFocusInWindow();
        this.add(Pared107);
        Pared108=new Panel();
        Pared108.setLayout(null);
        Pared108.setBounds(490,100,50,50);
        Pared108.setBackground(Color.black);
        Pared108.setFocusable(true);
        Pared108.requestFocusInWindow();
        this.add(Pared108);
        Pared109=new Panel();
        Pared109.setLayout(null);
        Pared109.setBounds(490,150,50,50);
        Pared109.setBackground(Color.black);
        Pared109.setFocusable(true);
        Pared109.requestFocusInWindow();
        this.add(Pared109);
        Pared110=new Panel();
        Pared110.setLayout(null);
        Pared110.setBounds(490,200,50,50);
        Pared110.setBackground(Color.black);
        Pared110.setFocusable(true);
        Pared110.requestFocusInWindow();
        this.add(Pared110);
        Pared111=new Panel();
        Pared111.setLayout(null);
        Pared111.setBounds(490,250,50,50);
        Pared111.setBackground(Color.black);
        Pared111.setFocusable(true);
        Pared111.requestFocusInWindow();
        this.add(Pared111);
        Pared112=new Panel();
        Pared112.setLayout(null);
        Pared112.setBounds(490,300,50,50);
        Pared112.setBackground(Color.black);
        Pared112.setFocusable(true);
        Pared112.requestFocusInWindow();
        this.add(Pared112);
        Pared113=new Panel();
        Pared113.setLayout(null);
        Pared113.setBounds(490,350,50,50);
        Pared113.setBackground(Color.black);
        Pared113.setFocusable(true);
        Pared113.requestFocusInWindow();
        Pared113.requestFocusInWindow();
        this.add(Pared113);
        Pared114=new Panel();
        Pared114.setLayout(null);
        Pared114.setBounds(490,400,50,50);
        Pared114.setBackground(Color.black);
        Pared114.setFocusable(true);
        Pared114.requestFocusInWindow();
        this.add(Pared114);
        Pared115=new Panel();
        Pared115.setLayout(null);
        Pared115.setBounds(490,450,50,50);
        Pared115.setBackground(Color.black);
        Pared115.setFocusable(true);
        Pared115.requestFocusInWindow();
        this.add(Pared115);
        Pared116=new Panel();
        Pared116.setLayout(null);
        Pared116.setBounds(490,500,50,50);
        Pared116.setBackground(Color.black);
        Pared116.setFocusable(true);
        Pared116.requestFocusInWindow();
        this.add(Pared116);
        Pared117=new Panel();
        Pared117.setLayout(null);
        Pared117.setBounds(490,550,50,50);
        Pared117.setBackground(Color.black);
        Pared117.setFocusable(true);
        Pared117.requestFocusInWindow();
        this.add(Pared117);
        Pared118=new Panel();
        Pared118.setLayout(null);
        Pared118.setBounds(490,600,50,50);
        Pared118.setBackground(Color.black);
        Pared118.setFocusable(true);
        Pared118.requestFocusInWindow();
        this.add(Pared118);
        
        Pared119=new Panel();
        Pared119.setLayout(null);
        Pared119.setBounds(550,5,50,50);
        Pared119.setBackground(Color.black);
        Pared119.setFocusable(true);
        Pared119.requestFocusInWindow();
        this.add(Pared119);
        Pared120=new Panel();
        Pared120.setLayout(null);
        Pared120.setBounds(550,50,50,50);
        Pared120.setBackground(Color.blue);
        Pared120.setFocusable(true);
        Pared120.requestFocusInWindow();
        this.add(Pared120);
        Pared121=new Panel();
        Pared121.setLayout(null);
        Pared121.setBounds(550,100,50,50);
        Pared121.setBackground(Color.black);
        Pared121.setFocusable(true);
        Pared121.requestFocusInWindow();
        this.add(Pared121);
        Pared122=new Panel();
        Pared122.setLayout(null);
        Pared122.setBounds(550,150,50,50);
        Pared122.setBackground(Color.blue);
        Pared122.setFocusable(true);
        Pared122.requestFocusInWindow();
        this.add(Pared122);
        Pared123=new Panel();
        Pared123.setLayout(null);
        Pared123.setBounds(550,200,50,50);
        Pared123.setBackground(Color.black);
        Pared123.setFocusable(true);
        Pared123.requestFocusInWindow();
        this.add(Pared123);
        Pared124=new Panel();
        Pared124.setLayout(null);
        Pared124.setBounds(550,250,50,50);
        Pared124.setBackground(Color.blue);
        Pared124.setFocusable(true);
        Pared124.requestFocusInWindow();
        this.add(Pared124);
        Pared125=new Panel();
        Pared125.setLayout(null);
        Pared125.setBounds(550,300,50,50);
        Pared125.setBackground(Color.blue);
        Pared125.setFocusable(true);
        Pared125.requestFocusInWindow();
        this.add(Pared125);
        Pared126=new Panel();
        Pared126.setLayout(null);
        Pared126.setBounds(550,350,50,50);
        Pared126.setBackground(Color.blue);
        Pared126.setFocusable(true);
        Pared126.requestFocusInWindow();
        this.add(Pared126);
        Pared127=new Panel();
        Pared127.setLayout(null);
        Pared127.setBounds(550,400,50,50);
        Pared127.setBackground(Color.black);
        Pared127.setFocusable(true);
        Pared127.requestFocusInWindow();
        this.add(Pared127);
        Pared128=new Panel();
        Pared128.setLayout(null);
        Pared128.setBounds(550,450,50,50);
        Pared128.setBackground(Color.blue);
        Pared128.setFocusable(true);
        Pared128.requestFocusInWindow();
        this.add(Pared128);
        Pared129=new Panel();
        Pared129.setLayout(null);
        Pared129.setBounds(550,500,50,50);
        Pared129.setBackground(Color.black);
        Pared129.setFocusable(true);
        Pared129.requestFocusInWindow();
        this.add(Pared129);
        Pared130=new Panel();
        Pared130.setLayout(null);
        Pared130.setBounds(550,550,50,50);
        Pared130.setBackground(Color.blue);
        Pared130.setFocusable(true);
        Pared130.requestFocusInWindow();
        this.add(Pared130);
        Pared131=new Panel();
        Pared131.setLayout(null);
        Pared131.setBounds(550,600,50,50);
        Pared131.setBackground(Color.black);
        Pared131.setFocusable(true);
        Pared131.requestFocusInWindow();
        this.add(Pared131);
        
        Pared132=new Panel();
        Pared132.setLayout(null);
        Pared132.setBounds(610,5,50,50); 
        Pared132.setBackground(Color.black);
        Pared132.setFocusable(true);
        Pared132.requestFocusInWindow();
        this.add(Pared132);
        Pared133=new Panel();
        Pared133.setLayout(null);
        Pared133.setBounds(610,50,50,50);
        Pared133.setBackground(Color.black);
        Pared133.setFocusable(true);
        Pared133.requestFocusInWindow();
        this.add(Pared133);
        Pared134=new Panel();
        Pared134.setLayout(null);
        Pared134.setBounds(610,100,50,50);
        Pared134.setBackground(Color.black);
        Pared134.setFocusable(true);
        Pared134.requestFocusInWindow();
        this.add(Pared134);
        Pared135=new Panel();
        Pared135.setLayout(null);
        Pared135.setBounds(610,150,50,50);
        Pared135.setBackground(Color.black);
        Pared135.setFocusable(true);
        Pared135.requestFocusInWindow();
        this.add(Pared135);
        Pared136=new Panel();
        Pared136.setLayout(null);
        Pared136.setBounds(610,200,50,50);
        Pared136.setBackground(Color.black);
        Pared136.setFocusable(true);
        Pared136.requestFocusInWindow();
        this.add(Pared136);
        Pared137=new Panel();
        Pared137.setLayout(null);
        Pared137.setBounds(610,250,50,50);
        Pared137.setBackground(Color.blue);
        Pared137.setFocusable(true);
        Pared137.requestFocusInWindow();
        this.add(Pared137);
        Pared138=new Panel();
        Pared138.setLayout(null);
        Pared138.setBounds(610,300,50,50);
        Pared138.setBackground(Color.black);
        Pared138.setFocusable(true);
        Pared138.requestFocusInWindow();
        this.add(Pared138);
        Pared139=new Panel();
        Pared139.setLayout(null);
        Pared139.setBounds(610,350,50,50);
        Pared139.setBackground(Color.black);
        Pared139.setFocusable(true);
        Pared139.requestFocusInWindow();
        this.add(Pared139);
        Pared140=new Panel();
        Pared140.setLayout(null);
        Pared140.setBounds(610,400,50,50);
        Pared140.setBackground(Color.black);
        Pared140.setFocusable(true);
        Pared140.requestFocusInWindow();
        this.add(Pared140);
        Pared141=new Panel();
        Pared141.setLayout(null);
        Pared141.setBounds(610,450,50,50);
        Pared141.setBackground(Color.black);
        Pared141.setFocusable(true);
        Pared141.requestFocusInWindow();
        this.add(Pared141);
        Pared142=new Panel();
        Pared142.setLayout(null);
        Pared142.setBounds(610,500,50,50);
        Pared142.setBackground(Color.black);
        Pared142.setFocusable(true);
        Pared142.requestFocusInWindow();
        this.add(Pared142);
        Pared143=new Panel();
        Pared143.setLayout(null);
        Pared143.setBounds(610,550,50,50);
        Pared143.setBackground(Color.black);
        Pared143.setFocusable(true);
        Pared143.requestFocusInWindow();
        this.add(Pared143);
        Pared144=new Panel();
        Pared144.setLayout(null);
        Pared144.setBounds(610,600,50,50);
        Pared144.setBackground(Color.black);
        Pared144.setFocusable(true);
        Pared144.requestFocusInWindow();
        this.add(Pared144);
        
        Pared145=new Panel();
        Pared145.setLayout(null);
        Pared145.setBounds(670,5,50,50);
        Pared145.setBackground(Color.black);
        Pared145.setFocusable(true);
        Pared145.requestFocusInWindow();
        this.add(Pared145);
        Pared146=new Panel();
        Pared146.setLayout(null);
        Pared146.setBounds(670,50,50,50);
        Pared146.setBackground(Color.blue);
        Pared146.setFocusable(true);
        Pared146.requestFocusInWindow();
        this.add(Pared146);
        Pared147=new Panel();
        Pared10.setLayout(null);
        Pared147.setBounds(670,100,50,50);
        Pared147.setBackground(Color.black);
        Pared147.setFocusable(true);
        Pared147.requestFocusInWindow();
        this.add(Pared147);
        Pared148=new Panel();
        Pared148.setLayout(null);
        Pared148.setBounds(670,150,50,50);
        Pared148.setBackground(Color.blue);
        Pared148.setFocusable(true);
        Pared148.requestFocusInWindow();
        this.add(Pared148);
        Pared149=new Panel();
        Pared149.setLayout(null);
        Pared149.setBounds(670,200,50,50);
        Pared149.setBackground(Color.black);
        Pared149.setFocusable(true);
        Pared149.requestFocusInWindow();
        this.add(Pared149);
        Pared150=new Panel();
        Pared150.setLayout(null);
        Pared150.setBounds(670,250,50,50);
        Pared150.setBackground(Color.blue);
        Pared150.setFocusable(true);
        Pared150.requestFocusInWindow();
        this.add(Pared150);
        Pared151=new Panel();
        Pared151.setLayout(null);
        Pared151.setBounds(670,300,50,50);
        Pared151.setBackground(Color.black);
        Pared151.setFocusable(true);
        Pared151.requestFocusInWindow();
        this.add(Pared151);
        Pared152=new Panel();
        Pared152.setLayout(null);
        Pared152.setBounds(670,350,50,50);
        Pared152.setBackground(Color.blue);
        Pared152.setFocusable(true);
        Pared152.requestFocusInWindow();
        this.add(Pared152);
        Pared153=new Panel();
        Pared153.setLayout(null);
        Pared153.setBounds(670,400,50,50);
        Pared153.setBackground(Color.black);
        Pared153.setFocusable(true);
        Pared153.requestFocusInWindow();
        this.add(Pared153);
        Pared154=new Panel();
        Pared154.setLayout(null);
        Pared154.setBounds(670,450,50,50);
        Pared154.setBackground(Color.blue);
        Pared154.setFocusable(true);
        Pared154.requestFocusInWindow();
        this.add(Pared154);
        Pared155=new Panel();
        Pared155.setLayout(null);
        Pared155.setBounds(670,500,50,50);
        Pared155.setBackground(Color.black);
        Pared155.setFocusable(true);
        Pared155.requestFocusInWindow();
        this.add(Pared155);
        Pared156=new Panel();
        Pared156.setLayout(null);
        Pared156.setBounds(670,550,50,50);
        Pared156.setBackground(Color.blue);
        Pared156.setFocusable(true);
        Pared156.requestFocusInWindow();
        this.add(Pared156);
        Pared157=new Panel();
        Pared10.setLayout(null);
        Pared157.setBounds(670,600,50,50);
        Pared157.setBackground(Color.black);
        Pared157.setFocusable(true);
        Pared157.requestFocusInWindow();
        this.add(Pared157);
        
        Pared158=new Panel();
        Pared158.setLayout(null);
        Pared158.setBounds(730,5,50,50);
        Pared158.setBackground(Color.black);
        Pared158.setFocusable(true);
        Pared158.requestFocusInWindow();
        this.add(Pared158);
        Pared159=new Panel();
        Pared159.setLayout(null);
        Pared159.setBounds(730,50,50,50);
        Pared159.setBackground(Color.black);
        Pared159.setFocusable(true);
        Pared159.requestFocusInWindow();
        this.add(Pared159);
        Pared160=new Panel();
        Pared160.setLayout(null);
        Pared160.setBounds(730,100,50,50);
        Pared160.setBackground(Color.black);
        Pared160.setFocusable(true);
        Pared160.requestFocusInWindow();
        this.add(Pared160);
        Pared161=new Panel();
        Pared161.setLayout(null);
        Pared161.setBounds(730,150,50,50);
        Pared161.setBackground(Color.black);
        Pared161.setFocusable(true);
        Pared161.requestFocusInWindow();
        this.add(Pared161);
        Pared162=new Panel();
        Pared162.setLayout(null);
        Pared162.setBounds(730,200,50,50);
        Pared162.setBackground(Color.black);
        Pared162.setFocusable(true);
        Pared162.requestFocusInWindow();
        this.add(Pared162);
        Pared163=new Panel();
        Pared163.setLayout(null);
        Pared163.setBounds(730,250,50,50);
        Pared163.setBackground(Color.black);
        Pared163.setFocusable(true);
        Pared163.requestFocusInWindow();
        this.add(Pared163);
        Pared164=new Panel();
        Pared164.setLayout(null);
        Pared164.setBounds(730,300,50,50);
        Pared164.setBackground(Color.black);
        Pared164.setFocusable(true);
        Pared164.requestFocusInWindow();
        this.add(Pared164);
        Pared165=new Panel();
        Pared165.setLayout(null);
        Pared165.setBounds(730,350,50,50);
        Pared165.setBackground(Color.blue);
        Pared165.setFocusable(true);
        Pared165.requestFocusInWindow();
        this.add(Pared165);
        Pared166=new Panel();
        Pared166.setLayout(null);
        Pared166.setBounds(730,400,50,50);
        Pared166.setBackground(Color.black);
        Pared166.setFocusable(true);
        Pared166.requestFocusInWindow();
        this.add(Pared166);
        Pared167=new Panel();
        Pared167.setLayout(null);
        Pared167.setBounds(730,450,50,50);
        Pared167.setBackground(Color.black);
        Pared167.setFocusable(true);
        Pared167.requestFocusInWindow();
        this.add(Pared167);
        Pared168=new Panel();
        Pared168.setLayout(null);
        Pared168.setBounds(730,500,50,50);
        Pared168.setBackground(Color.black);
        Pared168.setFocusable(true);
        Pared168.requestFocusInWindow();
        this.add(Pared168);
        Pared169=new Panel();
        Pared169.setLayout(null);
        Pared169.setBounds(730,550,50,50);
        Pared169.setBackground(Color.black);
        Pared169.setFocusable(true);
        Pared169.requestFocusInWindow();
        this.add(Pared169);
        Pared170=new Panel();
        Pared170.setLayout(null);
        Pared170.setBounds(730,600,50,50);
        Pared170.setBackground(Color.black);
        Pared170.setFocusable(true);
        Pared170.requestFocusInWindow();
        this.add(Pared170);
        
        Pared171=new Panel();
        Pared171.setLayout(null);
        Pared71.setBounds(790,5,50,50);
        Pared171.setBackground(Color.blue);
        Pared171.setFocusable(true);
        Pared171.requestFocusInWindow();
        this.add(Pared171);
        Pared172=new Panel();
        Pared172.setLayout(null);
        Pared172.setBounds(790,50,50,50);
        Pared172.setBackground(Color.blue);
        Pared172.setFocusable(true);
        Pared172.requestFocusInWindow();
        this.add(Pared172);
        Pared173=new Panel();
        Pared173.setLayout(null);
        Pared173.setBounds(790,100,50,50);
        Pared173.setBackground(Color.blue);
        Pared173.setFocusable(true);
        Pared173.requestFocusInWindow();
        this.add(Pared173);
        Pared174=new Panel();
        Pared174.setLayout(null);
        Pared174.setBounds(790,150,50,50);
        Pared174.setBackground(Color.blue);
        Pared174.setFocusable(true);
        Pared174.requestFocusInWindow();
        this.add(Pared174);
        Pared175=new Panel();
        Pared175.setLayout(null);
        Pared175.setBounds(790,200,50,50);
        Pared175.setBackground(Color.blue);
        Pared175.setFocusable(true);
        Pared175.requestFocusInWindow();
        this.add(Pared175);
        Pared176=new Panel();
        Pared176.setLayout(null);
        Pared176.setBounds(790,250,50,50);
        Pared176.setBackground(Color.blue);
        Pared176.setFocusable(true);
        Pared176.requestFocusInWindow();
        this.add(Pared176);
        Pared177=new Panel();
        Pared177.setLayout(null);
        Pared177.setBounds(790,300,50,50);
        Pared177.setBackground(Color.black);
        Pared177.setFocusable(true);
        Pared177.requestFocusInWindow();
        this.add(Pared177);
        Pared178=new Panel();
        Pared178.setLayout(null);
        Pared178.setBounds(790,350,50,50);
        Pared178.setBackground(Color.blue);
        Pared178.setFocusable(true);
        Pared178.requestFocusInWindow();
        this.add(Pared178);
        Pared179=new Panel();
        Pared179.setLayout(null);
        Pared179.setBounds(790,400,50,50);
        Pared179.setBackground(Color.blue);
        Pared179.setFocusable(true);
        Pared179.requestFocusInWindow();
        this.add(Pared179);
        Pared180=new Panel();
        Pared180.setLayout(null);
        Pared180.setBounds(790,450,50,50);
        Pared180.setBackground(Color.blue);
        Pared180.setFocusable(true);
        Pared180.requestFocusInWindow();
        this.add(Pared180);
        Pared181=new Panel();
        Pared181.setLayout(null);
        Pared181.setBounds(790,500,50,50);
        Pared181.setBackground(Color.blue);
        Pared181.setFocusable(true);
        Pared181.requestFocusInWindow();
        this.add(Pared181);
        Pared182=new Panel();
        Pared182.setLayout(null);
        Pared182.setBounds(790,550,50,50);
        Pared182.setBackground(Color.blue);
        Pared182.setFocusable(true);
        Pared182.requestFocusInWindow();
        this.add(Pared182);
        Pared183=new Panel();
        Pared183.setLayout(null);
        Pared183.setBounds(790,600,50,50);
        Pared183.setBackground(Color.blue);
        Pared183.setFocusable(true);
        Pared183.requestFocusInWindow();
        this.add(Pared183);
        
        
        Ganar = new Panel();
        Ganar.setLayout(null);
        Ganar.setBounds(800, 700, 30, 30); // Ajusta la ubicación y el tamaño según sea necesario
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
        Limite.setBounds(0,0,850, 750);
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
        if (x + Personaje.getWidth() > Pared19.getX() && x < Pared19.getX() + Pared19.getWidth()
                && y + Personaje.getHeight() > Pared19.getY() && y < Pared19.getY() + Pared19.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared21.getX() && x < Pared21.getX() + Pared21.getWidth()
                && y + Personaje.getHeight() > Pared21.getY() && y < Pared21.getY() + Pared21.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared28.getX() && x < Pared28.getX() + Pared28.getWidth()
                && y + Personaje.getHeight() > Pared28.getY() && y < Pared28.getY() + Pared28.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared30.getX() && x < Pared30.getX() + Pared30.getWidth()
                && y + Personaje.getHeight() > Pared30.getY() && y < Pared30.getY() + Pared30.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared32.getX() && x < Pared32.getX() + Pared32.getWidth()
                && y + Personaje.getHeight() > Pared32.getY() && y < Pared32.getY() + Pared32.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared35.getX() && x < Pared35.getX() + Pared35.getWidth()
                && y + Personaje.getHeight() > Pared35.getY() && y < Pared35.getY() + Pared35.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared37.getX() && x < Pared37.getX() + Pared37.getWidth()
                && y + Personaje.getHeight() > Pared37.getY() && y < Pared37.getY() + Pared37.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared39.getX() && x < Pared39.getX() + Pared39.getWidth()
                && y + Personaje.getHeight() > Pared39.getY() && y < Pared39.getY() + Pared39.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared55.getX() && x < Pared55.getX() + Pared55.getWidth()
                && y + Personaje.getHeight() > Pared55.getY() && y < Pared55.getY() + Pared55.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared57.getX() && x < Pared57.getX() + Pared57.getWidth()
                && y + Personaje.getHeight() > Pared57.getY() && y < Pared57.getY() + Pared57.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared59.getX() && x < Pared59.getX() + Pared59.getWidth()
                && y + Personaje.getHeight() > Pared59.getY() && y < Pared59.getY() + Pared59.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared60.getX() && x < Pared60.getX() + Pared60.getWidth()
                && y + Personaje.getHeight() > Pared60.getY() && y < Pared60.getY() + Pared60.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared61.getX() && x < Pared61.getX() + Pared61.getWidth()
                && y + Personaje.getHeight() > Pared61.getY() && y < Pared61.getY() + Pared61.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared62.getX() && x < Pared62.getX() + Pared62.getWidth()
                && y + Personaje.getHeight() > Pared62.getY() && y < Pared62.getY() + Pared62.getHeight()) {
            return true; 
        }
       if (x + Personaje.getWidth() > Pared64.getX() && x < Pared64.getX() + Pared64.getWidth()
                && y + Personaje.getHeight() > Pared64.getY() && y < Pared64.getY() + Pared64.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared68.getX() && x < Pared68.getX() + Pared68.getWidth()
                && y + Personaje.getHeight() > Pared68.getY() && y < Pared68.getY() + Pared68.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared70.getX() && x < Pared70.getX() + Pared70.getWidth()
                && y + Personaje.getHeight() > Pared70.getY() && y < Pared70.getY() + Pared70.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared76.getX() && x < Pared76.getX() + Pared76.getWidth()
                && y + Personaje.getHeight() > Pared76.getY() && y < Pared76.getY() + Pared76.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared78.getX() && x < Pared78.getX() + Pared78.getWidth()
                && y + Personaje.getHeight() > Pared78.getY() && y < Pared78.getY() + Pared78.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared93.getX() && x < Pared93.getX() + Pared93.getWidth()
                && y + Personaje.getHeight() > Pared93.getY() && y < Pared93.getY() + Pared93.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared94.getX() && x < Pared94.getX() + Pared94.getWidth()
                && y + Personaje.getHeight() > Pared94.getY() && y < Pared94.getY() + Pared94.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared96.getX() && x < Pared96.getX() + Pared96.getWidth()
                && y + Personaje.getHeight() > Pared96.getY() && y < Pared96.getY() + Pared96.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared102.getX() && x < Pared102.getX() + Pared102.getWidth()
                && y + Personaje.getHeight() > Pared102.getY() && y < Pared102.getY() + Pared102.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared104.getX() && x < Pared104.getX() + Pared104.getWidth()
                && y + Personaje.getHeight() > Pared104.getY() && y < Pared104.getY() + Pared104.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared105.getX() && x < Pared105.getX() + Pared105.getWidth()
                && y + Personaje.getHeight() > Pared105.getY() && y < Pared105.getY() + Pared105.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared120.getX() && x < Pared120.getX() + Pared120.getWidth()
                && y + Personaje.getHeight() > Pared120.getY() && y < Pared120.getY() + Pared120.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared122.getX() && x < Pared122.getX() + Pared122.getWidth()
                && y + Personaje.getHeight() > Pared122.getY() && y < Pared122.getY() + Pared122.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared124.getX() && x < Pared124.getX() + Pared124.getWidth()
                && y + Personaje.getHeight() > Pared124.getY() && y < Pared124.getY() + Pared124.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared125.getX() && x < Pared125.getX() + Pared125.getWidth()
                && y + Personaje.getHeight() > Pared125.getY() && y < Pared125.getY() + Pared125.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared126.getX() && x < Pared126.getX() + Pared126.getWidth()
                && y + Personaje.getHeight() > Pared126.getY() && y < Pared126.getY() + Pared126.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared128.getX() && x < Pared128.getX() + Pared128.getWidth()
                && y + Personaje.getHeight() > Pared128.getY() && y < Pared128.getY() + Pared128.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared130.getX() && x < Pared130.getX() + Pared130.getWidth()
                && y + Personaje.getHeight() > Pared130.getY() && y < Pared130.getY() + Pared130.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared137.getX() && x < Pared137.getX() + Pared137.getWidth()
                && y + Personaje.getHeight() > Pared137.getY() && y < Pared137.getY() + Pared137.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared146.getX() && x < Pared146.getX() + Pared146.getWidth()
                && y + Personaje.getHeight() > Pared146.getY() && y < Pared146.getY() + Pared146.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared148.getX() && x < Pared148.getX() + Pared148.getWidth()
                && y + Personaje.getHeight() > Pared148.getY() && y < Pared148.getY() + Pared148.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared150.getX() && x < Pared150.getX() + Pared150.getWidth()
                && y + Personaje.getHeight() > Pared150.getY() && y < Pared150.getY() + Pared150.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared152.getX() && x < Pared152.getX() + Pared152.getWidth()
                && y + Personaje.getHeight() > Pared152.getY() && y < Pared152.getY() + Pared152.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared154.getX() && x < Pared154.getX() + Pared154.getWidth()
                && y + Personaje.getHeight() > Pared154.getY() && y < Pared154.getY() + Pared154.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared156.getX() && x < Pared156.getX() + Pared156.getWidth()
                && y + Personaje.getHeight() > Pared156.getY() && y < Pared156.getY() + Pared156.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared165.getX() && x < Pared165.getX() + Pared165.getWidth()
                && y + Personaje.getHeight() > Pared165.getY() && y < Pared165.getY() + Pared165.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared171.getX() && x < Pared171.getX() + Pared171.getWidth()
                && y + Personaje.getHeight() > Pared171.getY() && y < Pared171.getY() + Pared171.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared172.getX() && x < Pared172.getX() + Pared172.getWidth()
                && y + Personaje.getHeight() > Pared172.getY() && y < Pared172.getY() + Pared172.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared173.getX() && x < Pared173.getX() + Pared173.getWidth()
                && y + Personaje.getHeight() > Pared173.getY() && y < Pared173.getY() + Pared173.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared174.getX() && x < Pared174.getX() + Pared174.getWidth()
                && y + Personaje.getHeight() > Pared174.getY() && y < Pared174.getY() + Pared174.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared175.getX() && x < Pared175.getX() + Pared175.getWidth()
                && y + Personaje.getHeight() > Pared175.getY() && y < Pared175.getY() + Pared175.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared176.getX() && x < Pared176.getX() + Pared176.getWidth()
                && y + Personaje.getHeight() > Pared176.getY() && y < Pared176.getY() + Pared176.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared178.getX() && x < Pared178.getX() + Pared178.getWidth()
                && y + Personaje.getHeight() > Pared178.getY() && y < Pared178.getY() + Pared178.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared179.getX() && x < Pared179.getX() + Pared179.getWidth()
                && y + Personaje.getHeight() > Pared179.getY() && y < Pared179.getY() + Pared179.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared180.getX() && x < Pared180.getX() + Pared180.getWidth()
                && y + Personaje.getHeight() > Pared180.getY() && y < Pared180.getY() + Pared180.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared181.getX() && x < Pared181.getX() + Pared181.getWidth()
                && y + Personaje.getHeight() > Pared181.getY() && y < Pared181.getY() + Pared181.getHeight()) {
            return true; 
        }
        if (x + Personaje.getWidth() > Pared182.getX() && x < Pared182.getX() + Pared182.getWidth()
                && y + Personaje.getHeight() > Pared182.getY() && y < Pared182.getY() + Pared182.getHeight()) {
            return true; 
        }
        
        else if (x + Personaje.getWidth() > Pared183.getX() && x < Pared183.getX() + Pared183.getWidth()
                && y + Personaje.getHeight() > Pared183.getY() && y < Pared183.getY() + Pared183.getHeight()) {
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
        if (x + Enemigo.getWidth() > Pared19.getX() && x < Pared19.getX() + Pared19.getWidth()
                && y + Enemigo.getHeight() > Pared19.getY() && y < Pared19.getY() + Pared19.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared21.getX() && x < Pared21.getX() + Pared21.getWidth()
                && y + Enemigo.getHeight() > Pared21.getY() && y < Pared21.getY() + Pared21.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared28.getX() && x < Pared28.getX() + Pared28.getWidth()
                && y + Enemigo.getHeight() > Pared28.getY() && y < Pared28.getY() + Pared28.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared30.getX() && x < Pared30.getX() + Pared30.getWidth()
                && y + Enemigo.getHeight() > Pared30.getY() && y < Pared30.getY() + Pared30.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared32.getX() && x < Pared32.getX() + Pared32.getWidth()
                && y + Enemigo.getHeight() > Pared32.getY() && y < Pared32.getY() + Pared32.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared35.getX() && x < Pared35.getX() + Pared35.getWidth()
                && y + Enemigo.getHeight() > Pared35.getY() && y < Pared35.getY() + Pared35.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared37.getX() && x < Pared37.getX() + Pared37.getWidth()
                && y + Enemigo.getHeight() > Pared37.getY() && y < Pared37.getY() + Pared37.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared39.getX() && x < Pared39.getX() + Pared39.getWidth()
                && y + Enemigo.getHeight() > Pared39.getY() && y < Pared39.getY() + Pared39.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared55.getX() && x < Pared55.getX() + Pared55.getWidth()
                && y + Enemigo.getHeight() > Pared55.getY() && y < Pared55.getY() + Pared55.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared57.getX() && x < Pared57.getX() + Pared57.getWidth()
                && y + Enemigo.getHeight() > Pared57.getY() && y < Pared57.getY() + Pared57.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared59.getX() && x < Pared59.getX() + Pared59.getWidth()
                && y + Enemigo.getHeight() > Pared59.getY() && y < Pared59.getY() + Pared59.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared60.getX() && x < Pared60.getX() + Pared60.getWidth()
                && y + Enemigo.getHeight() > Pared60.getY() && y < Pared60.getY() + Pared60.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared61.getX() && x < Pared61.getX() + Pared61.getWidth()
                && y + Enemigo.getHeight() > Pared61.getY() && y < Pared61.getY() + Pared61.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared62.getX() && x < Pared62.getX() + Pared62.getWidth()
                && y + Enemigo.getHeight() > Pared62.getY() && y < Pared62.getY() + Pared62.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared64.getX() && x < Pared64.getX() + Pared64.getWidth()
                && y + Enemigo.getHeight() > Pared64.getY() && y < Pared64.getY() + Pared64.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared68.getX() && x < Pared68.getX() + Pared68.getWidth()
                && y + Enemigo.getHeight() > Pared68.getY() && y < Pared68.getY() + Pared68.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared70.getX() && x < Pared70.getX() + Pared70.getWidth()
                && y + Enemigo.getHeight() > Pared70.getY() && y < Pared70.getY() + Pared70.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared76.getX() && x < Pared76.getX() + Pared76.getWidth()
                && y + Enemigo.getHeight() > Pared76.getY() && y < Pared76.getY() + Pared76.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared78.getX() && x < Pared78.getX() + Pared78.getWidth()
                && y + Enemigo.getHeight() > Pared78.getY() && y < Pared78.getY() + Pared78.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared93.getX() && x < Pared93.getX() + Pared93.getWidth()
                && y + Enemigo.getHeight() > Pared93.getY() && y < Pared93.getY() + Pared93.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared94.getX() && x < Pared94.getX() + Pared94.getWidth()
                && y + Enemigo.getHeight() > Pared94.getY() && y < Pared94.getY() + Pared94.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared96.getX() && x < Pared96.getX() + Pared96.getWidth()
                && y + Enemigo.getHeight() > Pared96.getY() && y < Pared96.getY() + Pared96.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared102.getX() && x < Pared102.getX() + Pared102.getWidth()
                && y + Enemigo.getHeight() > Pared102.getY() && y < Pared102.getY() + Pared102.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared104.getX() && x < Pared104.getX() + Pared104.getWidth()
                && y + Enemigo.getHeight() > Pared104.getY() && y < Pared104.getY() + Pared104.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared105.getX() && x < Pared105.getX() + Pared105.getWidth()
                && y + Enemigo.getHeight() > Pared105.getY() && y < Pared105.getY() + Pared105.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared120.getX() && x < Pared120.getX() + Pared120.getWidth()
                && y + Enemigo.getHeight() > Pared120.getY() && y < Pared120.getY() + Pared120.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared122.getX() && x < Pared122.getX() + Pared122.getWidth()
                && y + Enemigo.getHeight() > Pared122.getY() && y < Pared122.getY() + Pared122.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared124.getX() && x < Pared124.getX() + Pared124.getWidth()
                && y + Enemigo.getHeight() > Pared124.getY() && y < Pared124.getY() + Pared124.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared125.getX() && x < Pared125.getX() + Pared125.getWidth()
                && y + Enemigo.getHeight() > Pared125.getY() && y < Pared125.getY() + Pared125.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared126.getX() && x < Pared126.getX() + Pared126.getWidth()
                && y + Enemigo.getHeight() > Pared126.getY() && y < Pared126.getY() + Pared126.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared128.getX() && x < Pared128.getX() + Pared128.getWidth()
                && y + Enemigo.getHeight() > Pared128.getY() && y < Pared128.getY() + Pared128.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared130.getX() && x < Pared130.getX() + Pared130.getWidth()
                && y + Enemigo.getHeight() > Pared130.getY() && y < Pared130.getY() + Pared130.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared137.getX() && x < Pared137.getX() + Pared137.getWidth()
                && y + Enemigo.getHeight() > Pared137.getY() && y < Pared137.getY() + Pared137.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared146.getX() && x < Pared146.getX() + Pared146.getWidth()
                && y + Enemigo.getHeight() > Pared146.getY() && y < Pared146.getY() + Pared146.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared148.getX() && x < Pared148.getX() + Pared148.getWidth()
                && y + Enemigo.getHeight() > Pared148.getY() && y < Pared148.getY() + Pared148.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared150.getX() && x < Pared150.getX() + Pared150.getWidth()
                && y + Enemigo.getHeight() > Pared150.getY() && y < Pared150.getY() + Pared150.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared152.getX() && x < Pared152.getX() + Pared152.getWidth()
                && y + Enemigo.getHeight() > Pared152.getY() && y < Pared152.getY() + Pared152.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared154.getX() && x < Pared154.getX() + Pared154.getWidth()
                && y + Enemigo.getHeight() > Pared154.getY() && y < Pared154.getY() + Pared154.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared156.getX() && x < Pared156.getX() + Pared156.getWidth()
                && y + Enemigo.getHeight() > Pared156.getY() && y < Pared156.getY() + Pared156.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared165.getX() && x < Pared165.getX() + Pared165.getWidth()
                && y + Enemigo.getHeight() > Pared165.getY() && y < Pared165.getY() + Pared165.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared171.getX() && x < Pared171.getX() + Pared171.getWidth()
                && y + Enemigo.getHeight() > Pared171.getY() && y < Pared171.getY() + Pared171.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared172.getX() && x < Pared172.getX() + Pared172.getWidth()
                && y + Enemigo.getHeight() > Pared172.getY() && y < Pared172.getY() + Pared172.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared173.getX() && x < Pared173.getX() + Pared173.getWidth()
                && y + Enemigo.getHeight() > Pared173.getY() && y < Pared173.getY() + Pared173.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared174.getX() && x < Pared174.getX() + Pared174.getWidth()
                && y + Enemigo.getHeight() > Pared174.getY() && y < Pared174.getY() + Pared174.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared175.getX() && x < Pared175.getX() + Pared175.getWidth()
                && y + Enemigo.getHeight() > Pared175.getY() && y < Pared175.getY() + Pared175.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared176.getX() && x < Pared176.getX() + Pared176.getWidth()
                && y + Enemigo.getHeight() > Pared176.getY() && y < Pared176.getY() + Pared176.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared178.getX() && x < Pared178.getX() + Pared178.getWidth()
                && y + Enemigo.getHeight() > Pared178.getY() && y < Pared178.getY() + Pared178.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared179.getX() && x < Pared179.getX() + Pared179.getWidth()
                && y + Enemigo.getHeight() > Pared179.getY() && y < Pared179.getY() + Pared179.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared180.getX() && x < Pared180.getX() + Pared180.getWidth()
                && y + Enemigo.getHeight() > Pared180.getY() && y < Pared180.getY() + Pared180.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared181.getX() && x < Pared181.getX() + Pared181.getWidth()
                && y + Enemigo.getHeight() > Pared181.getY() && y < Pared181.getY() + Pared181.getHeight()) {
            return true; 
        }
        if (x + Enemigo.getWidth() > Pared182.getX() && x < Pared182.getX() + Pared182.getWidth()
                && y + Enemigo.getHeight() > Pared182.getY() && y < Pared182.getY() + Pared182.getHeight()) {
            return true; 
        }
        
        else if (x + Enemigo.getWidth() > Pared183.getX() && x < Pared183.getX() + Pared183.getWidth()
                && y + Enemigo.getHeight() > Pared183.getY() && y < Pared183.getY() + Pared183.getHeight()) {
            return true; 
        }

        return false;
    }

}
