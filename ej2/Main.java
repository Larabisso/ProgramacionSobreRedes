public class Main {
    public static void main(String[] args) {
        MiTarea tarea = new MiTarea();
        Thread hilo = new Thread(tarea);
        hilo.start();

        // Pregunta para pensar: ¿Cuál es la principal ventaja de usar Runnable en lugar de
        // extender Thread?
        // Java no permite heredar de más de una clase, así que si la clase ya extiende
        // Thread no puede extender otra cosa. Con Runnable eso no pasa, porque es una
        // interfaz, y además la tarea queda separada del hilo, por lo que se puede
        // reutilizar en distintos hilos o en un ExecutorService.
    }
}
