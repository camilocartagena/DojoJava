package primitivos;

public class StringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("Es nulo = " + esNulo);

        if(esNulo) {
            curso = "Programacion JAVA"; // "Programacion JAVA"
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("Es vacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(!(esBlanco)) {
            System.out.println(curso.toUpperCase()); // genera NullPointerException por null
            System.out.println("Bienvenido al curso ".concat(curso)); // genera NullPointerException por null
        }

    }
}
