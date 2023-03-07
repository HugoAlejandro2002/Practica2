package practica2.ejercicio3;


import java.util.List;

public class BusquedaSimplePorModelo implements IBusquedaCelular{


    @Override
    public void busqueda(List<Celular> listaDeCelulares, Celular celular) {

        System.out.println("Busqueda SImple por modelo");

        for(Celular celularLista : listaDeCelulares) {

            if(celular.getModelo().equals(celularLista.getModelo())) {

                celularLista.showInfo();

            }

        }



    }
}
