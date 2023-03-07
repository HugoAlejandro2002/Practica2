package practica2.ejercicio3;


import java.util.List;

public class BusquedaSimplePorPrecio implements IBusquedaCelular{


    @Override
    public void busqueda(List<Celular> listaDeCelulares, Celular celular) {

        System.out.println("Busqueda Simple por Precio");

        for(Celular celularLista : listaDeCelulares) {

            if(celular.getPrecio() == celularLista.getPrecio()) {

                celularLista.showInfo();

            }

        }



    }
}
