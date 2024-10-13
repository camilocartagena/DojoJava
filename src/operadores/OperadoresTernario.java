package operadores;

import java.util.Scanner;

public class OperadoresTernario {
    public static void main(String[] args) {

        //variable = condicion ? si_es verdadero: si_es falso
        String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historias = 0.0;

        Scanner scanner = new Scanner(System.in);
        //scanner dependiendo del tipo de dato se debe seleccionar por ejemplo double nextDouble()

        System.out.println("Ingrese la nota de matematicas entre 2.0 - 7.0");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese la nota de historias entre 2.0 - 7.0");
        historias= scanner.nextDouble();

        promedio = ( matematicas + ciencias + historias ) / 3;

        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        /*Asi seria con if que se puede reemplazar por un ternario
        if(promedio >= 5.49){
            System.out.println("Aprobado");
        }else{
            System.out.println("Rechazado");
        }
         */

    }
}
