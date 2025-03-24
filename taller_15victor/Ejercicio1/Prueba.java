public class Prueba {
    public static void main(String[] args) {
        Limpieza limpieza = new ServicioLimpieza();
        Reparacion reparacion = new ServicioReparacion();
        
        limpieza.limpiar();
        reparacion.reparar();
    }
}
