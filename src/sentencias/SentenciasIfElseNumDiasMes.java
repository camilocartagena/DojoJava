package sentencias;

import java.util.Scanner;

public class SentenciasIfElseNumDiasMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero del mes de 1 -12");
        int mes = scanner.nextInt();

        int numeroDias = 0;

        System.out.println("Ingresa el anio (YYY)");
        int anio = scanner.nextInt();

        if(mes == 1 || mes == 3 || mes == 5  || mes == 7  || mes == 8  || mes == 10  || mes == 12 ){
            numeroDias = 31;
        }else if (mes == 4 || mes == 6 || mes == 9  || mes == 11  ) {
            numeroDias = 30;
        }else if (mes == 2 ) {
            if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                numeroDias = 29;
            }else{
                numeroDias = 28;
            }
        }
        System.out.println("numeroDias = " + numeroDias);
    }
}
