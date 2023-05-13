
package General;

import java.util.Scanner;

public class F18_intervalo {

    public static void main(String[] args) {

        try {
              Scanner entrada = new Scanner(System.in);

        int x1,x2,numero,suma=0,NfueraIntervalo=0,contador=0;
        boolean Limite = false;
        
        System.out.println("DEBEN SER ENTEROS");
        do {
           
            System.out.print("Digita el limite superior: ");
            x1 = entrada.nextInt();
            System.out.print("Digita el limite inferior: ");
            x2 = entrada.nextInt();
             if(x1==0 || x2==0){
                 System.out.println("NO PUEDE INGRESAR CEROS EN LOS LIMITES X1 Y X2");
                 throw new AssertionError();
             }
            else if (x2 > x1) {
                System.out.println("                     EL LIMITE INFERIROS NO PUEDE SER MAYOR QUE EL SUPERIOR");
            }
        } while (x2 > x1);

        
       
        
          System.out.println("\033[31m                    NOTA: Su ciclo culminara cuando digite el 0.");
        do {
           contador++;
            System.out.print(contador+".DIGITA:");
            numero = entrada.nextInt();
            if (numero != 0) {
                if (numero > x2 && numero < x1) {
                    suma += numero;
                } else {
                    NfueraIntervalo++;
                }
                if (numero == x2 || numero == x1) {
                    Limite = true;
                }
            }
        } while (numero != 0);

        System.out.println("                         SUMA DE LOS DIGITOS DENTRO DEL INTERVALO: " +x1+ " Y " +x2 + " es =  "+ suma);
        System.out.println("                         DIGITOS QUE SE ENCUENTRAN FUERA DEL INTERVALO: " +x1+ " Y " +x2 + " es =  " + NfueraIntervalo);
        if (Limite) {
            System.out.println("                        SE EVIDENCIA UNO DE LOS LIMITES INGRESADOS : " +x1+ " O " +x2);
        } else {
            System.out.println("                     NO SE EVIDENCIO NINGUN LIMITE INGRESADO: " +x1+ " NI TAMPOCO " +x2);
        }

        } catch (Exception e) {
             System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }
    }

}
