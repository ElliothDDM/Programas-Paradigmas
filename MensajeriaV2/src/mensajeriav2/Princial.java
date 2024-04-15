
package mensajeriav2;

import java.io.IOException;

public class Princial {
    public static void main(String[] args) {
        try {
        Servidor servidor = new Servidor(1);
        servidor.registrarUsuario("Ellioth", "123");
        servidor.registrarUsuario("Jels", "1234");

        boolean autenticado = servidor.autenticarUsuario("Ellioth", "123");
        System.out.println("Autenticacion de usuario1: " + autenticado);
        
        servidor.enviarMensaje("Ellioth", "Jels", "Iniciar");
        servidor.enviarMensaje("Jels", "Ellioth", "Fin");
        servidor.iniciarServidor();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

