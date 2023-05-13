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
public class F8_ParOimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner entrada = new Scanner(System.in);
            double numero, resultado;
            System.out.println("digite un numero:");
            numero = entrada.nextDouble();
            resultado = numero % 2;

            if (resultado == 0) {
                System.out.println("su numero es par");
            } else {
                System.out.println("su numero es impar");
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }

}
