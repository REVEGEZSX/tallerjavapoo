package tallerjavapoo;

public abstract class Vehiculo {
    protected String marca;
    protected String placa;
    protected String numeroDeSerie;
    protected double kilometrosRecorridos;
    protected double cantidadDeCombustibleActual;

    public Vehiculo(String marca, String placa, String numeroDeSerie, double kilometrosRecorridos, double cantidadDeCombustibleActual) {
        this.marca = marca;
        this.placa = placa;
        this.numeroDeSerie = numeroDeSerie;
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.cantidadDeCombustibleActual = cantidadDeCombustibleActual;
    }
    
    public String mostrarinfo()
    {
        String resultado=" ";
        resultado = marca+"\t"+placa+"\t"+numeroDeSerie+"\t"+Double.toString(kilometrosRecorridos)+"\t"+Double.toString(cantidadDeCombustibleActual);
        return resultado;
    }
}

