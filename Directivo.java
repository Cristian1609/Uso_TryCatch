
package tallerclase_p3;


public class Directivo extends Empleado{

    public Directivo() {
    }

    public Directivo(String nombre) {
        super(nombre);
    }

    
    public Directivo(String nombre, double salario) {
        super(nombre);
    }

   

    
    @Override
    public String toString() {
        return super.toString()+"->Directivo";
    }
    
    @Override
     public void incrementarSalario() {
        salario = (salario + (salario *40) / 100);

    }
}
