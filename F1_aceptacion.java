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
public class F1_aceptacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner entrada = new Scanner(System.in);

        double nota;
        int edad, menu;

        System.out.println("                programa de aceptacion: ");
        
        
        System.out.print("digite una nota entre 0 y 5: ");
        nota = entrada.nextDouble();
        if (nota < 0 || nota > 5) {
            System.out.println("La nota debe estar entre 0 y 5");
            throw new AssertionError();
        } else {
            System.out.println("nota recibida");
        }
        System.out.print("Digite su edad: ");
        edad = entrada.nextInt();
        System.out.println("************************************************");
        System.out.println("seleccioneel digito correspondiente a  su sexo: ");
        System.out.println("1. masculino");
        System.out.println("2. femenino");
        System.out.println("3. indefinido");
        System.out.print("DIGITE: ");
        menu = entrada.nextInt();
        
        switch (menu) {
            case 1:
                System.out.print("sexo masculino.");
                break;
            case 2:
                System.out.print("sexo femenino.");
                break;
            case 3:
                System.out.print("indefinido.");
            default:
                throw new AssertionError();

        }
        System.out.println("...");
        //la nota lo tome como igual a cinco por nota de la U 
        if (nota == 5 && edad >= 18 && menu == 1) {
            System.out.println("ES POSIBLE SU ACEPTACION");
        } else if (nota == 5 && edad >= 18 && menu == 2) {
            System.out.println("USTED FUE ACEPTADA");
        } else {
            System.out.println("NO FUE ACEPTADO");
        }

        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
