
package tallerclase_p3;


public class Empleado {
    
    protected String nombre;
    protected double salario;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    

    

    @Override
    public String toString() {
       
        return "Empleado "+this.nombre;
    }
    
    public void incrementarSalario() {
        salario = (salario + (salario *20) / 100);

    }
    
    
}
