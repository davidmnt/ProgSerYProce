public class Hilos {
    public static void main(String[] args) {
        /*
        Ejemplo 1
        Thread t1 = new Thread("h1");
        Thread t2 = new Thread("h2");
        t1.start();
        t2.start();*/

        Thread h1 = new Thread(new Main("H1"));
        Thread h2 = new Thread(new Main("H2"));
        try {

            h1.join();
            h2.join();
        }catch (InterruptedException e) {
            System.out.println("");
        }




    }
}
