package General;

import javax.swing.JOptionPane;

public class B1_Ciclos {

    public static void main(String[] args) {

        try {
            int a = 0;
//            a = (int) (Math.random() * (24));
              a=2;
            String m[][] = new String[a][3];
            System.out.println(a);
            //CICLO FOR
            for (int i = 0; i < a; i++) {
                m[i][0] = JOptionPane.showInputDialog("Producto #" + (i + 1) + "\nIngrese el nombre del producto: ");
                m[i][1] = JOptionPane.showInputDialog("Cantidad: ");
                m[i][2] = JOptionPane.showInputDialog("Precio: ");

            }
            System.out.println("ITEM\tNOMBRE\tCANTIDAD\tPRECIO UNITARIO\n");
            for (int n = 0; n < a; n++) {

                System.out.println((n + 1) + "\t" + m[n][0] + "\t" + m[n][1] + "\t\t" + m[n][2]);

            }
//        //CICLO WHILE
//        int w=0;
//        while(w!=a){
//            
//            m[w][0]=JOptionPane.showInputDialog("Producto #"+(w+1)+"\nIngrese el nombre del producto: ");
//            m[w][1]=JOptionPane.showInputDialog("Cantidad: ");
//            m[w][2]=JOptionPane.showInputDialog("Precio: ");
//            w++;
//        }
//        w=0;
//        System.out.println("ITEM\tNOMBRE\tCANTIDAD\tPRECIO UNITARIO\n");
//        while(w!=a){
//            System.out.println((w+1)+"\t"+m[w][0]+"\t"+m[w][1]+"\t\t"+m[w][2]);
//            w++;
//        }
            //CICLO DO-WHILE
            int dw = 0;
            do {
                m[dw][0] = JOptionPane.showInputDialog("Producto #" + (dw + 1) + "\nIngrese el nombre del producto: ");
                m[dw][1] = JOptionPane.showInputDialog("Cantidad: ");
                m[dw][2] = JOptionPane.showInputDialog("Precio: ");
                dw++;
            } while (dw != a);
            dw = 0;
            System.out.println("ITEM\tNOMBRE\tCANTIDAD\tPRECIO UNITARIO\n");
            do {
                System.out.println((dw + 1) + "\t" + m[dw][0] + "\t" + m[dw][1] + "\t\t" + m[dw][2]);
                dw++;
            } while (dw != a);
        } catch (Exception e) {
            System.out.println("RESPONDIENDO DESDE EL CATCH");
            System.err.println(e.getMessage());
        }

    }
}
