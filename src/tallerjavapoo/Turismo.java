package tallerjavapoo;

public class Turismo extends Vehiculo{
    private String tipo;
    private int numeroDePuertas;
    private String tipoDeMotor;

    public Turismo(String tipo, int numeroDePuertas, String tipoDeMotor, String marca, String placa, String numeroDeSerie, double kilometrosRecorridos, double cantidadDeCombustibleActual) {
        super(marca, placa, numeroDeSerie, kilometrosRecorridos, cantidadDeCombustibleActual);
        this.tipo = tipo;
        this.numeroDePuertas = numeroDePuertas;
        this.tipoDeMotor = tipoDeMotor;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public void setCantidadDeCombustibleActual(double cantidadDeCombustibleActual) {
        this.cantidadDeCombustibleActual = cantidadDeCombustibleActual;
    }
    
    public String mostrar()
    {
        return mostrarinfo()+"\t"+tipo+"\t"+Integer.toString(numeroDePuertas)+"\t"+tipoDeMotor;
    }
}
