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
public class E4_OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        try {
            double dato1,dato2,suma,resta,multiplicacion,division;
        System.out.println("Digite porfavor sus dos numeros relaes a operar: ");
        System.out.print("Dato1: ");
        dato1=entrada.nextDouble();
        System.out.print("Dato2: ");
        dato2=entrada.nextDouble();
        
        System.out.println("*****SUMA*****");
        suma=(dato1+dato2);
        System.out.println(dato1+" + "+dato2+" = "+suma);
        System.out.println("*****RESTA****");
        resta=(dato1-dato2);
        System.out.println(dato1+" - "+dato2+" = "+resta);
        System.out.println("***MULTIPLICACION***");
        multiplicacion=(dato1*dato2);
        System.out.println(dato1+" * "+dato2+" = "+multiplicacion);
        System.out.println("*******DIVISION*****");
        division=(dato1/dato2);
        System.out.println(dato1+" /"+dato2+" = "+division);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
       
    }
    
}
