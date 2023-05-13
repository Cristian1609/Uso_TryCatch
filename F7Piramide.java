/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package General;

import java.util.Scanner;

public class F7Piramide {

    public static void main(String[] args) {

        try {
            Scanner entrada = new Scanner(System.in);
            int numeros;
            System.out.println("IGITA LONGITUD DE LA PIRAMIDE: ");
            System.out.print("DIGITA: ");
            numeros = entrada.nextInt();

            System.out.println("-------------------------------------------");
            for (int i = 1; i <= numeros; i++) {

                for (int j = 1; j <= numeros - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print("\033[35m" + j);
                }

                for (int j = i - 1; j >= 1; j--) {
                    System.out.print("\033[35m" + j);
                }

                System.out.println(" ");

            }

            System.out.println("-------------------------------------------");
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }
}
