public class Vehiculo {
    private String marca;
    private int  velocidadMaxima;

    public Vehiculo (String marca, int velocidadMaxima){
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;

    }
    public void mostrarInformacion(){
        System.out.println("marca" + marca);
        System.out.println("velocidad maxima" + velocidadMaxima + "kilometros por hora");
    }
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", 180);
        Coche coche = new Coche("ford", 220, 4);

        System.out.println("Información del Vehículo:");
        vehiculo.mostrarInformacion();

        System.out.println("\nInformación del Coche:");
        coche.mostrarInformacion();
    }
}

