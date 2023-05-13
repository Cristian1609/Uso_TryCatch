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
public class F2_Viajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            int lugar, contador = 1;
            double peso, costo;
            System.out.println("Selecciona tu destino (1-5): ");
            System.out.println("1.AMERICA DEL NORTE.");
            System.out.println("2.AMERICA CENTRAL.");
            System.out.println("3.AMERICA DEL SUR.");
            System.out.println("4.EUROPA.");
            System.out.println("5.ASIA.");
            System.out.print("ELIGE: ");
            lugar = entrada.nextInt();
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("Digita el peso de tu equipaje:");
            System.out.print("DIGITA:");
            peso = entrada.nextDouble();

            if (peso > 5) {
                System.out.println("SU EQUIPAJE NO PUEDE SER TRANSPORTADO POR CUESTIONES LOGISTICAS Y DE SEGURIDAD.");
                throw new AssertionError();
            } else {
                switch (lugar) {
                    case 1:
                        costo = peso * 24.00;
                        System.out.println(contador + "." + "          Tu destino es AMERICA DEL NORTE.");
                        System.out.println((contador + 1) + "." + "          Tu costo es de: " + costo);
                        break;
                    case 2:
                        costo = peso * 20.00;
                        System.out.println(contador + "." + "          Tu destino es AMERICA CENTRAL.");
                        System.out.println((contador + 1) + "." + "          Tu costo es de: " + costo);
                        break;
                    case 3:
                        costo = peso * 21.00;
                        System.out.println(contador + "." + "          Tu destino es AMERICA DEL SUR.");
                        System.out.println((contador + 1) + "." + "          Tu costo es de: " + costo);
                        break;
                    case 4:
                        costo = peso * 10.00;
                        System.out.println(contador + "." + "          Tu destino es EUROPA.");
                        System.out.println((contador + 1) + "." + "          Tu costo es de: " + costo);
                        break;
                    case 5:
                        costo = peso * 18.00;
                        System.out.println(contador + "." + "          Tu destino es ASIA.");
                        System.out.println((contador + 1) + "." + "          Tu costo es de: " + costo);
                        break;

                    default:
                        System.out.println("          <<ERROR: numero incorrecto>>.");
                        throw new AssertionError();
                }

            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }
}
