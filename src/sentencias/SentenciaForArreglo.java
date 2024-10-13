package sentencias;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Andres","pepe","maria","Paco","lalo","Bea","Pato","Pepa"};
        int count = nombres.length;

        for(int i = 0 ; i < count; i ++){
            if(nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println("Nombre "+ i + " = " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\"");
        boolean encontrado = false;
        for(int i = 0 ; i < count; i ++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null,buscar + " Fue encontrado!");
        }else{
            JOptionPane.showMessageDialog(null, buscar + " No fue encontrado!");
        }
    }
}
