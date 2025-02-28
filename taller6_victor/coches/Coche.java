package coches;
public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarTotalCoches() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}