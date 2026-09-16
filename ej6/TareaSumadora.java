import java.util.concurrent.Callable;

class TareaSumadora implements Callable<Integer> {
    private int numero;

    public TareaSumadora(int numero) {
        this.numero = numero;
    }

    @Override
    public Integer call() throws Exception {
        int suma = 0;
        for (int i = 0; i <= numero; i++) {
            suma += i;
            Thread.sleep(10);
        }
        System.out.println("Suma de " + numero + " calculada.");
        return suma;
    }
}
