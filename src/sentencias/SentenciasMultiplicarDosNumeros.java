package sentencias;

import java.util.Scanner;

public class SentenciasMultiplicarDosNumeros {
    public static void main(String[] args) {

        int totalMultiplicacion = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el numero entero positivo o negativo a multiplicar ");
        int numeroAMultiplicar = scanner.nextInt();
        boolean numeroAMultiplicarNeg = numeroAMultiplicar < 0;
        int numeroAMultiplicarPositive = Math.abs(numeroAMultiplicar);

        System.out.println("Ingresar el numero entero positivo o negativo por multiplicar ");
        int numeroPorMultiplicar = scanner.nextInt();
        boolean numeroPorMultiplicarNeg = numeroPorMultiplicar < 0;
        int numeroPorMultiplicarPositive = Math.abs(numeroPorMultiplicar);

        for(int i=1;i<=numeroPorMultiplicarPositive;i++){
            totalMultiplicacion += numeroAMultiplicarPositive;
        }

        if((numeroAMultiplicarNeg && numeroPorMultiplicarNeg) || (!numeroAMultiplicarNeg && !numeroPorMultiplicarNeg)){
            System.out.println("El total de la multiplicacion es: " + totalMultiplicacion);
        }else{
            System.out.println("El total de la multiplicacion es: " + (-totalMultiplicacion));
        }


    }
}
