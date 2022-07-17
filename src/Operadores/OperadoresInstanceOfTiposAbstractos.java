package Operadores;

public class OperadoresInstanceOfTiposAbstractos {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase Object";
        Number decimal = 45.45;

        Boolean b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object "+ b1);

        b1 = texto instanceof Number;
        System.out.println("texto es del tipo Number "+ b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer "+ b1);

        b1 = texto instanceof Long;
        System.out.println("texto es del tipo Long "+ b1);

        b1 = texto instanceof String;
        System.out.println("texto es del tipo String "+ b1);

        b1 = texto instanceof Character;
        System.out.println("texto es del tipo Character "+ b1);

        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double "+ b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float "+ b1);

        Number decimalCompleto = Double.valueOf(45.45);
        System.out.println("decimalCompleto "+ decimalCompleto);

    }
}
