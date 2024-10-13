package operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*
        String[] usernames = new String[2];
        usernames[0] = "carlos";
        usernames[1] = "sandra";

        String[] passwords = new String[2];
        passwords[0] = "123";
        passwords[1] = "123";
         */

        //otra forma de expresar el array iniciando de una vez con los elementos
        String[] usernames = {"carlos","admin"};
        String[] passwords = {"123","1234"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String user = scanner.next();

        System.out.println("Ingrese el password");
        String pswd = scanner.next();

        boolean esAutenticado = false;

        for(int i =0; i < usernames.length;i++){
            if( (usernames[i].equals(user) && passwords[i].equals(pswd)) ){
                esAutenticado = true;
                break; //pasa salirse del for cuando ya encontro el usuario este se usa para el caso de mucho elementos mas de 10 por ejemplo
            }
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(user).concat("!") :"Datos incorrectos!.\nLo sentimos, Requiere Autenticacion";
        System.out.println(mensaje);

        /*
        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(user).concat("!")  );
        }else{
            System.out.println("Datos incorrectos!");
            System.out.println("Lo sentimos, Requiere Autenticacion");
        }
         */


    }
}
