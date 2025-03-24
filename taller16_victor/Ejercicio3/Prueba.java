package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        GeneradorReporte pdf = new ReportePDF();
        GeneradorReporte excel = new ReporteExcel();
        
        GestorReportes gestorPDF = new GestorReportes(pdf);
        GestorReportes gestorExcel = new GestorReportes(excel);
        
        gestorPDF.generar("Datos del informe financiero");
        gestorExcel.generar("Datos de ventas mensuales");
    }
}
