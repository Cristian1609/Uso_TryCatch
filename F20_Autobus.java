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
public class F20_Autobus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
        int alumnos,CargoAlumno;
        double CargoBus;
        System.out.println("Hola, Sr director digite la cantidad de estudiantes: ");
        System.out.print("DIGITE: ");
        alumnos=entrada.nextInt();
        
        if (alumnos>=100) {
            CargoBus=alumnos*65;
            System.out.println("El costo para cada alumno es de 65 euros");
            System.out.println("El monto total para la compañia es de :"+CargoBus+" Euros.");
            
        }else if(alumnos>= 50  && alumnos <= 99){
            CargoBus=alumnos*70;
            System.out.println("El costo para cada alumno es de 70 euros");
            System.out.println("El monto total para la compañia es de :"+CargoBus+" Euros.");
        }else if(alumnos>=30 && alumnos<=49 ){
            CargoBus=alumnos*95;
            System.out.println("El costo para cada alumno es de 95 euros");
            System.out.println("El monto total para la compañia es de :"+CargoBus+" Euros.");
        }else if(alumnos<30){
            CargoAlumno=4000/alumnos;
            System.out.println("El costo para cada alumnos es de "+CargoAlumno+" Euros.");
            System.out.println("El monto total para la compañia es de 4000 Euros. ");
        }
        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }
    
}
