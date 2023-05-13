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
public class E8_DescuentoTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        try {
            double valorVenta,descuento;
       
        System.out.println("Digite el valor total de su compra: ");
        valorVenta=entrada.nextDouble();
        System.out.println("Su descuento es: ");
        descuento=valorVenta*15/100;
        System.out.println(descuento);
        System.out.println("Valor a pagar: ");
        System.out.println(valorVenta-descuento);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
       
        
        
    }
    
}
