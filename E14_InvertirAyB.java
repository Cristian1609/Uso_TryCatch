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
public class E14_InvertirAyB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
             Scanner entrada = new Scanner(System.in);
        double variableA,variableB,variableC;
        System.out.println("Digite la variable A: ");
        variableA=entrada.nextDouble();
        System.out.println("Digite la variable B: ");
        variableB=entrada.nextDouble();
        
        variableC=variableA;
        variableA=variableB;
        variableB=variableC;
        
        System.out.println("A"+" = "+variableA);
        
        System.out.println("B"+" = "+variableB);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
       
        
        
        
        
        
        
    }
    
}
