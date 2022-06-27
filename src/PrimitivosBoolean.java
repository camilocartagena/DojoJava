public class PrimitivosBoolean {
    public static void main(String[] args) {

        //boolean or logic value TRUE o FALSE
        
        boolean datoLogic = Boolean.FALSE;
        System.out.println("datoLogic = " + datoLogic);
        
        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);
        
        float f = 12345e2f; // 123.45
        System.out.println("f = " + f);

        datoLogic = d > f;
        System.out.println("datoLogic = " + datoLogic);
        
        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
