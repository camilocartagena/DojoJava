public class ConversionDeTiposPrimitivos {
    public static void main(String[] args) {
        String numeroStr = "50";

        //para la conversion de tipo de datos parse.

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicStr = "true";
        boolean logicBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicBoolean = " + logicBoolean);
        
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt); // valueOf otra forma de convertir primitivos a tipo string - sobrecarga de metodo
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32766; // uno que no cabe 42768 para que pruebes
        short s = (short) i;
        System.out.println("short = " + s);
        long l = i;
        System.out.println("long = " + l);
        System.out.println("Short.MAX_VALUE " +  Short.MAX_VALUE);
        char ch = (char) i;
        System.out.println("character = " + ch);
        float f = (float) i;
        System.out.println("float = " + f);

    }
}
