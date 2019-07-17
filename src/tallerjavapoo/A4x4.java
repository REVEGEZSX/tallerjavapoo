package tallerjavapoo;

public class A4x4 extends Vehiculo{
    private String tipoDeMotor;
    private int numeroDeAsientos;

    public A4x4(String tipoDeMotor, int numeroDeAsientos, String marca, String placa, String numeroDeSerie, double kilometrosRecorridos, double cantidadDeCombustibleActual) {
        super(marca, placa, numeroDeSerie, kilometrosRecorridos, cantidadDeCombustibleActual);
        this.tipoDeMotor = tipoDeMotor;
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public void setCantidadDeCombustibleActual(double cantidadDeCombustibleActual) {
        this.cantidadDeCombustibleActual = cantidadDeCombustibleActual;
    }
    
    public String mostrar()
    {
        return mostrarinfo()+"\t"+tipoDeMotor+"\t"+Integer.toString(numeroDeAsientos);
    }
}
