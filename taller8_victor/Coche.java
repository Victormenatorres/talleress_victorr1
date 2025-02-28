public class Coche extends Vehiculo  {
    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas){
        super(marca, numeroDePuertas);
        this.numeroDePuertas = numeroDePuertas;
    }
    @Override
    public void mostrarInformacion (){
        super.mostrarInformacion();
        System.out.println("numero de puertas :" + numeroDePuertas);
    }

    
}
