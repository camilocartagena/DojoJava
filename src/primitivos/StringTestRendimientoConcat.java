package primitivos;

public class StringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis(); //System.currentTimeMillis() valor de tiempo en milisegundo

        //flujo de control para hacer el control de interaccion de la concatenacion
        for(int i = 0; i < 500; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500  => 3ms
            //c += a + b + "\n"; // 500  => 18ms
            sb.append(a).append(b).append("\n"); // 500  => 1ms
        }

        long fin = System.currentTimeMillis();
        System.out.println("tiempo que le tomo en milisegundos= " + (fin - inicio) + "Millis");
        System.out.println("c = " + c);

        System.out.println("sb = " + sb);
    }
}
