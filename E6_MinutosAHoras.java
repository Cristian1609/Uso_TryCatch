/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package General;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class E6_MinutosAHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            int minutos, horas;
            System.out.print("Ingrese la cantidad de minutos a convertir: ");
            minutos = entrada.nextInt();

            horas = minutos / 60;
            minutos = minutos % 60;

            System.out.println(" Los minutos ingresados son:  " + horas + " horas y " + minutos + " minutos");
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }

}
