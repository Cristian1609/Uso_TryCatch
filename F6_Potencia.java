/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package General;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class F6_Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner entrada = new Scanner(System.in);

            double base;
            int potencia, valor = 1;

            System.out.println("DIGITA EL NUMERO BASE  A OPERAR. ");
            System.out.print("DIGITA: ");
            base = entrada.nextDouble();
            System.out.println("DIGITA EL NUMERO DE LA POTENCIA. ");
            System.out.print("DIGITA: ");
            potencia = entrada.nextInt();

            for (int i = 0; i <= potencia; i++) {
                valor *= base;
                System.out.println("el sesultado es: " + valor);
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
