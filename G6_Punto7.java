package General;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @Cristian_Adolfo_Estrada_Lindarte-02210132001
 */
public class G6_Punto7 {

    public static void main(String[] args) {

        try {
             JOptionPane.showMessageDialog(null, "DIGITARAS DATOS PRA EL VECTOR 1 Y VECTOR 2");
        int PrimerLongitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del primer vector:"));
        int segundaLongitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del segundo vector:"));

        int[] PrimerAlmacen = new int[PrimerLongitud];
        int[] SegundoAlmacen = new int[segundaLongitud];

        JOptionPane.showMessageDialog(null, "Digita los datos del primer vector..");
        for (int i = 0; i < PrimerLongitud; i++) {
            PrimerAlmacen[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "DATO N°" + (i + 1)));
        }

        JOptionPane.showMessageDialog(null, "Digita los datos del segundo vector..");
        for (int i = 0; i < segundaLongitud; i++) {
            SegundoAlmacen[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "DATO N°" + (i + 1)));
        }

        int[] Unico = new int[PrimerLongitud + segundaLongitud];

        System.arraycopy(PrimerAlmacen, 0, Unico, 0, PrimerLongitud);
        System.arraycopy(SegundoAlmacen, 0, Unico, PrimerLongitud, segundaLongitud);

        Arrays.sort(Unico);

        JOptionPane.showMessageDialog(null, "El vector fusionado y ordenado es:\n" + Arrays.toString(Unico));
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
