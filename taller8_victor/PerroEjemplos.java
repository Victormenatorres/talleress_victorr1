public class PerroEjemplos extends AnimalEjemplos {
     String raza;

    public PerroEjemplos(String especie, String raza) {
        super(especie); 
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("El perro muerde.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro muerde.");
    }
}

