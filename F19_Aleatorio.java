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
public class F19_Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
             int numUsuario, aleatorio, oportunidades = 0;
        Scanner entrad = new Scanner(System.in);

        System.out.println("\033[34m                  APLICACION PARA ADIVINAR NUMEROS");
        aleatorio = (int) (Math.random() * 100) + 1;
        System.out.println("DIGITO:" + aleatorio);

        while (oportunidades <=9) {

            
            System.out.println("\033[34m INTENTA ADIVINARLO-----");
            System.out.print("\033[34m DIGITA: ");
            numUsuario = entrad.nextInt();

            if (numUsuario == aleatorio) {

                System.out.println("\033[32m                   EXCELENTE ADIVINASTE.");
                break;

            } else if (numUsuario > aleatorio) {
                System.out.println("\033[31m                   LO SIENTO NO LE ATINASTE PERO ESTAS CERCA");
                System.out.println("\033[31m                   TEN CUIDADO TE QUEDAN " + (9 - oportunidades) + " oportunidades");
                System.out.println("\033[31m                   PISTA: el numero que buscas es menor");
            } else if (numUsuario < aleatorio) {
                System.out.println("\033[35m                   LO SIENTO NO LE ATINASTE PERO ESTAS CERCA");
                System.out.println("\033[35m                   TEN CUIDADO TE QUEDAN " + (9 - oportunidades) + " oportunidades");
                System.out.println("\033[35m                   PISTA: el numero que buscas es mayor.");
            }

            oportunidades++;
            System.out.println("---------------------------------------------------------------------------------------------------");

        }

        if (oportunidades >9) {
            System.out.println("                  GAME OVER: SE TE ACABARON LO INTENTOS");
            System.out.println("                  TU RESPUESTA FUE INCORRECTA, EL NUMERO ES: " + aleatorio);
            System.out.println("                  SUERTE LA PROXIMA.");
            
        }else{
                        System.out.println("---------------------------------------------------------------------------------------------------");

        }
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }
}
