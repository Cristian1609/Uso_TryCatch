package General1;

import java.util.ArrayList;

public class J5_Vendedor extends J3_Empleado {

    private J1_Carro carro;
    private String areaVenta;
    private ArrayList<J2_Cliente> listaClientes;
    private double comisionVentas;

    public J5_Vendedor() {
    }

    
    public J5_Vendedor(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono, double salario, J1_Carro carro, String areaVenta, double comisionVentas) {

        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.carro = carro;
        this.areaVenta = areaVenta;
        this.listaClientes = new ArrayList<>();
        this.comisionVentas = comisionVentas;
//        incrementarSalario(10);
    }

    public void darDeAltaCliente(J2_Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void darDeBajaCliente(J2_Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public void cambiarCarro(J1_Carro nuevoCarro) {
        this.carro = nuevoCarro;
    }

    @Override
    public String toString() {

        return super.toString()
                + "\n--------Informacion Principal Vendedor---------------\n"
                + "\nCarro: [" + carro + "]"
                + "\nArea Venta: " + areaVenta
                + "\nLista Clientes: " + listaClientes
                + "\nComision Ventas: " + comisionVentas
                + "\nPuesto: Vendedor"
                + "\n--------Fin Informacion Principal Vendedor-----------\n";
    }

  
//    @Override
//    public void incrementarSalario(double porcentaje) {
//        salario = (salario + (salario * 10) / 100);
//
//    }
}
