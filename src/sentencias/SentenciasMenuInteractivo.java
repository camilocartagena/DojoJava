package sentencias;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class SentenciasMenuInteractivo {
    public static void main(String[] args) {

        boolean menuActivo = true;
        do{

            int opcionIndice = 0;
            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Actualizar",1);
            opciones.put("Eliminar",2);
            opciones.put("Agregar",3);
            opciones.put("Listar",4);
            opciones.put("Salir",5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,"Seleccione una Opcion","Mantenedor de Productos",JOptionPane.INFORMATION_MESSAGE,null,opArreglo,opArreglo[0]);

            if(opcion == null){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un operador");
            }else{
                opcionIndice = opciones.get(opcion.toString());
                switch (opcionIndice){
                    case 1:
                        JOptionPane.showMessageDialog(null,"Usuario actualizado correctamente");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Usuario eliminado correctamente");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Usuario Agregado correctamente");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"Usuario listado correctamente");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"Haz salido con exito!");
                        System.exit(0);
                    default:
                        JOptionPane.showMessageDialog(null,"Debe seleccionar una opcion");
                        menuActivo = false;
                        System.exit(0);
                }

            }
        } while (menuActivo);
    }
}
