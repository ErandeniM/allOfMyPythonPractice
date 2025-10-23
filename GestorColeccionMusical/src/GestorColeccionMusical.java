

import java.util.LinkedList;
import java.util.Scanner;

public class GestorColeccionMusical {
    public static void main(String[] args) {


        LinkedList<String> coleccionMusical = new LinkedList<String>();
        int userSelection;
        int posicion;
        String albumName = "";
        boolean salir = false;

        Scanner input = new Scanner(System.in);


        while (!salir) {
            mostrarMenu();
            System.out.println("Escriba en su teclado el numero de la accion que desea realizar:");
            userSelection = input.nextInt();
            input.nextLine();

            switch (userSelection) {
                case 1:
                    System.out.println("Ingrese el nombre del album que deseas agregar al final:");
                    albumName = input.nextLine();
                    coleccionMusical.addLast(albumName);
                    System.out.println("Ha agregado " + albumName + " al final de la coleccion.");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del album que deseas agregar al inicio:");
                    albumName = input.nextLine();
                    coleccionMusical.addFirst(albumName);
                    System.out.println("Ha agregado " + albumName + " al inicio de la coleccion.");
                    break;
                case 3:
                    if (!coleccionMusical.isEmpty()) {
                        System.out.println("Ingrese el número de posición del álbum que desea obtener. Tiene "
                                + coleccionMusical.size() + " álbumes en total:");
                        posicion = input.nextInt();
                        input.nextLine();
                        posicion -= 1;

                        if (posicion >= 0 && posicion < coleccionMusical.size()) {
                            System.out.println("Ha obtenido el álbum: " + coleccionMusical.get(posicion) + " de la colección.");
                        } else {
                            System.out.println("No existe el álbum. Tamaño de la colección: " + coleccionMusical.size());
                        }
                    } else {
                        System.out.println("La colección está vacía. No hay álbumes para obtener.");
                    }
                    break;
                case 4:
                    if (!coleccionMusical.isEmpty()) {
                        //mostrar al usuario los albumes que estan disponibles para modificarlos
                        System.out.println("Albumes en la coleccion: ");
                        for (int i = 0; i < coleccionMusical.size(); i++) {
                            System.out.println((i + 1) + ". " + coleccionMusical.get(i));
                        }
                        System.out.println("Ingrese el número de la posición donde se encuentra el disco que desea modificar:");
                        posicion = input.nextInt();
                        input.nextLine();
                        posicion -= 1;

                        if (posicion >= 0 && posicion < coleccionMusical.size()) {
                            System.out.println("Ha seleccionado el álbum: " + coleccionMusical.get(posicion));
                            System.out.println("Ingrese el nombre del nuevo disco:");
                            albumName = input.nextLine();

                            coleccionMusical.set(posicion, albumName);

                            System.out.println("Ahora el álbum \"" + albumName + "\" se encuentra en la posición " + (posicion + 1) + ".");
                        } else {
                            System.out.println("No existe el álbum. Tamaño de la colección: " + coleccionMusical.size());
                        }
                    } else {
                        System.out.println("La colección está vacía. No hay álbumes para modificar.");
                    }
                    break;
                case 5:
                    if (!coleccionMusical.isEmpty()) {
                        System.out.println("Ha eliminado el album " + coleccionMusical.getFirst() + " en la coleccion.");
                        coleccionMusical.removeFirst();
                    } else {
                        System.out.println("No existe el album. Tamaño de la coleccion: " + coleccionMusical.size());
                    }

                    break;
                case 6:
                    if (!coleccionMusical.isEmpty()) {
                        System.out.println("Ha eliminado el album " + coleccionMusical.getLast() + " en la coleccion.");
                        coleccionMusical.removeLast();
                    } else {
                        System.out.println("No se encontraron albumes para eliminar.");
                    }
                    break;
                case 7:
                    if (!coleccionMusical.isEmpty()) {
                        System.out.println("Albumes en la coleccion: ");
                        for (int i = 0; i < coleccionMusical.size(); i++) {
                            System.out.println((i + 1) + ". " + coleccionMusical.get(i));
                        }
                        System.out.println("Ingresa el numero de posicion en la que se encuentra  el album que desea eliminar:");
                        posicion = input.nextInt();
                        input.nextLine();
                        posicion -= 1;

                    if (posicion >= 0 && posicion < coleccionMusical.size()) {
                        String albumEliminado = coleccionMusical.get(posicion);
                        coleccionMusical.remove(posicion);
                        System.out.println("Album eliminado " + albumEliminado + " en la coleccion.");
                    } else {
                        System.out.println("No existe el album. Tamaño de la coleccion: " + coleccionMusical.size());
                    }
                    } else {
                        System.out.println("No existe el album. Tamaño de la coleccion: " + coleccionMusical.size());
                    }
                    break;
                case 8:
                    System.out.println("El tamaño de la coleccion es de: " + coleccionMusical.size());
                    break;
                case 9:
                    if (!coleccionMusical.isEmpty()) {
                        System.out.println("El primer album de la coleccion es: " + coleccionMusical.getFirst());

                    } else {
                        System.out.println("No existe el album. Tamaño de la coleccion: " + coleccionMusical.size());
                    }
                    break;
                case 10:
                    if (!coleccionMusical.isEmpty()) {
                        System.out.println("El ultimo album de la coleccion es: " + coleccionMusical.getLast());
                    } else {
                        System.out.println("No existe el album. Tamaño de la coleccion: " + coleccionMusical.size());
                    }
                    break;
                case 11:
                    System.out.println("Ha removido los " + coleccionMusical.size() + " albumes en total.");
                    coleccionMusical.removeAll(coleccionMusical);
                    break;
                case 12:
                    System.out.println("La coleccion completa ingresada es: ");
                    for (int i = 0; i < coleccionMusical.size(); i++) {
                        System.out.println((i + 1) + ". " + coleccionMusical.get(i));
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa. Hasta la proxima.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Selecciona un numero del 0 al 12.\n");
            }
        }
    }
    //funcion para mostrar menu
    public static void mostrarMenu() {
        System.out.println(
                "\n" +
                        "1. Agregar un disco al final.\n" +
                        "2. Agregar un disco al inicio.\n" +
                        "3. Obtener un disco.\n" +
                        "4. Modificar un disco.\n" +
                        "5. Eliminar el primer disco.\n" +
                        "6. Eliminar el ultimo disco.\n" +
                        "7. Eliminar un disco por posicion.\n" +
                        "8. Consultar la cantidad de discos.\n" +
                        "9. Consultar el primer disco de la coleccion.\n" +
                        "10. Consultar el ultimo disco de la coleccion.\n" +
                        "11. Eliminar todos los discos.\n" +
                        "12. Mostrar toda la coleccion.\n" +
                        "0. Salir\n");
    }
}