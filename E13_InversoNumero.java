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
public class E13_InversoNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            int numero, posicion1, posicion2, contrario;
            System.out.print("Digite un número de dos cifras: ");
            numero = sc.nextInt();

            posicion1 = numero % 10;
            posicion2 = numero / 10;

            contrario = (posicion1 * 10) + posicion2;

            System.out.println("El número invertido es: " + contrario);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }

}
