package sentencias;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1: for(int i = 0; i < 5 ; i++){ //etiqueta de for con nombre bucle1

        System.out.println();
        for(int j = 0; j < 5; j++){
                if(i == 2){
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j+ " ], ");
                j++;
            }

        }

        System.out.println("\n========================================================================================");
        bucle2: for(int i = 0; i < 5 ; i++){ //etiqueta de for con nombre bucle1

            System.out.println();
            for(int j = 0; j < 5; j++){
                if(i == 2){
                    break bucle2;
                }
                System.out.print("[i = " + i + ", j = " + j+ " ], ");
            }
        }

        System.out.println("\n========================================================================================");
        bucle3: for(int i = 1; i <= 7 ; i++){
        int j = 1 ;
            while(j<= 8){
                if(i== 6 || i==7){
                    System.out.println("Dia "+ i + ": descanso de fin de semana");
                    continue bucle3;
                }
                System.out.println("Dia "+ i + ", trabajando a las "+ j + "hrs. ");
                j++;
            }
        }

    }
}
