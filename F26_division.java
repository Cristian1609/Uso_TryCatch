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
public class F26_division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
              Scanner entrada = new Scanner(System.in);
        double numero1, numero2;
        System.out.print("digite numero 1: ");
        numero1 = entrada.nextDouble();
        System.out.print("digite numero 2: ");
        numero2 = entrada.nextDouble();
        
        if (numero2==0) {
            System.out.println("lo siento su division no s epuede realizar");
        }else{
            System.out.println("Resultado de la division"+numero1/numero2);
        }
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
