package Sentencias;

import java.sql.Array;
import java.util.Scanner;

public class SentenciasNumMenorMultiplesValores {
    public static void main(String[] args) {
        int[] valores = new int[10];

        Scanner scanner = new Scanner(System.in);

        for(int j=0;j<10;j++){
            System.out.println("Ingresa el numero '" + (j+1) +"' a comparar");
            valores[j] = scanner.nextInt();
        }

        int valorMenor = valores[0];
        for(int i = 1; i < valores.length;i++){
            if(valorMenor>valores[i]){
                valorMenor = valores[i];
            }
        }
        System.out.println("El valor menor es: "  + valorMenor);
    }
}
