package primitivos;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        
        char character = '\u0040';
        char decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = character " + (decimal == character)); //presedencia de los operadores
        
        char simbolo = '@';
        System.out.println("simbol = " + simbolo);
        System.out.println("simbol = character " + (simbolo == character));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n'; // System.lineSeparator() o System.getProperty("line.separator")
        char retornoCarro = '\r'; // funciona new line

        System.out.println("char corresponde en byte = " + retornoCarro +  nuevaLinea + tabulador + retroceso + espacio + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character MIN VALUE = " + Character.MIN_VALUE);
        System.out.println("Character MAX VALUE = " + Character.MAX_VALUE);

    }
}
