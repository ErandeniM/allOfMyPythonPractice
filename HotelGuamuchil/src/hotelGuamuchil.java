import java.util.Scanner;

public class hotelGuamuchil {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido al Hotel Guamuchil");

    double precioHabitacion, precioTotal;
    int descuento;
    String procesar;
    precioHabitacion= 500;

    do {
        System.out.println("Ingrese la cantidad de dias que se hospeda en nuestro hermoso hotel: ");
        int dias = input.nextInt();

        if (dias > 5 && dias <10) {
            precioTotal = precioHabitacion * dias * .9;
            descuento = 10;
        } else if (dias > 10 && dias <15) {
            precioTotal = precioHabitacion * dias * .85;
            descuento = 15;
        } else if (dias > 15 ) {
            precioTotal = precioHabitacion * dias * .80;
            descuento = 20;
        } else {
            precioTotal = precioHabitacion * dias;
            descuento = 0;
    }

        System.out.printf("Su precio total es: $ %,.2f%n", precioTotal );
        System.out.printf("Ha recibido un descuento de: %,d%%\n", descuento);
        System.out.printf("Desea capturar otro presupuesto para habitacion?\n Escriba si o no\n");
        procesar = input.next().toLowerCase();

    } while (procesar.equals("si"));
    }
}
