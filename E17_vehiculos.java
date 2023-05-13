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

public class E17_vehiculos {

    public static void main(String[] args) {
        try {
                    Scanner sc = new Scanner(System.in);
        double distancia,velocidadA,velocidadU,horas,minutos;

        System.out.print("Digita la distancia entre los dos vehículos (en km): ");
         distancia = sc.nextDouble();

        System.out.print("Digita la velocidad del vehículo que va adelante (en km/h): ");
         velocidadA = sc.nextDouble();

        System.out.print("Digita la velocidad del vehículo que va atrás (en km/h): ");
         velocidadU = sc.nextDouble();

       
        horas = distancia / (velocidadA - velocidadU);
        minutos = horas * 60;

        System.out.println("El vehículo de atrás alcanzará al vehículo de adelante en " + minutos + " minutos.");
    
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }
}
