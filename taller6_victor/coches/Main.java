package coches;
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Renould", "5N5");
        Coche coche2 = new Coche("Ford", "Fiesta");
        Coche coche3 = new Coche("Honda", "Civic");

        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        coche3.mostrarInformacion();

        Coche.mostrarTotalCoches();
    }
}