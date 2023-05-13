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
public class F10_OpuestoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);

            int numero;

            System.out.println("Digite el numero que obtuvo en el dado: ");
            System.out.print("DIGITE: ");
            numero = entrada.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("El opuesto es el seis.");
                    break;
                case 2:
                    System.out.println("El opuesto es el cinco.");
                    break;
                case 3:
                    System.out.println("El opuesto es el cuatro.");
                    break;
                case 4:
                    System.out.println("El opuesto es el tres.");
                    break;
                case 5:
                    System.out.println("el opuesto es el dos.");
                    break;
                case 6:
                    System.out.println("El opuesto es el uno.");
                    break;
                default:
                    System.out.println("<<ERROR: numero incorrecto>>.");
                    throw new AssertionError();
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }

}
