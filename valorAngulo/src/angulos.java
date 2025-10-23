import java.util.Scanner;

public class angulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor del ángulo: ");
        double angulo = input.nextDouble();
        if (angulo <90) {
            System.out.println("El angulo es agudo.");

        }else if (angulo > 90 ){
            System.out.println("El angulo es obtuso.");

        } else if (angulo == 90) {
            System.out.println("El angulo es recto.");
        } else {
            System.out.println("Error.");
        }
    }
}