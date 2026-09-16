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

        // Pregunta para pensar: ¿En qué escenarios CountDownLatch sería más útil que
        // Thread.join()?
        // join() necesita tener la referencia directa a cada hilo que se quiere esperar.
        // CountDownLatch es más útil cuando las tareas corren en un ExecutorService (sin
        // acceso directo a los Thread) o cuando varios hilos distintos necesitan esperar
        // el mismo evento de finalización.
    }
}
