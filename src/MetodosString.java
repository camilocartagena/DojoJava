public class MetodosString {
    public static void main(String[] args) {
        String nombre = "camilo cartagena";
        System.out.println(nombre.length()); //numero de caracteres

        // boolean equals(String b) compara si ambas son iguales, por valor
        String arg1 = "Hola Andres";
        String arg2 = new String("Hola Andres");
        String arg3 = new String(" Hola Andres ");

        //Chequea si son el mismo objeto
        System.out.println("Son el mismo objeto? " + (arg1 == arg2) );

        //Chequea si tienen el mismo valor
        System.out.println("Tienes el mismo valor con equals? " + arg1.equals(arg2));

        // boolean equalsIgnoreCase(String b) compara si ambas son iguales indenpendiente si de mayusculas o minusculas
        System.out.println("Tienes el mismo valor con equalsIgnoreCase? " + arg1.equalsIgnoreCase(arg2));

        /* int compareTo(string b) Compara contra la cadena del argumento devolviendo
           - valor negativo si la cadena es anterior a b
           - cero (0) si la cadena es igual a b
           - un valor positivo si la cadena es poterior a b
         */
        System.out.println("Tienes el mismo valor con compareTo? " + arg1.compareTo(arg2));

        // String trim() crea un nuevo objeto eliminando el espacio en blanco que pudiera haber al principio o al final
        System.out.println(arg3.length());
        System.out.println(arg3.trim().length());
        System.out.println(arg3.trim());

        // char charAt(int posicion) Extrae un caracter en la posicion indicada
        System.out.println(arg1.charAt(0));

        // char[] toCharArray Convierte la cadena en un arreglo de caracteres
        char[] arrayArg1 = arg1.toCharArray();
        System.out.println(arrayArg1);

        // String substring(int a, int b) Extrae la sub-cadena entre las posiciones a y b
        System.out.println(arg1.substring(2,4));

        // String substring(int desde) Extrae la sub-cadena desde la posicion indicada
        System.out.println(arg1.substring(4));

        // int indexOf(String cadena) indican en que posicion se encuentra el caracter (o cadena) indicando por primera vez, buscando desde el principio
        System.out.println(arg1.indexOf("l"));

        // int lastIndexOf(String cadena) indican en que posicion se encuentra el caracter (o cadena) indicando por primera vez, buscando desde el final
        System.out.println(arg1.lastIndexOf("o"));

        // boolean startsWith(String prefijo) Dice si la cadena comienza con el prefijo indicado
        System.out.println(arg1.startsWith("H"));

        // boolean endsWith(String prefijo) Dice si la cadena termina con el prefijo indicado
        System.out.println(arg1.endsWith("H"));

        // String[] split(String patron) Divide la cadena en varias subcadenas utilizando el patron inficado como separador
        String[] arrayStringArg1 = arg1.split(" ");
        System.out.println(arrayStringArg1[0]);

    }
}
