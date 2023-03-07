package practica2.ejercicio2;


public interface IEjercito {

    void setNext(IEjercito next);

    void criteriaHandler(IOrden orden);

    IEjercito next();


}
