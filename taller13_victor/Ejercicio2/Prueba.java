package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Documento docPDF = new PDF();
        Documento docWord = new Word();
        Documento docExcel = new Excel();

        docPDF.exportar();
        docWord.exportar();
        docExcel.exportar();
    }
}
