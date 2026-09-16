public class Main {
    public static void main(String[] args) {
        new HiloContador("Uno").start();
        new HiloContador("Dos").start();
        new HiloContador("Tres").start();

        // Pregunta para pensar: ¿El orden de las salidas siempre es el mismo?
        // No, el orden puede variar en cada ejecución. Esto pasa porque el sistema
        // operativo decide cuándo le toca el turno a cada hilo, y ese orden no está
        // garantizado ni es siempre igual.
    }
}
