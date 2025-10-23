import java.util.Scanner;

public class Articulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double precio, costo, descuento, total;
        System.out.println("Escriba la descripcion del articulo");
        descripcion = input.nextLine();
        System.out.println("Precio unitario: ");
        precio = input.nextDouble();
        System.out.println("Escriba la cantidad de articulos: ");
        cantidad = input.nextInt();
        costo = precio*cantidad;
        if (cantidad> 50){
            descuento = costo*.15;
            total  = costo - descuento;
            System.out.println("El descuento es: " + descuento);
            System.out.println("El total es: " + total);
        } else {
            System.out.println("El total es: " + costo);
        }




    }
}
