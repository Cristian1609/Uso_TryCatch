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
public class E10_PuntosXyY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            double x1,x2,y1,y2,diferencia;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite los puntos tanto del eje X y Y");
        System.out.println("Eje X1 y Y1: ");
        System.out.print("X1: ");
        x1=entrada.nextDouble();
        System.out.print("y1: ");
        y1=entrada.nextDouble();
        
        System.out.println("Eje X2 y Y2: ");
        System.out.print("X2: ");
        x2=entrada.nextDouble();
        System.out.print("y2: ");
        y2=entrada.nextDouble();
        
         diferencia=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        
        System.out.println("distancia correspondiente:  " + diferencia);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
        
        
        
    }
    
}
