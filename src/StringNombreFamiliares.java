import java.util.Scanner;

public class StringNombreFamiliares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //data in with scanner
        System.out.println("Ingresa Nombre Padre");
        String nombrePadre = scanner.nextLine();
        int longitudNombrePadre =  nombrePadre.length();
        System.out.println("nombrePadre Formateado = " + nombrePadre.toUpperCase().charAt(0) + nombrePadre.substring(1,longitudNombrePadre).toLowerCase());

        System.out.println("Ingresa Nombre Madre");
        String nombreMadre = scanner.nextLine();
        int longitudNombreMadre =  nombreMadre.length();
        System.out.println("nombreMadre Formateado = " + nombreMadre.toUpperCase().charAt(0) + nombreMadre.substring(1,longitudNombreMadre).toLowerCase());
        
    }
}
