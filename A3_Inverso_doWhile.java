package General;

import java.util.Scanner;

/**
 *
 * @CRISTIAN ESTRADA
 */
public class A3_Inverso_doWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        try {
            String cadena = "";
            System.out.println("Bucle do while");
            System.out.print("ESCRIBE UNA CADENA DE CARACTERES = ");
            cadena = leer.nextLine();

            int longitud = (int) cadena.length() - 1;
            String inverso = " ";

            do {
                inverso += cadena.charAt(longitud);
                longitud--;
            } while (longitud >= 0);

            System.out.println("SU INVERSO ES = " + inverso);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }

}
