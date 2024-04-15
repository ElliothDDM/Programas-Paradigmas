
package mensajeriav2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Servidor {
    private Map<String, Usuario> usuariosRegistrados = new HashMap<>();
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader reader;
    private BufferedWriter writer;

    public Servidor(int puerto) throws IOException {
        this.serverSocket = new ServerSocket(puerto);
    }

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

    // Método para iniciar el servidor y aceptar conexiones de clientes
    public void iniciarServidor() {
        try {
            while (!serverSocket.isClosed()) {
                clientSocket = serverSocket.accept();
                reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                // Autenticación del usuario
                String username = reader.readLine();
                String password = reader.readLine();

                if (autenticarUsuario(username, password)) {
                    writer.write("Autenticación exitosa\n");
                    writer.flush();
                } else {
                    writer.write("Error de autenticación\n");
                    writer.flush();
                    clientSocket.close();
                    continue;
                }

                // Escuchar mensajes del cliente
                String mensajeCliente;
                while ((mensajeCliente = reader.readLine()) != null) {
                    System.out.println("Mensaje recibido: " + mensajeCliente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void enviarMensaje(String remitente, String destinatario, String mensaje) {
        if (usuariosRegistrados.containsKey(remitente) && usuariosRegistrados.containsKey(destinatario)) {
            System.out.println("Mensaje de " + remitente + " para " + destinatario + ": " + mensaje);
        } else {
            System.out.println("Uno de los usuarios no está registrado.");
        }
    }
}
