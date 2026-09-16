public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Productor productor = new Productor(buffer);
        Consumidor consumidor = new Consumidor(buffer);

        productor.start();
        consumidor.start();

        // Pregunta para pensar: ¿Por qué es importante el bucle while en wait() en lugar
        // de un if?
        // Porque cuando un hilo se despierta no hay garantía de que la condición siga
        // siendo válida (puede haberse adelantado otro hilo). Con if se seguiría de largo
        // sin revisar de nuevo, pero con while se vuelve a comprobar la condición y, si
        // todavía no se cumple, el hilo espera otra vez.
    }
}
