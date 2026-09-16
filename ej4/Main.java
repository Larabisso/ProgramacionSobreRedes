public class Main {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        Incrementador[] hilos = new Incrementador[5];

        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Incrementador(contador);
            hilos[i].start();
        }

        for (int i = 0; i < hilos.length; i++) {
            hilos[i].join();
        }

        System.out.println("Valor final del contador: " + contador.getValor());

        // Observación: con 5 hilos incrementando 1000 veces cada uno, se esperaría un
        // valor final de 5000. Sin "synchronized" en incrementar(), el resultado suele
        // ser menor y variable entre ejecuciones, debido a la condición de carrera sobre
        // la variable compartida "valor".
        //
        // Pregunta para pensar: ¿Por qué synchronized resuelve el problema?
        // valor++ en realidad son tres pasos (leer, sumar, guardar), y si dos hilos hacen
        // esto al mismo tiempo se pueden pisar y perder incrementos. synchronized bloquea
        // el método para que solo un hilo a la vez pueda ejecutarlo sobre el mismo objeto
        // Contador; los demás hilos esperan su turno, así ningún incremento se pierde.
    }
}
