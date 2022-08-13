package Sentencias;

import java.util.Scanner;

public class SentenciasNotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double promedioMayores5 = 0.0;
        int numeroNotasPromedioMayores5 = 0;
        double promedioInferior4 = 0.0;
        int numeroNotasPromedioInferior4 = 0;
        int numeroNotasEn1 = 0;
        double promedioTotal = 0.0;
        double nota = 0.0;

        for(int i=1; i<=20; i++){
            System.out.println("Ingresa la nota '" + i +"' que debe ser entre 1.0 a 7.0:");
            nota = scanner.nextDouble();
            if(nota == 0.0) {
                System.out.println("Error con la nota ingresada,ingreso un valor de 0!");
                System.exit(0);
            }else if(nota > 7.0) {
                System.out.println("Error con la nota ingresada,ingreso un valor mayor a 7! Ingresalo de nuevo");
                i--;
            }else{
                promedioTotal += nota;

                if(nota == 1.0) {
                    numeroNotasEn1 ++;
                }else if(nota <= 4){
                    promedioInferior4 += nota;
                    numeroNotasPromedioInferior4 ++;
                }else if(nota >= 5){
                    promedioMayores5 += nota;
                    numeroNotasPromedioMayores5 ++;
                }
            }
        }
        System.out.println("Promedio Total: " + (promedioTotal/20));
        System.out.println("Promedio notas mayores a 5: " + (promedioMayores5/numeroNotasPromedioMayores5));
        System.out.println("Promedio notas inferiores a 4: " + (promedioInferior4/numeroNotasPromedioInferior4));
        System.out.println("Cantidad de notas en 1: " + numeroNotasEn1);
    }
}
