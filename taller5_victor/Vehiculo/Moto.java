package Vehiculo;
class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        super("Moto", marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}
