
public class HolaMundo {
    public static void main(String[] args){

        //comentarios
        /*
        multiples lineas o code + comment
         */

        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 10;
        System.out.println("numero = " + numero);
        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero = " + numero2);

        var numero3 = 15;
        System.out.println("numero3 = " + numero3);

        String nombre;
        nombre = "Camilo";
        if(numero > 10){
            nombre = "juan";
        }
        System.out.println("nombre = " + nombre);

        int edadPersona = 5;
        System.out.println("edadPersona = " + edadPersona);
    }
}
