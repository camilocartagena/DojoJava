package Operadores;

import java.util.Scanner;

public class OperadoresTernarioNumero {
    public static void main(String[] args) {
        int max = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero 1");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese un numero 2");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese un numero 3");
        int num3 = scanner.nextInt();

        max = (num1 > num2 ) ? num1 : num2;
        max = (max > num3) ? max : num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        System.out.println("El numero mayo es  = " + max);


    }
}
