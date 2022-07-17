import java.util.Scanner;

public class OperadoresLogicosGasolina {
    public static void main(String[] args) {
        String resultado = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la medida actual en litros de gasolina");
        int medidaActual = scanner.nextInt();

        if(medidaActual >= 1 && medidaActual <=20){
            resultado = "Insuficiente";
        }else if(medidaActual >= 20 && medidaActual <=35){
            resultado = "Suficiente";
        }else if(medidaActual >= 35 && medidaActual <=40){
            resultado = "Medio Tanque";
        }else if(medidaActual >= 40 && medidaActual <=60){
            resultado = "Tanque 3/4";
        }else if(medidaActual >= 60 && medidaActual <=70){
            resultado = "Tanque casi lleno";
        }else if(medidaActual == 70 ){
            resultado = "Tanque  lleno";
        }else{
            resultado = "Debe ingresar un valor entre 1 y 70";
            System.out.println(resultado);
            main(args);
            System.exit(0);
        }
        System.out.println(resultado);
    }
}
