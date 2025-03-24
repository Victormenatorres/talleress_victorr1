package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("usuario123", "clave123");
        Autenticacion autenticacion = new Autenticacion();
        Validacion validacion = new Validacion();
        
        if (validacion.validarUsuario(usuario)) {
            System.out.println("Usuario válido.");
        } else {
            System.out.println("Usuario inválido.");
        }

        if (autenticacion.autenticar(usuario, "clave123")) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Autenticación fallida.");
        }
    }
}
