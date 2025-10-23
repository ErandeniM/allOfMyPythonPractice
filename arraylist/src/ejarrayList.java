package ejarrayList;

import java.util.ArrayList;

public class ejarrayList {

    //tiene una matriz regular dentro de ella
    //la clase linkedList almacena sus elementos en contenedores
    //linkedlist usa la lista recorriendo en bucle en lugar de acceder a elementos aleatorios
//todos estos se llaman funciones de los elementos
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();

        //agregar elementos
        carros.add("Vocho"); //estoy agregando el primer elemento al arreglo
        carros.add("Ford");
        carros.add("Toyota");
        carros.add("Volkswagen");
        //mostrar el ArrayList
        System.out.println(carros);
        //Acceder a un elemento del array
        System.out.println(carros.get(2));
        //Modificar un elemento
        carros.set(2, "KIA");
        System.out.println(carros);
        //Eliminar elemento de la ArrayList
        carros.remove(3);
        System.out.println(carros);
        //Vaciar o eliminar todos los elementos de la ArrayList
        //carros.clear();
        System.out.println(carros);
        //tamano del ArrayList
        System.out.println(carros.size());
        //recorrer una ArrayList
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }

    }
}
