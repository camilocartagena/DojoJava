package Operadores;

import javax.swing.*;

public class OperadoresAritmetico {

    public static void main(String[] args) {

        int i = 5 , j = 4; // se puede definir es una sola linea cuando son el mismo tipo
        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j concatenado " + i + j);
        System.out.println("i + j con parentesis " + (i + j));
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j con parentesis " + (i - j));
        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("i * j con parentesis " + (i * j));
        float division = (float)i / (float)j;
        System.out.println("division = " + division);
        System.out.println("i / j con parentesis " + ((float)i / (float)j));
        int resto = i % j; // se usa para pares  e impares
        System.out.println("resto = " + resto);
        System.out.println("rest de i y j con parentesis " + (i % j));

        //Obtener data del usuario
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        if(numero % 2 == 0){
            System.out.println("Numero Par = " + numero);
        }else{
            System.out.println("Numero Impar = " + numero);
        }
    }
}
