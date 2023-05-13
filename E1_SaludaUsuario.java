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
public class E1_SaludaUsuario {

    
    public static void main(String[] args) {
       
        try {
             Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre=entrada.nextLine();
        System.out.println("hola "+nombre+" bienvenido");
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
       
    }
    
}
