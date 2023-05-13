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
public class F12_MayusculaOMinuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
             String palabra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digita una palabra: ");
        palabra = entrada.nextLine();

        boolean mayuscula = false;

        for (int i = 0; i < palabra.length(); i++) {

            if (Character.isUpperCase(palabra.charAt(i))) {

                mayuscula = true;
                break;
            }
        }

        if (mayuscula) {
            System.out.println("es mayuscula: ");
        } else {
            System.out.println("no es mayuscula:");
        }

        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
       
    }

}
