package General1;

import java.util.ArrayList;
import java.util.List;

public class J7_JefeZona extends J3_Empleado {

    private String despacho;
    private J6_Secretario secretario;
    private List<J5_Vendedor> listaVendedores;
    private J1_Carro carroEmpresa;

    public J7_JefeZona() {
    }

    
    public J7_JefeZona(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono,
            double salario, String despacho) {
        super(nombre, apellidos, DNI, direccion,antiguedad, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.listaVendedores = new ArrayList<J5_Vendedor>();
        this.carroEmpresa = carroEmpresa;
//        incrementarSalario(20);
    }


    @Override
    public String toString() {
        return super.toString()
                +"\n--------Informacion Principal Jefe Zona-------------------\n"
                +"\nDespacho:" + despacho 
                + "\nSecretario:" + secretario 
                + "\nListaVendedores:\n" + listaVendedores
                + "\nCarroEmpresa:" + carroEmpresa
                +"\nPuesto:Jefe zona"
                +"\n-------- Fin Informacion Principal Jefe Zona------------\n";
    }
    
    

    public void cambiarSecretario(J6_Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
    }

    public void cambiarCarro(J1_Carro nuevoCarro) {
        this.carroEmpresa = nuevoCarro;
    }

    public void darDeAltaVendedor(J5_Vendedor vendedor) {
        listaVendedores.add(vendedor);
    }

    public void darDeBajaVendedor(J5_Vendedor vendedor) {
        listaVendedores.remove(vendedor);
    }
//    @Override
//     public void incrementarSalario(double porcentaje) {
//        salario = (salario + (salario * 20) / 100);
//
//    }
}
