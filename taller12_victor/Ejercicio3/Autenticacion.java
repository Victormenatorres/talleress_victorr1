package Ejercicio3;

public class Autenticacion{
    public boolean autenticar(Usuario usuario, String contraseñaIngresada) {
        return usuario.getContraseña().equals(contraseñaIngresada);
    }
}