package hilos.ejemplosync;

public class EjemploSyncronized {

    public static void main(String[] args) {
        Contador contador = new Contador();

        // Crear hilos
        HiloIncrementador hilo1 = new HiloIncrementador(contador);
        HiloIncrementador hilo2 = new HiloIncrementador(contador);

        // Iniciar hilos
        hilo1.start();
        hilo2.start();

        try {
            // Esperar a que los hilos terminen
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mostrar el resultado final
        System.out.println("Valor final del contador: " + contador.obtenerCuenta());
    }
}

class Contador {
    private int cuenta = 0;

    // Método synchronized para asegurar acceso exclusivo
    public synchronized void incrementar() {
        cuenta++;
    }

    public int obtenerCuenta() {
        return cuenta;
    }
}

class HiloIncrementador extends Thread {
    private Contador contador;

    public HiloIncrementador(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            contador.incrementar();
        }
    }
}
