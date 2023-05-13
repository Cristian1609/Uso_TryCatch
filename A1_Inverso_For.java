package general;

import java.util.Scanner;

/**
 *
 * @CRISTIAN ESTRADA
 */
public class A1_Inverso_For {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        try {
            String cadena;
            String inverso = " ";

            System.out.println("Bucle for");
            System.out.print("ESCRIBE UNA CADENA DE CARACTERES = ");
            cadena = leer.nextLine();

            for (int contador = cadena.length() - 1; contador >= 0; contador--) {

                inverso += cadena.charAt(contador);

            }

            System.out.println("SU INVERSO ES = " + inverso);

        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }

}
