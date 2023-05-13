
package tallerclase_p3;


public class Tecnico extends Operario{

    public Tecnico() {
    }

    public Tecnico(String nombre,double salario) {
        super(nombre,salario);
    }

    public Tecnico(String nombre) {
        super(nombre);
    }
    
    
    @Override
    public String toString() {
       
        return super.toString()+"Tecnico";
    }
    @Override
     public void incrementarSalario() {
        salario = (salario + (salario *20) / 100);

    }
}
