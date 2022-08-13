package Sentencias;

public class SentenciaBucleEtiquetaBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        char letra = 't';
        for(int i = 0; i < max ; i++){
            if(frase.charAt(i) != letra){
                continue;
            }
            cantidad ++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter '" + letra + "' en la frase");


    String palabra = "trigo";
    cantidad = 0;
    int maxFrase = frase.length();
    int maxPalabra = palabra.length();
    buscar:
    for(int i = 0; i < maxFrase; i ++){
        int k = i;
        for(int j = 0; j < maxPalabra; j++){
            if(frase.charAt(k++) != palabra.charAt(j)){
                continue buscar;
            }
        }
        cantidad++;
    }
    System.out.println("Encontrado = " + cantidad + " veces la palabra '" + palabra + "' en la frase");


    }
}
