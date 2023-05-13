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
public class E15_Iniciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
             Scanner entrada = new Scanner(System.in);
        String nombre1, nombre2, apellido1, apellido2, iniciales;

        System.out.print("ingresa tu nombre: ");
        nombre1 = entrada.nextLine();
        System.out.print("ingresa tu segundo nombre: ");
        nombre2 = entrada.nextLine();
        System.out.print("ingresa tu primer apellido: ");
        apellido1 = entrada.nextLine();
        System.out.print("ingresa tu segundo apellido: ");
        apellido2 = entrada.nextLine();

        char inicialNombre = nombre1.charAt(0);
        char inicialNombre2= nombre2.charAt(0);
        char inicialApellido1 = apellido1.charAt(0);
        char inicialApellido2 = apellido2.charAt(0);
        
        

        System.out.println(inicialNombre+""+inicialNombre2+""+inicialApellido1+""+inicialApellido2);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
       

        
    }

}
