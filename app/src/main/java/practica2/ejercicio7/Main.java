package practica2.ejercicio7;

public class Main {

    public static void main(String[] args) {

        ManejadorPrestamo.getInstance().setCantidadOriginal(100);

        EquipoDePrestamos equipoDePrestamos = new EquipoDePrestamos();

        equipoDePrestamos.criteriaHandler(25);
        equipoDePrestamos.criteriaHandler(25);
        equipoDePrestamos.criteriaHandler(25);
        equipoDePrestamos.criteriaHandler(25);


    }

}
