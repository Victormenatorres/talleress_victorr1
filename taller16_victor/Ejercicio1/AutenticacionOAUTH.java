package Ejercicio1;

public class AutenticacionOAUTH implements ServicioAutenticacion{
    @Override
    public boolean autenticar(String usuario, String clave) {
        System.out.println("Autenticando usuario mediante OAuth...");
        return usuario.endsWith("@oauth.com");
    }
}
