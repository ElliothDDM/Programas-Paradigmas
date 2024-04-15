
package mensajeriachat;

import java.io.*;
import java.net.*;

public class Cliente {
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;
    private BufferedReader inputConsola;

    public Cliente(String host, int puerto, String nombreUsuario, String password) throws IOException {
        socket = new Socket(host, puerto);
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream(), true);
        inputConsola = new BufferedReader(new InputStreamReader(System.in));

        // Enviar nombre de usuario y contraseña para autenticación
        writer.println(nombreUsuario);
        writer.println(password);

        // Leer respuesta del servidor
        String respuesta = reader.readLine();
        System.out.println(respuesta);

        // Si la autenticación es exitosa, enviar mensajes
        if ("Autenticación exitosa".equals(respuesta)) {
        String mensaje;
        while ((mensaje = inputConsola.readLine()) != null) {
            writer.println(mensaje);
            String respuestaServidor = reader.readLine(); // Leer la respuesta del servidor
            System.out.println(respuestaServidor); // Mostrar la respuesta del servidor
        }
    }

        socket.close();
    }

    public static void main(String[] args) {
        try {
            new Cliente("localhost", 1234, "usuario1", "contraseña1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
        

