
import java.util.Scanner;

public class Terreno {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double largo, ancho, area, preciomt2, precio, descuento;
    //char desea;
    String procesar;
    do {
        System.out.println("Escriba largo del terreno: ");
        largo = input.nextDouble();
        System.out.println("Escriba ancho del terreno: ");
        ancho = input.nextDouble();
        System.out.println("Escriba el precio por metro del terreno: ");
        preciomt2 = input.nextDouble();
        area = largo * ancho;
        precio = area * preciomt2;
        if (area> 400) {
            precio = precio * 0.9;
            System.out.println("Se aplico descuento 10%.");
        }
        System.out.printf("Largo del terreno: %.2f%n", largo);
        System.out.printf("Ancho del terreno: %.2f%n", ancho);
        System.out.printf("Precio por mt2: %.2f%n", preciomt2);
        System.out.printf("Precio total: %,.2f%n", precio);
        System.out.printf("Desea capturar otro terreno? Escriba si o no");
        procesar = input.next().toLowerCase();
    } while (procesar.equals("si"));
}
}
// char solo ocupa 1 comilla mientras que el string requiere comilla doble