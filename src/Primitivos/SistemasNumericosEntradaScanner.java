package Primitivos;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

    public static void main(String[] args) {

        //Scanner para ingresar datos por consola

        Scanner scanner = new Scanner(System.in); //System.in entrada de datos System.out salida
        System.out.println("Ingrese un numero entero");

        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();  // con este optimizado lo que hacia Integer.parseInt(numeroStr);
        }catch (InputMismatchException e){ // InputMismatchException para ingresar un valor correcto Exception especifica. se podria utilizar la generica Exception
            System.out.println("Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal+ " = " + Integer.toHexString(numeroDecimal);

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
        String mensaje = resultadoBinario + "\n";
        mensaje += resultadoOctal + "\n";
        mensaje += resultadoHexadecimal + "\n";

        System.out.println("mensaje = " + mensaje);


    }
}
