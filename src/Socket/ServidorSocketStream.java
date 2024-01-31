package Socket;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.security.spec.RSAOtherPrimeInfo;

public class ServidorSocketStream {
    public static void main(String[] args) {

        System.out.println("Creando socket servidor");

        try(ServerSocket serverSocket = new ServerSocket();){

            System.out.println("Realizando el bind");

            InetSocketAddress address = new InetSocketAddress("10.230.162.209", 5555);

            serverSocket.bind(address);

            System.out.println("Aceptando conexion");


            try(Socket newsScoket = serverSocket.accept();
                InputStream is = newsScoket.getInputStream();
                OutputStream os = newsScoket.getOutputStream();

                InputStreamReader isr = new InputStreamReader(is);
                OutputStreamWriter osw = new OutputStreamWriter(os);

                BufferedReader bf = new BufferedReader(isr);
                PrintWriter pw = new PrintWriter(osw);){
                System.out.println("Conexion recibida");
                String mensaje = bf.readLine();
                System.out.println("Mensaje recibido: " + mensaje);

            }

        System.out.println("Cerrando el nuevo socket");
        System.out.println("Cerrando el socket servidor");
        System.out.println("Terminado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
