package practica2.ejercicio5;

public class Desarrollador implements IDesarrollador {

    private String nombre;

    public Desarrollador(String nombre) {

        this.nombre = nombre;

    }


    @Override
    public void update(String msg, Commit commit) {

        System.out.println("Out: Nuevo mensaje para " + nombre + ": "  + msg + "; adjuntado con el commit: " + commit.getCommitID());

    }
}
