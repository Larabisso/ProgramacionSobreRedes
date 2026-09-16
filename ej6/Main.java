import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Pool de 3 hilos

        Future<Integer> futuro1 = executor.submit(new TareaSumadora(10));
        Future<Integer> futuro2 = executor.submit(new TareaSumadora(20));
        Future<Integer> futuro3 = executor.submit(new TareaSumadora(30));

        System.out.println("Resultado 1: " + futuro1.get()); // .get() bloquea hasta que
                                                               // el resultado esté disponible
        System.out.println("Resultado 2: " + futuro2.get());
        System.out.println("Resultado 3: " + futuro3.get());

        executor.shutdown();

        // Pregunta para pensar: ¿Cuál es la ventaja de usar ExecutorService sobre la
        // creación manual de hilos con new Thread()?
        // ExecutorService reutiliza un pool de hilos en lugar de crear uno nuevo por cada
        // tarea, lo cual es más eficiente y evita saturar el sistema. Además permite
        // limitar cuántos hilos corren a la vez y, con Callable y Future, obtener
        // resultados de las tareas de forma más simple.
    }
}
