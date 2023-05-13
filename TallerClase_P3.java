
package General2;

import javax.swing.JOptionPane;
import tallerclase_p3.Gerente;


public class TallerClase_P3 {

    
    public static void main(String[] args) {
        try {
            Gerente gerente1 = new Gerente("Cristian");
        Gerente gerente2 = new Gerente("Marcos", 1000);
       
        
        System.out.println(gerente2.toString());
        } catch (Exception e) {
            System.out.println("DESDE EL CATCH");
            System.out.println(e.getMessage());
        }
        

       
        
    }
    
}
