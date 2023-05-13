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
public class F13_MayorOMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner entrada = new Scanner(System.in);

            double numero1, numero2, respuesta;
            System.out.print("Digite numero 1:");
            numero1 = entrada.nextDouble();
            System.out.print("Digite numero 2:");
            numero2 = entrada.nextDouble();

            if (numero1 == numero2) {
                System.out.println("son iguales");
            } else if (numero2 > numero1) {
                System.out.println("el numero mayor es:" + numero2);
                System.out.println("el numero menor es:" + numero1);

            } else if (numero1 > numero2) {
                System.out.println("el numero mayor es: " + numero1);
                System.out.println("el numero menor es: " + numero2);
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
