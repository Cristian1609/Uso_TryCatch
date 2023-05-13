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
public class E19_ConversionTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
       double Fahrenheit,Celcius;
       
        System.out.print("Digite la temperatura en grados Fahrenheit: ");
        Fahrenheit=entrada.nextDouble();
        System.out.println("La conversion es: ");
        
        Celcius=(Fahrenheit-32)/1.8;
        System.out.println(Fahrenheit+" Grados Fahrenheit "+" <-SON-> "+Celcius+" Grados Celcius");
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
       
    }
    
}
