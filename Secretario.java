
package tallerclase_p3;


public class Secretario extends Directivo{

    public Secretario() {
    }

    public Secretario(String nombre, double salario) {
        super(nombre, salario);
    }

    public Secretario(String nombre) {
        super(nombre);
    }

    

    
    @Override
    public String toString() {
        return super.toString()+"Directivo"+"Secretario";
    }
    
    @Override
      public void incrementarSalario() {
        salario = (salario + (salario *20) / 100);

    }
    
}
