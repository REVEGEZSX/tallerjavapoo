package tallerjavapoo;

/**
 *
 * @author CBN
 */
public class moto extends Vehiculo{

    public moto(String marca, String placa, String numeroDeSerie, double kilometrosRecorridos, double cantidadDeCombustibleActual) {
        super(marca, placa, numeroDeSerie, kilometrosRecorridos, cantidadDeCombustibleActual);
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public void setCantidadDeCombustibleActual(double cantidadDeCombustibleActual) {
        this.cantidadDeCombustibleActual = cantidadDeCombustibleActual;
    }
    
    public String mostrar()
    {
        String resultado="";
        resultado = marca+"\t"+placa+"\t"+numeroDeSerie+"\t"+Double.toString(kilometrosRecorridos)+"\t"+Double.toString(cantidadDeCombustibleActual);
        return resultado;
    }
}
