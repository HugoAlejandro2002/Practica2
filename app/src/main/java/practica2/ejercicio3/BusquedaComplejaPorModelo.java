package practica2.ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public class BusquedaComplejaPorModelo implements IBusquedaCelular{


    @Override
    public void busqueda(List<Celular> listaDeCelulares, Celular celular) {

        System.out.println("Busqueda compleja por Modelo: ");


        List<Celular> result = listaDeCelulares.stream().filter(cel -> cel.getModelo().equals(celular.getModelo())).collect(Collectors.toList());

        for(Celular celular1 : result) {

            celular1.showInfo();

        }



    }
}
