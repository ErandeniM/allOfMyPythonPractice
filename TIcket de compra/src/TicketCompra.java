import java.util.Scanner;

public class  TicketCompra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        String nombre , producto; //podemos indicar con coma diversas variables pq son del mismo tipo
        double precio, subtotal, iva, total, cambio, pago ;
        int cantidad;
        System.out.println("Escriba nombre del cliente: ");
        nombre = leer.nextLine();
        System.out.println("Escriba el nombre del producto: ");
        producto = leer.nextLine();
        System.out.println("Escriba el precio: ");
        precio = leer.nextDouble();
        System.out.println("Escriba la cantidad: ");
        cantidad = leer.nextInt();
        subtotal = precio * cantidad;
        iva = subtotal * 0.16;
        total = subtotal + iva;
        System.out.println(":::::::::::::TICKET DE COMPRA::::::::::::::");
        System.out.printf("El nombre del cliente: %s%n", nombre); //imprimir pero con formato, en la s quiere decir q ahi va el nombnre del deste  y ljuego un slato de linea
        System.out.printf("El nombre del cliente: %s%n", producto);
        System.out.printf("El precio es: %.2f%n", precio); // especificamos la cant de decimales
        System.out.printf("La cantidad es: %d%n", cantidad); // la d  tiene q ver  con el tipo de dato entero
        System.out.printf("El subtotal: %.2f%n", subtotal);
        System.out.printf("IVA: %.2f%n", iva);
        System.out.printf("Total: %.2f%n", total);
        System.out.println("Escriba la cantidad a pagar: ");
        pago = leer.nextDouble();
        cambio = pago - total;
        System.out.printf("Cambio: %.2f%n", cambio);

    }
}
