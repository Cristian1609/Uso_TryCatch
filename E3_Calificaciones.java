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
public class E3_Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            double nota1, nota2, nota3, notaTemporal, examenFinal, examenfinalTemporal, proyectoFinal, proyectoFinalTemporal, definitiva;

            System.out.println("Digita tus calificaciones: ");
            System.out.println("Las pertenecientes a tareas  equivalente al 55%: ");

            System.out.print("Nota1: ");
            nota1 = entrada.nextDouble();
            System.out.print("Nota2: ");
            nota2 = entrada.nextDouble();
            System.out.print("Nota3: ");
            nota3 = entrada.nextDouble();

            notaTemporal = ((nota1 + nota2 + nota3) / 3) * 0.55;

            System.out.println("Digite su nota de examen final equivalente a 30%: ");
            examenFinal = entrada.nextDouble();
            examenfinalTemporal = examenFinal * 0.3;
            System.out.println("Digite su nota de proyecto final equivalente al 15%: ");
            proyectoFinal = entrada.nextDouble();
            proyectoFinalTemporal = proyectoFinal * 0.15;

            System.out.println("*********RESUMEN CALIFICACIONES**********");
            System.out.println("corresponde al 55%: " + notaTemporal);
            System.out.println("corresponde al 30%: " + examenfinalTemporal);
            System.out.println("corresponde al 15%: " + proyectoFinalTemporal);
            System.out.println("********************DEFINITIVA************************");
            definitiva = (notaTemporal + examenfinalTemporal + proyectoFinalTemporal);
            if (definitiva > 2.9) {
                System.out.println("         aprobo   con:    " + definitiva);
            } else {
                System.out.println("            GAME OVER                   ");
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }

}
