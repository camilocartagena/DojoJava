package Operadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperadoresLogicosNumerosOrdenados {
    public static void main(String[] args) {
        int numero1=0;
        int numero2=0;
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingresa el primer numero");
            numero1 = scanner.nextInt();
            System.out.println("Ingresa el segundo numero");
            numero2 = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Debe ingresar un numeros enteros");
            main(args);
            System.exit(0);
        }

        if(numero1 == numero2) {
            System.out.println("Los numeros ingresados son iguales, debe volver a ingresarlos");
            main(args);
            System.exit(0);
        }

        String resultado =  numero1 < numero2 ? numero1 + "-" + numero2 : numero2 + "-" + numero1;
        System.out.println("Numero ordenados de mayor a menor = " + resultado);
    }
}
