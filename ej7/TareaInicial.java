import java.util.concurrent.CountDownLatch;

class TareaInicial extends Thread {
    private CountDownLatch latch;
    private String nombre;

    public TareaInicial(CountDownLatch latch, String nombre) {
        this.latch = latch;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            System.out.println("Tarea " + nombre + " iniciando su trabajo...");
            Thread.sleep((long) (Math.random() * 2000)); // Simula trabajo
            System.out.println("Tarea " + nombre + " ha terminado.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            latch.countDown();
        }
    }
}
