import java.util.Scanner;

public class angulos    {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grados;
        System.out.println("Ingresa el valor de un angulo en grados: ");
        grados = input.nextDouble();


        if (grados < 90) {
            System.out.println("El angulo es agudo.");
        } else if (grados > 90) {
            System.out.println("El angulo es obtuso.");
        }else if (grados == 90) {
            System.out.println("El angulo es recto.");
        }else {
            System.out.println("Error.");
        }

    }
}
