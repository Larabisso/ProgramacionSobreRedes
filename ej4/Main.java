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

      
    }
}
