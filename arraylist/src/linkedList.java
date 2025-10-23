package linkedList;

import java.util.LinkedList;
//colecciones 
public class linkedList {

    public static void main(String[] args) {
        //Declaracion
        LinkedList <String> carros = new LinkedList <String>();
// elementos del linkedlist

        carros.add("Ford");
        carros.add("Toyota");
        carros.add("BMW");
        carros.add("CHEVROLET");
        System.out.println(carros);
//a;adir primer elemento
        carros.addFirst("Volkswagen");

        //a;adir al final
        carros.addLast("KIA");

        //visualizar contenido
        System.out.println(carros);

        //eliminar el primero y el ultimo
        carros.removeFirst();
        carros.removeLast();
        System.out.println(carros);

        //obtener el primero y el ultimo
        carros.getFirst();
        carros.getLast();










    }

}
