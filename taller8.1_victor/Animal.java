class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
    public static void main(String[] args) {
        Animal animal = new Animal("pez");
        Pez pez = new Pez ("globo", "agua salada");

        animal.mostrarEspecie();
        pez.mostrarEspecie();

    }
}
