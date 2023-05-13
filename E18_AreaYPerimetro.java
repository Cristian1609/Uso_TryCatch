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
public class E18_AreaYPerimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
             Scanner entrada = new Scanner(System.in);
        double base,altura,area,perimetro;
        System.out.print("Digite la base de su rectangulo: ");
        base=entrada.nextDouble();
        System.out.print("Digite la altura de su rectangulo: ");
        altura=entrada.nextDouble();
        System.out.println("**********AREA**********");
        System.out.print("El area de su rectangulo es: ");
        area=(base*altura);
        System.out.println(area);
        System.out.println("********************");

       perimetro=2*(base+altura);
        System.out.println("**********PERIMETRO**********");
        System.out.print("Su perimetro es: ");
        System.out.println(perimetro);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
       
        
        
    }
    
}
