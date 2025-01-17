package primitivos;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        
        int numeroBinario = 0b111110100; // Se pone 0b para binario
        System.out.println("numeroBinario = " + numeroBinario);
        String resultadoOctal = "numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764; // Se antepone el cero para octal
        System.out.println("numeroOctal = " + numeroOctal);
        String resultadoHexadecimal = "numero hexadecimal de " + numeroOctal+ " = " + Integer.toHexString(numeroOctal);
        System.out.println(resultadoHexadecimal);
        
        int numeroHex = 0x1f4; // Se pone 0x para hexadecimal
        System.out.println("numeroHex = " + numeroHex);
        String mensaje = resultadoBinario + "\n";
        mensaje += resultadoOctal + "\n";
        mensaje += resultadoHexadecimal + "\n";

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
