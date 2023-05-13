
package General1;


public class J2_Cliente {
     private String nombre;
    private String  identificacion;

    public J2_Cliente() {
    }

    public J2_Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nIdentificacion: " + identificacion;
    }
    
    
}
