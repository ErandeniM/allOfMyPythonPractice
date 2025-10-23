import java.util.Scanner;

public class ecuacioneslineales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un valor para 'a': ");
        double a = input.nextDouble();
        System.out.println("Ingresa un valor para 'b': ");
        double b = input.nextDouble();
        System.out.println("Ingresa un valor para 'c': ");
        double c = input.nextDouble();
        System.out.println("Ingresa un valor para 'd': ");
        double d = input.nextDouble();
        System.out.println("Ingresa un valor para 'e': ");
        double e = input.nextDouble();
        System.out.println("Ingresa un valor para 'f': ");
        double f = input.nextDouble();

        double divisor = ((a*e) - (b*d));

        if (divisor != 0) {
            double X= ((c*e)-(b*f))/ divisor;
            double Y = ((a*f) - (c*d)) / divisor;
            System.out.printf("El valor de X es: %.2f\n", X);
            System.out.printf("El valor de Y es: %.2f\n", Y);
        } else {
            System.out.println("La ecuacion no tiene solucion. ");
        }

    }
}
