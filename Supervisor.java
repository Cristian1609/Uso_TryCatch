
package tallerclase_p3;


public class Supervisor extends Operario{

    public Supervisor() {
    }

    public Supervisor(String nombre,double salario) {
        super(nombre,salario);
    }

    public Supervisor(String nombre) {
        super(nombre);
    }

    
    @Override
    public String toString() {
        return super.toString()+"Supervisor";
    }
    @Override
     public void incrementarSalario() {
        salario = (salario + (salario *20) / 100);

    }
    
}
