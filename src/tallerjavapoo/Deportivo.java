package tallerjavapoo;

public class Deportivo extends Vehiculo{
    private int caballosDePotencia;
    private boolean turbo;
    private int numeroDePuertas;
    private int numeroDeAsientos;

    public Deportivo(int caballosDePotencia, boolean turbo, int numeroDePuertas, int numeroDeAsientos, String marca, String placa, String numeroDeSerie, double kilometrosRecorridos, double cantidadDeCombustibleActual) {
        super(marca, placa, numeroDeSerie, kilometrosRecorridos, cantidadDeCombustibleActual);
        this.caballosDePotencia = caballosDePotencia;
        this.turbo = turbo;
        this.numeroDePuertas = numeroDePuertas;
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public void setCantidadDeCombustibleActual(double cantidadDeCombustibleActual) {
        this.cantidadDeCombustibleActual = cantidadDeCombustibleActual;
    }
    
    public String mostrar()
    {
        return mostrarinfo()+"\t"+Integer.toString(caballosDePotencia)+"\t"+turbo+"\t"+Integer.toString(numeroDePuertas)+"\t"+Integer.toString(numeroDeAsientos);
    }
}
