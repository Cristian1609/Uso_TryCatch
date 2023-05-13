/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package General;

import com.sun.source.tree.SwitchTree;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class F9_pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner entrada = new Scanner(System.in);

            int dato1, dato2, temporal, contadorPares = 0, pares;
            System.out.println("UN RANGO DE NUMEROS PARA DEFINIR LOS PARES QUE EXISTEN: ");
            System.out.print("DATO 1: ");
            dato1 = entrada.nextInt();
            System.out.print("DATO 2: ");
            dato2 = entrada.nextInt();

            if (dato1 > dato2) {

                temporal = dato1;
                dato1 = dato2;
                dato2 = temporal;
//            System.out.println("dato1:"+dato1);
//            System.out.println("dato2:"+dato2);
                System.out.println("----------next----------");

            } else if (dato1 < dato2) {

//            System.out.println("dato1:"+dato1);
//            System.out.println("dato2:"+dato2);
                System.out.println("----------next----------");
            }

            if (dato1 % 2 != 0) {
                dato1++;
                System.out.println("dato1: " + dato1);
                System.out.println("dato2: " + dato2);
            }
            for (pares = dato1; pares <= dato2; pares++) {

                if (pares % 2 == 0) {
                    System.out.println("Los pares son: " + pares);

                }

                if (dato1 == 0 && dato2 == 0) {
                    System.out.println("no existe nada");
                    throw new AssertionError();

                }

            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
