/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package General;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class F16_inverso10 {

    public static void main(String[] args) {

        try {
            int[] numeros;
        int longitusArray;
        Scanner entrada = new Scanner(System.in);
        

       
        System.out.println("DIGITA LA CANTIDAD DE DATOS QUE DEEAS INVERTIR: ");
        System.out.print("DIGITA: ");
        longitusArray=entrada.nextInt();
        numeros = new int[longitusArray];
        System.out.println("DIGITA NUMEROS DEJANDO UN ESPACIO DE POR MEDIO.");
        System.out.print("DIGITA "+longitusArray +" NUMEROS: ");
        
        for (int i = 0; i < longitusArray; i++) {
            numeros[i] = entrada.nextInt();
        }

       
        System.out.println("LOS INVERSOS :");
        for (int i = longitusArray-1; i >= 0; i--) {
            System.out.print(numeros[i]+" ");
            
        }
        System.out.println(" ");
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }
}
