public class OperadoresInstanceOfTiposGenericos {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String";
        Integer num = 7;
        Double decimal = 45.54;

        // validar si un valor es de un tipo
        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer " + b1);

        //Cuando no se puede instanciar se notifica por alerta num instanceof String;

        b1 = num instanceof Object; // todos son de tipo Object
        System.out.println("num es del tipo Object " + b1);

        b1 = decimal instanceof Number; //true Number y Decimal estan al mismo nivel, heredan de Number
        System.out.println("num es del tipo Object " + b1);


    }
}
