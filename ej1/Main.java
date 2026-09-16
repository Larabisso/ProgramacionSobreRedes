public class Main {
    public static void main(String[] args) {
        MiHilo hilo = new MiHilo();
        hilo.start();

        // Pregunta para pensar: ¿Qué sucede si llamas a hilo.run() en lugar de hilo.start()?
        // Si se llama a hilo.run(), el código se ejecuta como un método normal, dentro del
        // mismo hilo que lo llamó, sin crear un hilo nuevo. En cambio, hilo.start() sí crea
        // un hilo nuevo y hace que ese código corra en paralelo con el resto del programa.
    }
}
