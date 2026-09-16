class Buffer {
    private int dato;
    private boolean disponible = false;

    public synchronized void put(int valor) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.dato = valor;
        disponible = true;
        System.out.println("Productor puso: " + dato);
        notifyAll();
    }

    public synchronized int get() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        disponible = false;
        System.out.println("Consumidor obtuvo: " + dato);
        notifyAll();
        return dato;
    }
}
