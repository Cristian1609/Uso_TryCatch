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
public class  F5_SemanaCuantitativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
             Scanner entrada = new Scanner(System.in);
        int dia;
        System.out.println("Digite el dia de la semana (1-7)");
        System.out.print("DIGITA:");
        dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("LUNES.");
                break;
            case 2:
                System.out.println("MARTES.");
                break;
            case 3:
                System.out.println("MIERCOLES.");
                break;
            case 4:
                System.out.println("JUEVES.");
                break;
            case 5:
                System.out.println("VIERNES.");
                break;
            case 6:
                System.out.println("SABADO.");
                break;
            case 7:
                System.out.println("DOMINGO.");
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
