package practica2.ejercicio5;

public class Main {

    public static void main(String[] args) {

        Git git = new Git();
        Repositorio repositorio = new Repositorio();

        repositorio.attach(new Desarrollador("Juan"));
        repositorio.attach(new Desarrollador("Carlos"));
        repositorio.attach(new Desarrollador("Roberto"));

        Codigo codigo;

        codigo = new Codigo("print('Hola')");

        git.setCodigo(codigo);
        repositorio.createCommit("Primer commit", git.createCommit());

        codigo = new Codigo("x=2");

        git.setCodigo(codigo);
        repositorio.createCommit("Segundo commit", git.createCommit());

        codigo = new Codigo("y=3");

        git.setCodigo(codigo);
        repositorio.createCommit("Tercer commit", git.createCommit());

        codigo = new Codigo("print(x+y)");

        git.setCodigo(codigo);
        repositorio.createCommit("Cuarto commit", git.createCommit());

        codigo = new Codigo("x is y");

        git.setCodigo(codigo);
        repositorio.createCommit("Quinto commit", git.createCommit());

        codigo.showInfo();

        codigo = git.restoreCommit(repositorio.getCommit("Primer commit"), repositorio);

        codigo.showInfo();

        repositorio.dettachAll();

        repositorio.attach(new Desarrollador("Franca"));
        repositorio.attach(new Desarrollador("Lewan"));
        repositorio.attach(new Desarrollador("Phills"));

        codigo = git.restoreCommit(repositorio.getCommit("Quinto commit"), repositorio);

        codigo.showInfo();

    }

}
