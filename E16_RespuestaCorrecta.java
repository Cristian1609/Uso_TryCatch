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
public class E16_RespuestaCorrecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            Scanner entrada = new Scanner(System.in);
        double notaMaxima,defPuntos,defNota;
        int correctas,incorrectas,sinContestar;

        System.out.print("Digite #de preguntas presentadas por el docente: ");
        double npreguntas=entrada.nextInt();
        System.out.println("Cual es la nota maxima de sus institucion: ");
        notaMaxima=entrada.nextDouble();
        double temporal = notaMaxima/npreguntas;
        System.out.print("Digite #de preguntas correctas: ");
        correctas=entrada.nextInt();
        System.out.print("Digite #de preguntas incorrectas: ");
        incorrectas=entrada.nextInt();
        System.out.print("Digite #de preguntas sin contestar: ");
        sinContestar=entrada.nextInt();
        
        System.out.println("NOTA REAL: ");
        defNota=temporal*correctas;
        System.out.println(defNota);
        System.out.print("NOTA PUNTOS: ");
        defPuntos=(correctas*5)-(incorrectas);
        System.out.println(defPuntos);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
        
        
        
    }
    
}
