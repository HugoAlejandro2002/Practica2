package practica2.ejercicio5;

public class Codigo {

    private String contenidoCodigo;

    public Codigo(String contenidoCodigo) {

        this.contenidoCodigo = contenidoCodigo;

    }

    public String getContenidoCodigo() {
        return contenidoCodigo;
    }

    public void setContenidoCodigo(String contenidoCodigo) {
        this.contenidoCodigo = contenidoCodigo;
    }

    public void showInfo() {

        System.out.println("Codigo: ");
        System.out.println(contenidoCodigo);
        System.out.println();


    }

}
