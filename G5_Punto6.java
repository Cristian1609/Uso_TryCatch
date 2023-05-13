package General;

import javax.swing.JOptionPane;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class G5_Punto6 {

    public static void main(String[] args) {

        try {
            String oracion = JOptionPane.showInputDialog(null, "DIGITA UNA ORACION");

            String[] palabras = oracion.split("\\s+");

            int cantidadPalabras = palabras.length;

            JOptionPane.showMessageDialog(null, "N° PALABRAS " + cantidadPalabras);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }

}
