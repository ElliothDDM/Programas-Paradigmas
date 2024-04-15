
package mensajeria;

public class Prncipal {

    public static void main(String[] args){
        Servidor servidor = new Servidor();

        servidor.registrarUsuario("Ellioth", "654321");
        servidor.registrarUsuario("Jels", "123456");

        boolean autenticado = servidor.autenticarUsuario("Ellioth", "654321");
        System.out.println("Autenticacion de usuario1: " + autenticado);

        // Envío de mensajes
        servidor.enviarMensaje("Ellioth", "Jels", "Hola");
    }
    
}
