class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    // Constructor
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para acelerar
    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
        }
    }

    // Métodos get
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
