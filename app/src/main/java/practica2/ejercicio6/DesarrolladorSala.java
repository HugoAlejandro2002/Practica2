package practica2.ejercicio6;


public class DesarrolladorSala extends Desarrollador{


    public DesarrolladorSala(ISalaChat salaChat) {
        super(salaChat);
    }

    @Override
    public void send(String msg) {

        salaChat.send(msg, this);

    }

    @Override
    public void received(String msg) {

        System.out.println("Notification| Mensaje para: " + getNombre() + " - " + getIdDev() + ": " + msg);

    }


}
