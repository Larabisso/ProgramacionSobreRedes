class Contador {
    private int valor = 0;

    // Versión con condición de carrera: sacá "synchronized" de la firma de abajo
    // para reproducir el problema (el resultado final variará y será menor a 5000).
    public synchronized void incrementar() { // ¡Aquí está la solución!
        valor++;
    }

    public int getValor() {
        return valor;
    }
}
