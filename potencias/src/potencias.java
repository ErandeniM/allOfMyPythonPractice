import java.util.Scanner;

public class potencias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        double n = input.nextDouble();
        double potencia ;

        for (int i = 1; i <= n; i++) {
            potencia = Math.pow(i,i);
            System.out.println("La potencia de " + i + " es: " + potencia);
        }
    }
}
