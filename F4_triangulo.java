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
public class F4_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            double lado1, lado2, hipotenusa, elevado;
            System.out.println("DIGITE LOS 3 LADOS DE SU TRIANGULO PARA CLASIFICARLO: ");
            System.out.print("Lado1: ");
            lado1 = entrada.nextDouble();
            System.out.print("Lado2: ");
            lado2 = entrada.nextDouble();
            System.out.print("Lado 3 o Hipotenusa : ");
            hipotenusa = entrada.nextDouble();

            elevado = Math.pow(lado1, 2) + Math.pow(lado2, 2);

            if (Math.pow(hipotenusa, 2) == elevado) {
                System.out.println("SU TRIANGULO ES RECTANGULO");
            } else if (lado1 == lado2 && lado2 != hipotenusa) {
                System.out.println("SU TRIANGULO ES ISOSELES");
            } else if (lado1 == hipotenusa && hipotenusa != lado2) {
                System.out.println("SU TRIANGULO ES ISOSELES");
            } else if (lado2 == hipotenusa && hipotenusa != lado1) {
                System.out.println("SU TRIANGULO ES ISOSELES");
            } else if (lado1 == lado2 && lado1 == hipotenusa && lado2 == hipotenusa) {
                System.out.println("SU TRIANGULO ES EQUILATERO");
            } else if (lado1 != lado2 && lado1 != hipotenusa && lado2 != hipotenusa) {
                System.out.println("SU TRIANGULO ES ESCALENO");
            } else {
                System.out.println("**********ERROR****************");
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }

}
