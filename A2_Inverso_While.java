/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package General;

import java.util.Scanner;

/**
 *
 * @CRISTIAN ESTRADA
 */
public class A2_Inverso_While {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        try {
            String cadena;
        String inverso = " ";
        int digitos;
        System.out.println("Bucle while");
        System.out.print("ESCRIBE UNA CADENA DE CARACTERES = ");
        cadena = leer.nextLine();
        digitos = cadena.length();
        while (digitos != 0) {
            inverso += cadena.charAt(digitos - 1);
            digitos--;
        }
        System.out.println("SU INVERSO ES = " + inverso);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
        
    }

}
