package Socket;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClienteSocketStream {
    public static void main(String[] args) {

        System.out.println("Creando socket cliente");

        try(Socket clienteSocket = new Socket()){

            System.out.println("Estableciendo la conexion");

            InetSocketAddress addr = new InetSocketAddress("10.230.160.1",5555);
            clienteSocket.connect(addr);

            try(InputStream is = clienteSocket.getInputStream();
                OutputStream os = clienteSocket.getOutputStream();
                InputStreamReader isr = new InputStreamReader(is);
                OutputStreamWriter osw = new OutputStreamWriter(os);

                BufferedReader br = new BufferedReader(isr);
                PrintWriter pw = new PrintWriter(osw);){

                System.out.println("Enviando mensaje");
                String mensaje = "Hola soy david montejano";
                pw.print(mensaje);
                pw.flush();

                System.out.println("Mnesaje enviado");

            }

            System.out.println("Terminado");

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
