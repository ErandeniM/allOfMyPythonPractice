import java.util.Scanner;

public class raizcuadrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Asigna un valor para A");
        double a = input.nextDouble();
        System.out.println("Asigna un valor para B");
        double b = input.nextDouble();

        double y = 3 * Math.pow(a,2) * Math.pow(b,2) * Math.sqrt(2*a);
        double z = 12 * Math.pow(a, .5) / Math.pow(b, .75);
        double w = 4 * Math.sqrt((Math.pow(2,a)*2) * (3 * Math.pow(a,2) * Math.pow(b,2) - Math.sqrt(2*a)));

        System.out.printf("El valor de y sera:  %.2f%n", y);
        System.out.printf("El valor de z sera:  %.2f%n", z);
        System.out.printf("El valor de w sera:  %.2f%n", w);

    }
}
