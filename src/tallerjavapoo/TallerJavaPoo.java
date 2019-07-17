package tallerjavapoo;

/**
 * Stiven Melendez
 * Lina Baño
 */
public class TallerJavaPoo {
    
    public static void main(String[] args) 
    {
       moto M1 = new moto("DUCATTI","A305GA","0001",500,10);
       Turismo At1 = new Turismo("Familiar",4,"gasolina","sedan","abc123","0010",200,50);
       Deportivo Ad1 = new Deportivo(170,true,2,2,"Porshe","AER120","150114",120,40);
       A4x4 Acxc1 = new A4x4("Gasolina",4,"TOYOTA","FGHT12","005789",350,70);
       Monovolumen Mv1 = new Monovolumen(4,true,6,"ACPM",575,"Mercedes-Benz","G7MP00","789444",320,75);
       Furgoneta F1 = new Furgoneta(950,425,"FORD","RT24GH","01451",750,80);
       
       System.out.println(M1.mostrarinfo());
       System.out.println(At1.mostrar());
       System.out.println(Ad1.mostrar());
       System.out.println(Acxc1.mostrar());
       System.out.println(Mv1.mostrar());
       System.out.println(F1.mostrar());
       
       M1.setCantidadDeCombustibleActual(30);
       At1.setKilometrosRecorridos(350);
       F1.setCapacidadDeCarga(1000);
    }
    
}
