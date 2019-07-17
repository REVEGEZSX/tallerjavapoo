package tallerjavapoo;

public class Monovolumen extends Vehiculo{
    private int numeroDePuertas;
    private boolean puertasLaterales;
    private int numeroDeAsientos;
    private String tipoDeMotor;
    private double capacidadDeCarga;

    public Monovolumen(int numeroDePuertas, boolean puertasLaterales, int numeroDeAsientos, String tipoDeMotor, double capacidadDeCarga, String marca, String placa, String numeroDeSerie, double kilometrosRecorridos, double cantidadDeCombustibleActual) {
        super(marca, placa, numeroDeSerie, kilometrosRecorridos, cantidadDeCombustibleActual);
        this.numeroDePuertas = numeroDePuertas;
        this.puertasLaterales = puertasLaterales;
        this.numeroDeAsientos = numeroDeAsientos;
        this.tipoDeMotor = tipoDeMotor;
        this.capacidadDeCarga = capacidadDeCarga;
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
        return mostrarinfo()+"\t"+Integer.toString(numeroDePuertas)+"\t"+puertasLaterales+"\t"+Integer.toString(numeroDeAsientos)+"\t"+tipoDeMotor+"\t"+Double.toString(capacidadDeCarga);
    }
}
