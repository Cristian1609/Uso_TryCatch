package General;

import java.util.Date;

public class I2_Cine_Cliente {

    private String nomCliente;
    private String numIdentificacion;
    private String telCliente;

    public I2_Cine_Cliente() {
    }

    public I2_Cine_Cliente(String nomCliente, String numIdentificacion, String telCliente) {
        this.nomCliente = nomCliente;
        this.numIdentificacion = numIdentificacion;
        this.telCliente = telCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    

    

    @Override
    public String toString() {
        return "Cliente{" + "nomCliente=" + nomCliente + ", numIdentificacion=" + numIdentificacion + ", telCliente=" + telCliente + '}';
    }
    
    

}

