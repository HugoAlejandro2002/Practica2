package practica2.ejercicio5;

public interface IRepositorio {

    void attach(IDesarrollador desarrollador);

    void dettach(IDesarrollador desarrollador);

    void dettachAll();

    void notifyDesarrolladores(Commit commit);





}
