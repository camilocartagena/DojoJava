package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaCalculateDuration {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("Ingrese fecha inicial con formato 'yyyy-MM-dd HH:mm:ss'");

        try {
            Date fechaInicial = format.parse(s.nextLine());
            System.out.println("fecha inicial = " + fechaInicial);

            System.out.println("Ingrese fecha Final con formato 'yyyy-MM-dd HH:mm:ss'");
            Date fechaFinal = format.parse(s.nextLine());
            System.out.println("fecha final = " + fechaFinal);

        } catch (ParseException e) {
            e.printStackTrace();
            System.err.println("La fecha inicial tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd HH:mm:ss'");
            System.exit(1);

        }
    }
}
