import java.util.Scanner;

public class angulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe un numero en grados: ");
        double numero = input.nextDouble();
        double radianes = Math.toRadians(numero);
        double seno = Math.sin(radianes);
        double coseno =  Math.cos(radianes);
        double tangente = Math.tan(radianes);
        double secante = 1/coseno;
        double cotangente = 1/tangente;
        double cosecante = 1/seno;

        System.out.printf("La tangente es: %.2f%n", tangente);
        System.out.printf("La secante es  es: %.2f%n", secante);
        System.out.printf("La cotangente es: %.2f%n", cotangente);
        System.out.printf("La cosecante es: %.2f%n", cosecante);
    }
}


