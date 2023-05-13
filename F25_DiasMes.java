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
public class F25_DiasMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
              Scanner entrada = new Scanner(System.in);
        int mes;
        System.out.println("Digite el numero de un mes (1-12) ");
        System.out.print("DIGITE: ");
        mes = entrada.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero tiene 31 dias.");
                break;
            case 2:
                System.out.println("Febrero tiene 28 dias.");
                break;
            case 3:
                System.out.println("Marzo tiene 31 dias.");
                break;
            case 4:
                System.out.println("Abril tiene 30 dias.");
                break;
            case 5:
                System.out.println("Mayo tiene 31 dias.");
                break;
            case 6:
                System.out.println("Junio tiene 30 dias.");
                break;
            case 7:
                System.out.println("Julio tiene 31 dias.");
                break;
            case 8:
                System.out.println("Agosto tiene 31 dias.");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 dias.");
                break;
            case 10:
                System.out.println("Octubre tiene 31 dias.");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 dias.");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 dias.");
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
