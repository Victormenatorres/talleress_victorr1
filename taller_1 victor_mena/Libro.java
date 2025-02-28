

public class Libro{

String titulo;
String autor;
String numeroPaginas;
 
public Libro(){
 this.titulo = " cien años de soledad";
 this.autor = " gabriel garcía márquez";
 this.numeroPaginas = " 291";   
}
public Libro(String titulo, String autor, String numeroPaginas){
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
   }
    public void mostrarLibro(){
        System.out.println("Título: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Número de páginas: "+this.numeroPaginas);
   
}
}