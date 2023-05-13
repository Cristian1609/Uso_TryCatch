package General;

import javax.swing.JOptionPane;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class G2_Punto2 {

    public static void main(String[] args) {

        try {
             int dia, mes, año, divisible;

        dia = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL DIA:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL MES"));
        año = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL AÑO"));
        
        divisible = año % 4;
        String fecha = "" + dia + " / " + mes + " / " + año;
        String mensajeError = "" + dia + " / " + mes + " / " + año + "" + "\nFECHA NO CORRESPONDE.";

        System.out.println(divisible);

        if (mes <= 12 && mes != 0 && mes != 2 && mes != 4 && mes != 6 && mes != 9 && mes != 11 && dia >= 1 && dia <= 31 && año > 0) {

            JOptionPane.showMessageDialog(null, fecha + "\nMES CON 31 DIAS\nFECHA SI CORRESPONDE");

        } else if (mes <= 12 && mes != 0 && mes != 1 && mes != 2 && mes != 3 && mes != 5 && mes != 7 && mes != 8 && mes != 10 && mes != 12 && dia >= 1 && dia <= 30 && año > 0) {

            JOptionPane.showMessageDialog(null, fecha + "\nMES CON 30 DIAS\nFECHA SI CORRESPONDE");

        } else if (mes <= 12 && mes != 0 && mes == 2 && divisible == 0 && dia >= 1 && dia <= 29 && año > 0) {

            JOptionPane.showMessageDialog(null, fecha + "\nMES CON 29 DIAS\nFECHA SI CORRESPONDE");

        } else if (mes <= 12 && mes != 0 && mes == 2 && divisible != 0 && dia >= 1 && dia <= 28 && año > 0) {

            JOptionPane.showMessageDialog(null, fecha + "\nMES CON 28 DIAS\nFECHA SI CORRESPONDE");

        } else {

            JOptionPane.showMessageDialog(null, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
        }

        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
