public class AnimalEjemplos {
    protected String especie;

    public AnimalEjemplos(String especie) {
        this.especie = especie;
    }

    public void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

