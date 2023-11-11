
package mariobros1985;

public class MarioBros1985 {

    public static void main(String[] args) {
        
        Ventana Ventana = new Ventana();
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
        Thread hilo=new Thread((Runnable) Ventana);
        hilo.start();
    }
    
}
