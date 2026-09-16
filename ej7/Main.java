import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numeroDeTareas = 3;
        CountDownLatch latch = new CountDownLatch(numeroDeTareas);

        for (int i = 1; i <= numeroDeTareas; i++) {
            new TareaInicial(latch, "Tarea-" + i).start();
        }

        System.out.println("Hilo principal esperando a que las tareas terminen...");
        latch.await();
        System.out.println("Todas las tareas han terminado. Hilo principal continuando.");

     
    }
}
