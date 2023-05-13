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
public class F15_Llamadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);

            int callTime, dia, estado;
            double impuesto, costo;

            System.out.println("Hola, digita el tiempo que duro la llamada: ");
            System.out.print("DIGITE: ");
            callTime = entrada.nextInt();
            System.out.println("Selecciona el numero del dia en que se realiza la llamada: : ");

            System.out.println("1.Lunes");
            System.out.println("2.Martes");
            System.out.println("3.Miercoles");
            System.out.println("4.Jueves");
            System.out.println("5.Viernes");
            System.out.println("6.Sabado");
            System.out.println("7.Domingo");
            System.out.print("DIGITE: ");
            dia = entrada.nextInt();

            switch (dia) {
                case 1:
                    System.out.println("Dia Lunes.");
                    break;
                case 2:
                    System.out.println("Dia Martes.");
                    break;
                case 3:
                    System.out.println("Dia Miercoles.");
                    break;
                case 4:
                    System.out.println("Dia Jueves.");
                    break;
                case 5:
                    System.out.println("Dia Viernes.");
                    break;
                case 6:
                    System.out.println("Dia Sabado.");
                    break;
                case 7:
                    System.out.println("Dia Domingo.");
                    break;
                default:
                    throw new AssertionError();
            }

            System.out.println("Elije entre mañana y tarde, correspondiente a tu llamada:  ");
            System.out.println("00.Mañana");
            System.out.println("01.Tarde");
            System.out.print("DIGITE: ");
            estado = entrada.nextInt();

            if (estado == 00 || estado == 01) {

                switch (estado) {
                    case 00:
                        System.out.println("Selecciono mañana.");
                        break;
                    case 01:
                        System.out.println("Selecciono tarde.");

                }
            } else {
                System.out.println("El dato debe ser 00 o 01");
                throw new AssertionError();
            }

            System.out.println("********************************************");

            if (callTime <= 5 && dia == 7) {
                costo = 1;
                impuesto = (costo * 0.03) + costo;
                System.out.println("su costo es de: " + impuesto);
            } else if (callTime <= 5 && dia < 7 && estado == 00) {
                costo = 1;
                impuesto = (costo * 0.15) + costo;
                System.out.println("su costo es de: " + impuesto);
            } else if (callTime <= 5 && dia < 7 && estado == 01) {
                costo = 1;
                impuesto = (costo * 0.10) + costo;
                System.out.println("su costo es de: " + (impuesto));
            } else if (callTime > 5 && callTime <= 8 && dia == 7) {
                costo = 1 + 0.80;
                impuesto = (costo * 0.03) + costo;
                System.out.println("su costo es de; " + impuesto);

            } else if (callTime > 5 && callTime <= 8 && dia < 7 && estado == 00) {
                costo = 1 + 0.80;
                impuesto = (costo * 0.15) + costo;
                System.out.println("su costo es de:" + impuesto);
            } else if (callTime > 5 && callTime <= 8 && dia < 7 && estado == 01) {
                costo = 1 + 0.80;
                impuesto = (costo * 0.10) + costo;
                System.out.println("su costo es de:" + impuesto);
            } else if (callTime > 8 && callTime <= 10 && dia == 7) {
                costo = 1 + 0.80 + 0.70;
                impuesto = (costo * 0.03) + costo;
                System.out.println("su costo es de:" + impuesto);
            } else if (callTime > 8 && callTime <= 10 && dia < 7 && estado == 00) {
                costo = 1 + 0.80 + 0.70;
                impuesto = (costo * 0.15) + costo;
                System.out.println("su costo es de:" + impuesto);
            } else if (callTime > 8 && callTime <= 10 && dia < 7 && estado == 01) {
                costo = 1 + 0.80 + 0.70;
                impuesto = (costo * 0.10) + costo;
                System.out.println("su costo es de:" + impuesto);
            } else if (callTime > 10 && dia == 7) {
                costo = 1 + 0.80 + 0.70 + 0.50;
                impuesto = (costo * 0.03) + costo;
                System.out.println("su costo es de:" + impuesto);

            } else if (callTime > 10 && dia < 7 && estado == 00) {
                costo = 1 + 0.80 + 0.70 + 0.50;
                impuesto = (costo * 0.15) + costo;
                System.out.println("su costo es de:" + impuesto);
            } else if (callTime > 10 && dia < 7 && estado == 01) {
                costo = 1 + 0.80 + 0.70 + 0.50;
                impuesto = (costo * 0.10) + costo;
                System.out.println("su costo es de:" + impuesto);
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
