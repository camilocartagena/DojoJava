package primitivos;

public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 2.12e3f;//2120.0
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en bytes a " + Float.BYTES);
        System.out.println("float corresponde en bites a  " + Float.SIZE);
        System.out.println("maxim valor para float  " + Float.MAX_VALUE);
        System.out.println("minim valor para float  " + Float.MIN_VALUE);


        double realDouble = 3.4028235E38d;
        System.out.println("realFloat = " + realDouble);
        System.out.println("double corresponde en bytes a " + Double.BYTES);
        System.out.println("double corresponde en bites a  " + Double.SIZE);
        System.out.println("maxim valor para double  " + Double.MAX_VALUE);
        System.out.println("minim valor para double  " + Double.MIN_VALUE);

        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);

    }
}