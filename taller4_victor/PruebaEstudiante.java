public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", 20, 8.5);
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota Promedio: " + estudiante1.getNotaPromedio());
    }
}
