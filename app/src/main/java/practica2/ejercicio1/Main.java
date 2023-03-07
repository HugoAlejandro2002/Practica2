package practica2.ejercicio1;


public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Dalas", "393432");
        VersionadorTesis versionadorTesis = new VersionadorTesis();
        AlmacenamientoTesis almacenamientoTesis = new AlmacenamientoTesis();

        estudiante.setTesis(new Tesis(23, " ", " "));

        for(int i = 0; i<5; i++) {

            String contenido = "";
            String version = "";
            String revision = "";

            switch (i) {

                case 0:
                    contenido = "Primer";
                    revision = "Primera";
                    version = "Primera";
                    break;
                case 1:
                    contenido = "Segundo";
                    revision = "Segunda";
                    version = "Segunda";
                    break;

                case 2:
                    contenido = "Tercer";
                    revision = "Tercera";
                    version = "Tercera";
                    break;

                case 3:
                    contenido = "Cuarto";
                    revision = "Cuarta";
                    version = "Cuarta";
                    break;

                case 4:
                    contenido = "Quinto";
                    revision = "Quinta";
                    version = "Quinta";
                    break;


            }

            estudiante.setTesis(new Tesis(23, contenido + " contenido de la tesis ", revision + " revision de la tesis"));

            versionadorTesis.setTesis(estudiante.getTesis());
            almacenamientoTesis.createVersionTesis(version + " version", versionadorTesis.createVersionTesis());


        }

        System.out.println("5ta Version de la Tesis");

        estudiante.getTesis().showInfo();

        estudiante.setTesis(versionadorTesis.restoreVersionTesis(almacenamientoTesis.getVersionTesis("Tercera version")));

        System.out.println("3ra Version de la Tesis");

        estudiante.getTesis().showInfo();


    }

}
