
package tallerclase_p3;


public class Gerente extends Directivo{

    public Gerente() {
    }

    public Gerente(String nombre) {
        super(nombre);
    }

    
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

   

    @Override
    public String toString() {
        return super.toString()+"->Gerente.";
    }
    
    @Override
      public void incrementarSalario() {
        salario = (salario + (salario *20) / 100);

    }
}
