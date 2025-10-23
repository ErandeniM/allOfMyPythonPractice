import java.util.Scanner;

public class Costos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el nombre del producto: ");
        String nombre = leer.nextLine();
        int cantidad;
        double costo;
        System.out.println("Escriba la cantidad del producto: ");
        cantidad = leer.nextInt();
        costo = cantidad * 3.5 + 10700;
        System.out.println("::::::::::::::COSTO DE PRODUCCION :::::::::::::::::");
        System.out.printf("El nombre del producto es: %s%n", nombre);
        System.out.printf("La cantidad del producto es: %d%n", cantidad);
        System.out.printf("El costo total del producto es: %s%n", costo);

    }
}
