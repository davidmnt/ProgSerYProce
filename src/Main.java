import java.util.Random;

public class Main implements Runnable {

    private final String nombre;

    public Main(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        System.out.println("Hola, soy el hilo: %s\n" + this.nombre);
        Random r = new Random();

        for(int i = 0;i <5 ; i++) {
            int pausa = 10 + r.nextInt(500 - 10);

            try {
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                System.out.println("Hilo: %s ha sido interrumpido\n" + this.nombre);
            }
        }
    }
}
