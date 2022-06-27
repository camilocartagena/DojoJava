import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //data in
        System.out.println("Ingresa Nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa Codigo");
        int codigo = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingresa Precio");
        double precio = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingresa simbolo");
        char simbolo = scanner.nextLine().charAt(0);

        System.out.println("Ingresa envio gratuito");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("\nInformacion de la factura\n");
        System.out.println(nombre + "#" + codigo);
        System.out.println("Precio = " + simbolo + precio);
        System.out.println("envioGratuito = " + envioGratuito);
    }
}
