// Definición de la interfaz Nadador
interface Nadador {
    void nadar();
}

interface Respirador {
    void respirar();
}

class Pez implements Nadador, Respirador {
    private String nombre;

    public Pez(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println(nombre + " Respira por branqueas.");
    }

    public static void main(String[] args) {
        Pez pez1 = new Pez("Rojo");

        pez1.nadar();
        pez1.respirar();
    }
}
