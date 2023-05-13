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
public class F24_desde0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
        Scanner entrada = new Scanner(System.in);
        int numero, orden = 1, paso;

        int auxiliarMayor = 0, auxiliarMenor = 0, auxiliarIgual = 0;

        System.out.println("Digita un numero que referencia los digitos que vas a ingresar:  ");
        System.out.print("DIGITA: ");
        
        numero = entrada.nextInt();

        for (int i = 0; i < numero; i++) {

            System.out.println("Digita numero: " + orden);
            System.out.print("DIGITA:");
           
            paso = entrada.nextInt();
            if (paso == 0) {

                auxiliarIgual++;
                System.out.println("--------------------");
            } else if (paso < 0) {

                auxiliarMenor++;
                System.out.println("--------------------");
            } else if (paso > 0) {
                auxiliarMayor++;
                System.out.println("--------------------");
            }
            orden++;
        }

        System.out.println("\033[34m                                  De los numeros digitados tienes:\n " + auxiliarIgual + " \033[35m->numeros iguales a 0\n " + auxiliarMenor + "\033[32m ->numeros menores a 0\n " + auxiliarMayor + "\033[36m ->numeros mayores a 0 ");
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
