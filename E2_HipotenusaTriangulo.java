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

public class E2_HipotenusaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
        double cateto1,cateto2,hipotenusa,temporal;
        System.out.println("Digita por favor los catetos de tu triangulo: ");
        System.out.print("Cateto1: ");
        cateto1=entrada.nextDouble();
        System.out.print("Cateto2: ");
        cateto2=entrada.nextDouble();
        System.out.println("Su hipotenusa es: ");
        
        temporal=Math.pow(cateto1,2)+Math.pow(cateto2,2);
        
        hipotenusa=Math.sqrt(temporal);
        System.out.println(hipotenusa);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
        
        
    }
    
}
