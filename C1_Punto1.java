package General;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class C1_Punto1 {

    public static void main(String[] args) {

        try {
            int nr = (int) (Math.random() * (21) + 2);
            System.out.println(nr);
            double[] num = new double[nr];
            for (int i = 0; i < num.length; i++) {
                num[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
            }
            Arrays.sort(num);
            double mode = num[0];
            int m = 0;
            int c = 1;
//        CON METODO FOR
            for (int i = 1; i < num.length; i++) {
                if (num[i] == num[i - 1]) {
                    c++;
                } else {
                    if (c > m) {
                        mode = num[i - 1];
                        m = c;
                    }
                    c = 1;
                }
            }
            //CON METODO WHILE
//    int i2=1;
//    while(i2<num.length){
//      if (num[i2] == num[i2-1]) {
//        c++;
//      } else {
//        if (c > m) {
//          mode = num[i2-1];
//          m = c;
//        }
//        c = 1;
//      }
//    i2++;
//    }
//    //CON METODO DO-WHILE
//    int i3=1;
//    do{
//      if (num[i3] == num[i3 -1]) {
//        c++;
//      } else {
//        if (c > m) {
//          mode = num[i3 - 1];
//          m = c;
//        }
//        c = 1;
//      }
//    i3++;
//    }while(i3<num.length);

//resuestas
            if (c > m) {
                mode = num[num.length - 1];
            }
            String rta = "La moda es: " + mode;

            double mediana;

            if (num.length % 2 == 0) {
                mediana = (num[num.length / 2 - 1] + num[num.length / 2]) / 2;
            } else {
                mediana = num[num.length / 2];
            }
            rta += "\nLa mediana es: " + mediana;

            // Calcular la media
            double sum = 0;
            for (int i = 0; i < num.length; i++) {
                sum += num[i];
            }
            double average = sum / num.length;
            rta += "\nLa media es: " + average;
            JOptionPane.showMessageDialog(null, rta);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }
}
