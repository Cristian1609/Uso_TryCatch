/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package General;

import java.util.Scanner;

public class F14_Matrizpor20 {

    public static void main(String[] args) {

        try {
            int[][] matriz = new int[4][5];
            Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce 20 números enteros:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    matriz[i][j] = entrada.nextInt();
                }
            }

            System.out.println("Sumas parciales de filas:");
            for (int i = 01; i < 4; i++) {
                int sumaFila = 0;
                for (int j = 0; j < 5; j++) {
                    sumaFila += matriz[i][j];
                }
                System.out.println("Fila " + (i + 1) + ": " + sumaFila);
            }

            System.out.println("Sumas parciales de columnas:");
            for (int j = 0; j < 5; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < 4; i++) {
                    sumaColumna += matriz[i][j];
                }
                System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
            }

            int sumaTotal = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    sumaTotal += matriz[i][j];
                }
            }
            System.out.println("Suma total: " + sumaTotal);
            System.out.println("En la esquina inferior derecha: " + matriz[3][4]);

        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }
}
