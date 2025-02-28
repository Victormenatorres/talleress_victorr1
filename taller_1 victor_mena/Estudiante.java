public class Estudiante {
    String Nombre;
    int edad;
    String Curso;


    public Estudiante() {
        this.Nombre = "Sin nombre";
        this.edad = 0;
        this.Curso = "Sin curso";
    }
    public Estudiante(String nombre, int edad) {
        this.Nombre = nombre;
        this.edad = edad;
        this.Curso = "Sin curso"; // Valor genérico para curso
    }
    
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor que acepta nombre y edad
        this.Curso = curso;
    }

    // Métodos para obtener los valores de las propiedades
    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return Curso;
    }

    
}
