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
public class E5_Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            double num1, num2, num3, media;
        System.out.println("Digite 3 valores para determinar su media: ");
        System.out.print("Dato1: ");
        num1=entrada.nextDouble();
        System.out.print("Dato2: ");
        num2=entrada.nextDouble();
        System.out.print("Dato3: ");
        num3=entrada.nextDouble();
        
        media=(num1+num2+num3)/3;
        System.out.println("su media o promedio es: ");
        System.out.println(num1+" + "+num2+" + "+num3+" / "+"3" + " = "+media);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
        
    }

}
