import java.util.Scanner;

public class StringManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa Nombre");
        String nombre = scanner.nextLine();
        int longitudNombre =  nombre.length();
        System.out.println("nombre Formateado = " + nombre.toUpperCase().charAt(0) + nombre.substring(1,longitudNombre).toLowerCase());

        /*
        Desarrollar un programa que reciba 3 nombres, por cada nombre se debe tomar el segundo caracter y convertirlo en mayuscula, concatenarlo con un punto y los dos ultimos caracteres
        Ejemplo: Andres quedaria N.es
        Se debe imprimir el resultado separados con un guio bajo
        Ejemplo Final:
        Andres, Maria, Pepe con el resultado N.es_A.ia_E.pe
         */

        System.out.println("Ingresa Nombre Padre");
        String nombrePadre = scanner.nextLine();

        System.out.println("Ingresa Nombre Madre");
        String nombreMadre = scanner.nextLine();

        System.out.println("Ingresa Nombre Hermano");
        String nombreHermano = scanner.nextLine();

        System.out.println(nombrePadre.toUpperCase().charAt(1) + "." + nombrePadre.toLowerCase().substring(nombrePadre.length() - 2,nombrePadre.length()) + "_" + nombreMadre.toUpperCase().charAt(1) + "." + nombreMadre.toLowerCase().substring(nombreMadre.length() - 2,nombreMadre.length()) + "_" + nombreHermano.toUpperCase().charAt(1) + "." + nombreHermano.toLowerCase().substring(nombreHermano.length() - 2,nombreHermano.length()));
    }
}
