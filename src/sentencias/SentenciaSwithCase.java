package sentencias;

import java.util.Scanner;

public class SentenciaSwithCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero del 0 al 3");
        int num = scanner.nextInt();

        switch (num){
            case 0:
                System.out.println("El num es cero");
                break;
            case 1:
                System.out.println("El num es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("el num es tres");
                break;
        }

        String nombre = "andres";
        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenidos");
                break;
            case "andres":
                System.out.println("Hola andres, bienvenido");
                break;
            case "pepe":
                System.out.println("Hola pepe, bienvenido");
                break;
            default:
                System.out.println("Usuario desconocido!");
        }

        int mes = 12;
        String nombreMes=null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }
        System.out.println("nombreMes = " + nombreMes);


    }
}
