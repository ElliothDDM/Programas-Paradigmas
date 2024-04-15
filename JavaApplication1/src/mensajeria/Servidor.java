
package mensajeria;

import java.util.HashMap;
import java.util.Map;


class Servidor {
    private Map<String, Usuario> usuariosRegistrados = new HashMap<>();

    // Método para registrar un nuevo usuario
    public boolean registrarUsuario(String username, String password) {
        if (!usuariosRegistrados.containsKey(username)) {
            usuariosRegistrados.put(username, new Usuario(username, password));
            return true;
        } else {
            return false;
        }
    }

    // Método para autenticar a un usuario
    public boolean autenticarUsuario(String username, String password) {
        Usuario usuario = usuariosRegistrados.get(username);
        return usuario != null && usuario.checkPassword(password);
    }

    // Método para enviar un mensaje de un usuario a otro
    public void enviarMensaje(String remitente, String destinatario, String mensaje) {
        if (usuariosRegistrados.containsKey(remitente) && usuariosRegistrados.containsKey(destinatario)) {
            System.out.println("Mensaje de " + remitente + " para " + destinatario + ": " + mensaje);
        } else {
            System.out.println("Uno de los usuarios no está registrado.");
        }
    }
}