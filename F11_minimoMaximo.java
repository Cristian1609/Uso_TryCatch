/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package General;

/**
 *
 * @author USUARIO
 */
import java.util.Arrays;
import java.util.Scanner;

public class F11_minimoMaximo {

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);

        int datos;

        System.out.println("DIGITE CUANTOS DATOS VA A INGRESAR: ");
        System.out.print("DIGITA: ");
        datos = entrada.nextInt();

        int[] numeros = new int[datos];
        
        for (int i = 0; i < datos; i++) {
            System.out.print("Introduce el nnmero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        Arrays.sort(numeros);

       
        int contadorMayor = numeros[0];
        int contadorMenor = numeros[0];
        
        for (int i = 1; i < datos; i++) {
            if (numeros[i] > contadorMayor) {
                contadorMayor = numeros[i];
            }

            if (numeros[i] < contadorMenor) {
                contadorMenor = numeros[i];
            }
        }

       
        for (int i = 0; i <datos; i++) {
            System.out.print(numeros[i]);

            
            if (numeros[i] == contadorMayor) {
                System.out.print("----------maximo");
            }

            if (numeros[i] == contadorMenor) {
                System.out.print("----------minimo");
            }

            System.out.println();
        }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
        
    }
}
