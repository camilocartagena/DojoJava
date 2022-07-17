package Operadores;

public class OperadoresPrecedencia {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 2;
        
        //Siempre se debe tener en cuenta la precedencia en las Operaciones de derecha a izquierda
        
        double promedio = ( i + j + k ) / 3;
        System.out.println("promedio = " + promedio);


        promedio = i + j + k / 3d * 10; //3d 3.0 double, se resuelve division, multi y luego sumas de derecha a izquierda = 28.666666
        System.out.println("promedio = " + promedio);

        promedio = --i + j++ + k / 3d * 10;
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
