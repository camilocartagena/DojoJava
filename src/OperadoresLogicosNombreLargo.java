import javax.swing.*;

public class OperadoresLogicosNombreLargo {
    public static void main(String[] args) {
        String nombreCompleto1 = JOptionPane.showInputDialog("Ingrese el Nombre y Apellido de la persona 1");
        String[] nombre1 = nombreCompleto1.split(" ");
        String nombreCompleto2 = JOptionPane.showInputDialog("Ingrese el Nombre y Apellido de la persona 2");
        String[] nombre2 = nombreCompleto2.split(" ");
        String nombreCompleto3 = JOptionPane.showInputDialog("Ingrese el Nombre y Apellido de la persona 3");
        String[] nombre3 = nombreCompleto3.split(" ");

        if(nombre1[0].length() > nombre2[0].length() && nombre1[0].length() > nombre3[0].length()){
            JOptionPane.showMessageDialog(null,nombreCompleto1 + " tiene el nombre mas largo");
        }else if (nombre2[0].length() > nombre1[0].length() && nombre2[0].length() > nombre3[0].length()){
            JOptionPane.showMessageDialog(null,nombreCompleto2 + " tiene el nombre mas largo");
        }else if (nombre3[0].length() > nombre1[0].length() && nombre3[0].length() > nombre2[0].length()){
            JOptionPane.showMessageDialog(null,nombreCompleto3 + " tiene el nombre mas largo");
        }else{
            JOptionPane.showMessageDialog(null,"Existe empate y debes volver a ingresarlos");
            main(args);
            System.exit(0);
        }
    }
}
