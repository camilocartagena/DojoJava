package primitivos;

public class MetodosString {
    public static void main(String[] args) {
        String nombre = "camilo cartagena"; // no es primitivo sino referencia, es un objetivo por debajo con new
        System.out.println("nombre.length() = " + nombre.length()); //numero de caracteres
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // mayuscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // minuscula

        //concatenacion
        String curso = "Programacion jAVA";
        String profesor = "Camilo Cartagena";

        String detalle = curso + " con el instructor " + profesor;

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB); // concatena los numero y los presenta como 105 para que sume debe agregarse ()
        System.out.println(detalle + (numeroA + numeroB));

        String detalle2 = curso.concat(" con " + profesor);
        System.out.println("Detalle 2 = " + detalle2);

        // boolean equals(String b) compara si ambas son iguales, por valor
        String arg1 = "Hola Andres";
        String arg2 = new String("Hola Andres");
        String arg3 = new String(" Hola Andres ");

        //Chequea si son el mismo objeto
        System.out.println("Son el mismo objeto? " + (arg1 == arg2) ); // son dos instancia diferentes asi tengan el mismo valor

        //Chequea si tienen el mismo valor
        System.out.println("Tienes el mismo valor con equals? " + arg1.equals(arg2));

        // boolean equalsIgnoreCase(String b) compara si ambas son iguales indenpendiente si de mayusculas o minusculas
        System.out.println("Tienes el mismo valor con equalsIgnoreCase? " + arg1.equalsIgnoreCase(arg2));

        /* int compareTo(string b) Compara contra la cadena del argumento devolviendo
           - valor negativo si la cadena es anterior a b
           - cero (0) si la cadena es igual a b
           - un valor positivo si la cadena es posterior a b
         */
        System.out.println("Tienes el mismo valor con compareTo? " + arg1.compareTo(arg2)); // orden lexicografico es como utilizar equals()

        // String trim() crea un nuevo objeto eliminando el espacio en blanco que pudiera haber al principio o al final
        System.out.println(arg3.length());
        System.out.println(arg3.trim().length());

        // String trim quita espacios de la derecha e izquierda. Sirve para reparar los datos
        System.out.println("trim = " + arg3.trim());

        // char charAt(int position) Extrae un character en la position indicada
        System.out.println("charAt = " + arg1.charAt(0));

        // char[] toCharArray Convierte la cadena en un arreglo de caracteres
        char[] arrayArg1 = arg1.toCharArray();
        System.out.println("arrayArg1 = " + arrayArg1);

        // String substring(int a, int b) Extrae la sub-cadena entre las posiciones a y b
        System.out.println("substring(a,b) = " + arg1.substring(2,4));

        // String substring(int desde) Extrae la sub-cadena desde la posicion indicada
        System.out.println("substring(a) = " + arg1.substring(4));

        // int indexOf(String cadena) indican (return) en que position se encuentra el character (o cadena) indicando por primera vez, buscando desde el first
        System.out.println("indexOf = " + arg1.indexOf("l"));

        // int lastIndexOf(String cadena) indican (return) en que position se encuentra el character (o cadena) indicando por primera vez, buscando desde el final
        System.out.println("lastIndexOf = " + arg1.lastIndexOf("o"));

        // boolean contains lo contiene si o no
        System.out.println("contains = " + arg1.contains("l"));

        // boolean startsWith(String prefijo) Dice si la cadena comienza con el prefijo indicado
        System.out.println("startsWith = " + arg1.startsWith("H"));

        // boolean endsWith(String prefijo) Dice si la cadena termina con el prefijo indicado
        System.out.println("endsWith = " + arg1.endsWith("H"));

        // String[] split(String patron) Divide la cadena en varias subcadenas utilizando el patron indicado como separador
        String[] arrayStringArg1 = arg1.split(" ");
        System.out.println("split = " + arrayStringArg1[0]);

        //inmutabilidad del String
        String resultado= curso.concat(profesor);
        System.out.println("curso = " + curso );
        System.out.println("resultado = " + resultado);
        System.out.println("validacion de inmutabilidad = " + curso == resultado);

        //ejemplo de inmutabilidad, para este transformamos una variable con una funcion lambda o flecha
        String resultado2 = curso.transform(c->{
            return c + "con " + profesor;
                });
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3);

        // String replace que hace parte de la inmutabilidad, replace cambia los caracteres que se le indican
        String trabalenguas = "trabalenguas";
        System.out.println("replace = " + trabalenguas.replace("a","."));

        //como aplicar estos conocimientos
        String archivo = "algun_archivo.jpg";
        System.out.println("longitud archivo =" + archivo.length());
        System.out.println("archivo = " + archivo);
        int i = archivo.lastIndexOf("."); // retorna el numero de caracteres desde el inicio hasta el "." es mejor lastIndexOf() por que el nombre puede tener "."
        System.out.println("i = " + i);
        System.out.println("extencion = " + archivo.substring(i+1)); // substrae desde el numero identificado + 1

        //arreglos
        System.out.println("trabalenguas.toChartArray() =" + trabalenguas.toCharArray() );

        char[] arreglo = trabalenguas.toCharArray();
        int largo = trabalenguas.length(); // es un String es un metodo ()
        int largoArreglo = arreglo.length; // es un arrray o arreglo es un atributo
        System.out.println("largo = " + largo);
        System.out.println("largoArreglo = " + largoArreglo);
        for(int j = 0; j < largoArreglo; j++){
            System.out.println("arreglo = " + arreglo[j]); //println salto le linea print lo imprime en la misma
        }

        // String[] split(String patron) Divide la cadena en varias subcadenas utilizando el patron indicado como separador
        System.out.println("trabalenguas.split() = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a"); // Se define String[] por que se trabaja un metodo split()
        int largoArreglo2 = arreglo2.length;
        System.out.println("largoArreglo2 = " + largoArreglo2);
        for(int k = 0; k < largoArreglo2; k++){
            System.out.println("arreglo2 = " + arreglo2[k]); //println salto le linea print lo imprime en la misma
        }

        String archivo2 = "alguna.imagen.pdf";
        String[] archivoArray = archivo2.split("\\."); // no se puede utilizar solo el "." por que lo toma con una expresion regular y da cero(0) debe ser '\\.' o "[.]"
        int largoArchivoArray = archivoArray.length;
        System.out.println("largoArreglo3 = " + largoArchivoArray);
        for(int l = 0; l < largoArchivoArray; l++){
            System.out.println("arreglo3 = " + archivoArray[l]); //println salto le linea print lo imprime en la misma
        }

    }
}
