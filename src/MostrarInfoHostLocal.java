import java.net.InetAddress;
import java.net.UnknownHostException;

public class MostrarInfoHostLocal {

    public static void main(String[] args) {

        try{

            InetAddress localHost = InetAddress.getLocalHost();


            System.out.println("Nombre del host: " + localHost.getHostName());
            System.out.println("Direccion IP del host: " + localHost.getHostAddress());

            System.out.println("getCanonicalHostName devuelve: " + localHost.getCanonicalHostName());
            System.out.println("isAnyLocalAddress devuelve: " + localHost.isAnyLocalAddress());
        }catch (UnknownHostException e){
            e.printStackTrace();
        }

    }

}
