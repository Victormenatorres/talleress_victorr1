package Ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;
    
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }
    
    public boolean iniciarSesion(String usuario, String clave) {
        return servicioAutenticacion.autenticar(usuario, clave);
    }
}
