import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
            System.out.print("Ingresa un número: ");
            int num = input.nextInt();

            for (int i = num; i >= 1; i--) {
                for (int j = 0; j < num - i; j++) {
                    System.out.print(" ");
                }
                for (int k= 1; k <= 2*i-1; k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
}
