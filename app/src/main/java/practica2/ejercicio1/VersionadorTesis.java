package practica2.ejercicio1;


public class VersionadorTesis {

    private Tesis tesis;

    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }

    public VersionTesis createVersionTesis() {

        return new VersionTesis(tesis);

    }

    public Tesis restoreVersionTesis(VersionTesis versionTesis) {

        System.out.println("Restaurando la Tesis!!!");
        this.tesis = versionTesis.getTesis();
        return this.tesis;

    }

}
