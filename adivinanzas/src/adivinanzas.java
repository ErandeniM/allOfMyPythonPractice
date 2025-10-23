import java.util.Scanner;

public class adivinanzas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] palabras = {"azul","rojo","verde","amarillo","rosa", "morado","gris","blanco","negro","cafe"};
        int puntuacion=0;
        Boolean answer=false;
        do {
            String palabraAdivinar = palabras[(int)(Math.random()*10)];
// System.out.println(palabraAdivinar);
            System.out.println("Escribe el nombre de un color: ");
            String palabraUsuario = input.nextLine();
            String minuscula= palabraUsuario.toLowerCase();
            if (minuscula.equals(palabraAdivinar)) {
                System.out.println("Has escrito el color: " + minuscula + " y has adivinado la palabra.");
            puntuacion+=10;
                System.out.println("Tu puntuacion es: " + puntuacion);

            } else {
                System.out.println("No has adivinado el color. La respuesta era: " + palabraAdivinar);
                System.out.println("Tu puntuacion es: " + puntuacion);

            }
            System.out.println("¿Deseas seguir jugando? Escribe S para seguir o presiona cualquier tecla para salir.");
            String respuesta = input.nextLine();
            respuesta = respuesta.toLowerCase();
            if (respuesta.equals("s")) {
                answer=true;
            } else {

                answer=false;
                System.out.println("Hasta la proxima.");
            }
        }while(answer==true);


    }


}
