import java.util.Scanner;

public class ejemploVentas {
    public static void main(String[] args) {
    String nombre;
    //arreglo de ventas con tamaño 30
        int [] ventas = new int [30];
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor: ");
        nombre = sc.nextLine();
        //ventas.length devuelve el tama;o del arreglo
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Escriba ventas del dia " + (i + 1) + ":");
            ventas[i] = sc.nextInt();
            suma += ventas[i];

        }
        System.out.println("Nombre del vendedor: " + nombre);
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta del dia " + (i + 1) + ": " + ventas[i]);
            System.out.println("Venta total: " + suma);


        }



    }
}
