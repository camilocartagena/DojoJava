import java.util.Scanner;

public class OperadoresTernarioScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad");
        // genera error int edad = scanner.nextInt();
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el sexo");
        String sexo =  scanner.nextLine();

        System.out.println("nombre = " + nombre + " condicion: " + (nombre.equals("camilo")) );
        System.out.println("edad = " + edad + " condicion: " + (edad >= 18));
        System.out.println("sexo = " + sexo + " condicion: " + (sexo.equals("M")) );
        
        String resultado = (nombre.equals("camilo")) &&  ( edad >= 18 ) && (sexo.equals("M")) ? "Cumple con las reglas" : "No cumple con las reglas";
        System.out.println("resultado = " + resultado);
    }
}
