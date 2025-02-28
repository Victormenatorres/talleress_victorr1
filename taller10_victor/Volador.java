interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

class Pato implements Volador, Nadador {
    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando sobre el lago.");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando en el agua.");
    }

    public static void main(String[] args) {
        // Crear un objeto de Pato
        Pato pato = new Pato("Donald");

        // Usar métodos volar y nadar
        pato.volar();
        pato.nadar();
    }
}
