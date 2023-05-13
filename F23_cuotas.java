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
import java.util.Scanner;

public class F23_cuotas {

    public static void main(String[] args) {
        
        try {
            Scanner entrada = new Scanner(System.in);
        
        double costoProducto,cuotas;
        int plazo;

        System.out.print("Ingrese el monto total del producto: ");
        costoProducto = entrada.nextDouble();

        System.out.print("Ingrese la cantidad de meses para pagar: ");
        plazo = entrada.nextInt();

        cuotas = costoProducto / (Math.pow(2, plazo) - 1);

        System.out.println("SUS CUOTAS SERAN POR MES =  " + cuotas);
        System.out.println("SALDO A PAGAR " + plazo + " meses es: " + (cuotas * plazo));
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }
}
