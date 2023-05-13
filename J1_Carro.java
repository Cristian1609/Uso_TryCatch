
package General1;

public class J1_Carro {
    
    private String matricula;
    private String marca;
    private String modelo;

    public J1_Carro() {
    }

    public J1_Carro(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return  "Matricula: " + matricula + " - Marca: " + marca + " - Modelo: " + modelo;
    }
    
    
}
