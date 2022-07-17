import javax.swing.*;

public class OperadoresLogicosNombreLargo {
    public static void main(String[] args) {
        String nombreCompleto1 = JOptionPane.showInputDialog("Ingrese el Nombre y Apellido de la persona 1");
        String nombreCompleto2 = JOptionPane.showInputDialog("Ingrese el Nombre y Apellido de la persona 2");
        String nombreCompleto3 = JOptionPane.showInputDialog("Ingrese el Nombre y Apellido de la persona 3");

        String resultado = nombreCompleto1.split(" ")[0].length() > nombreCompleto2.split(" ")[0].length() ?  nombreCompleto1 : nombreCompleto2;
        resultado = resultado.split(" ")[0].length() > nombreCompleto3.split(" ")[0].length() ?  resultado : nombreCompleto3;


        if(nombreCompleto1.split(" ")[0].length() > nombreCompleto2.split(" ")[0].length() && nombreCompleto1.split(" ")[0].length() > nombreCompleto3.split(" ")[0].length()){
            JOptionPane.showMessageDialog(null,nombreCompleto1 + " tiene el nombre mas largo");
        }else if(nombreCompleto2.split(" ")[0].length() > nombreCompleto1.split(" ")[0].length() && nombreCompleto2.split(" ")[0].length() > nombreCompleto3.split(" ")[0].length()){
            JOptionPane.showMessageDialog(null,nombreCompleto2 + " tiene el nombre mas largo");
        }else if(nombreCompleto3.split(" ")[0].length() > nombreCompleto1.split(" ")[0].length() && nombreCompleto3.split(" ")[0].length() > nombreCompleto2.split(" ")[0].length()){
            JOptionPane.showMessageDialog(null,nombreCompleto3 + " tiene el nombre mas largo");
        }else{
            JOptionPane.showMessageDialog(null,"Existe empate y debes volver a ingresarlos");
            main(args);
            System.exit(0);
        }
    }
}
