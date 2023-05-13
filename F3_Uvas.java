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
public class F3_Uvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            double precio, total;
            int tipo, tamaño;
            System.out.println("Hola vinicultor digita el prcio*kilo de tus uvas:");
            System.out.print("DIGITA: ");
            precio = entrada.nextDouble();

            System.out.println("Seleccioneel numero de  su tipo de uva");
            System.out.println("00. Tipo de uva A");
            System.out.println("01. Tipo de uva B");
            System.out.print("Digita: ");
            tipo = entrada.nextInt();

            switch (tipo) {
                case 00:
                    System.out.println("Tipo de uva A");
                    break;
                case 01:
                    System.out.println("Tipo de uva B");
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("Cual es el tamano de su uva 1 o 2: ");
            tamaño = entrada.nextInt();
            if (tamaño <= 1 || tamaño <= 2) {
                System.out.println("tamano recibido");
            }

            if (tipo == 00 && tamaño == 1) {
                total = precio + 20;
                System.out.println("Su precio seria: " + total);
            } else if (tipo == 00 && tamaño == 2) {
                total = precio + 30;
                System.out.println("Su precio seria: " + total);
            } else if (tipo == 01 && tamaño == 1) {
                total = precio - 30;
                System.out.println("Su precio seria: " + total);
            } else if (tipo == 01 && tamaño == 2) {
                total = precio - 50;
                System.out.println("Su precio seria: " + total);
            }

        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
