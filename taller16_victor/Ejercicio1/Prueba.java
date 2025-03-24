package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        GestorAutenticacion gestorLocal = new GestorAutenticacion(new AutenticacionLocal());
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(new AutenticacionOAUTH());
        
        System.out.println("Autenticación Local: " + gestorLocal.iniciarSesion("admin", "1234"));
        System.out.println("Autenticación OAuth: " + gestorOAuth.iniciarSesion("usuario@oauth.com", "password"));
    }
}
