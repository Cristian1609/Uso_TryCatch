
package tallerclase_p3;


public class Operario extends Empleado{

    public Operario() {
    }

    public Operario(String nombre,double salario) {
        super(nombre,salario);
    }

    public Operario(String nombre) {
        super(nombre);
    }

    
    @Override
    public String toString() {
        return "Operario{" + '}';
    }
    
    @Override
     public void incrementarSalario() {
        salario = (salario + (salario *40) / 100);

    }
    
   

}
