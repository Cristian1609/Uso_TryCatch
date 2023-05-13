package General;


import javax.swing.JOptionPane;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class G1_Punto1 {

    public static void main(String[] args) {

        try {
             int numeroS, dias, horas, temporal, minutos, segundos;
        

        numeroS = Integer.parseInt(JOptionPane.showInputDialog("Digita segundos: "));

        dias = numeroS / 86400;
        horas = numeroS / 3600;
        temporal = numeroS / 60;
        minutos = temporal % 60;
        segundos = numeroS % 60;

        String resultado = "DIAS              : " + " " + dias
                + " \nHORAS          : " + " " + horas
                + " \nMINUTOS      : " + " " + minutos
                + " \nSEGUNDOS   : " + " " + segundos;
        JOptionPane.showMessageDialog(null, resultado);

        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }
}
