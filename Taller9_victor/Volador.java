interface Volador {
    void volar();
}

interface Cantante {
    void cantar();
}

class Ave implements Volador, Cantante {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando alto.");
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " está cantando ");
    }
interface Volador {
    void volar();
}

interface Cantante {
    void cantar();
}


    public static void main(String[] args) {

        Ave ave1 = new Ave("pio pio");

        ave1.volar();
        ave1.cantar();
    }
}


