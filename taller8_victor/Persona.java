public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;


    }
    public void mostrarInformacion(){
        System.out.println("nombre :" + nombre);
        System.out.println("edad :" + edad + "años");
    }
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("camilo", 17, "cas123");
        estudiante.mostrarInformacion();
    }
    
}
