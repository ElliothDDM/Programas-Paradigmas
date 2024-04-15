
package mensajeriachat;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

// Clase para representar a un usuario
class Usuario {
    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}

// Clase para representar el servidor
class Servidor {
    private ServerSocket serverSocket;
    private Map<String, Usuario> usuariosRegistrados = new HashMap<>();
    private Map<String, PrintWriter> usuariosConectados = new HashMap<>();

    public Servidor(int puerto) throws IOException {
        this.serverSocket = new ServerSocket(puerto);
    }

    public boolean registrarUsuario(String username, String password) {
        if (!usuariosRegistrados.containsKey(username)) {
            usuariosRegistrados.put(username, new Usuario(username, password));
            return true;
        } else {
            return false;
        }
    }

    public boolean autenticarUsuario(String username, String password) {
        Usuario usuario = usuariosRegistrados.get(username);
        return usuario != null && usuario.checkPassword(password);
    }

    public void iniciarServidor() {
        System.out.println("Servidor iniciado y esperando conexiones...");
        try {
            while (!serverSocket.isClosed()) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new ClienteHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ClienteHandler implements Runnable {
        private Socket clientSocket;
        private BufferedReader reader;
        private PrintWriter writer;
        private String nombreUsuario;

        public ClienteHandler(Socket socket) throws IOException {
            this.clientSocket = socket;
            this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.writer = new PrintWriter(socket.getOutputStream(), true);

            // Autenticación del usuario
            this.nombreUsuario = reader.readLine();
            String password = reader.readLine();

            if (autenticarUsuario(nombreUsuario, password)) {
                writer.println("Autenticación exitosa");
                usuariosConectados.put(nombreUsuario, writer);
                escucharMensajes();
            } else {
                writer.println("Error de autenticación");
                clientSocket.close();
            }
        }

        private void escucharMensajes() {
            String mensajeCliente;
        try {
            while ((mensajeCliente = reader.readLine()) != null) {
                System.out.println("Servidor recibió: " + mensajeCliente); // Impresión de depuración
                for (PrintWriter w : usuariosConectados.values()) {
                    w.println(nombreUsuario + ": " + mensajeCliente);
                }
            }
            } catch (IOException e) {
                usuariosConectados.remove(nombreUsuario);
                e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Servidor servidor = new Servidor(1234);
            servidor.registrarUsuario("usuario1", "contraseña1");
            servidor.registrarUsuario("usuario2", "contraseña2");
            servidor.iniciarServidor();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

