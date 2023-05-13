/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package General;

/**
 *
 * @author USUARIO
 */
import java.util.concurrent.TimeUnit;

public class F22_cronometro {

    public static void main(String[] args) throws InterruptedException {
        try {
            int horas = 0;
            int minutos = 0;
            int segundos = 0;

            while (true) {
                System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);

                TimeUnit.SECONDS.sleep(1);

                segundos++;

                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                }

                if (minutos == 60) {
                    horas++;
                    minutos = 0;
                }
            }
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }
}
