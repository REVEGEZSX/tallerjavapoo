package tallerjavapoo;

public class Furgoneta extends Vehiculo{
    private double capacidadDeCarga;
    private double altura;

    public Furgoneta(double capacidadDeCarga, double altura, String marca, String placa, String numeroDeSerie, double kilometrosRecorridos, double cantidadDeCombustibleActual) {
        super(marca, placa, numeroDeSerie, kilometrosRecorridos, cantidadDeCombustibleActual);
        this.capacidadDeCarga = capacidadDeCarga;
        this.altura = altura;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public void setCantidadDeCombustibleActual(double cantidadDeCombustibleActual) {
        this.cantidadDeCombustibleActual = cantidadDeCombustibleActual;
    }
    
    public String mostrar()
    {
        return mostrarinfo()+"\t"+Double.toString(capacidadDeCarga)+"\t"+Double.toString(altura);
    }
}
