import java.util.Scanner;

public class ValidacionBasica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingresa tu nombre completo:");
        String nombre = teclado.nextLine();

        String regexNombre = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$";
        if (nombre.matches(regexNombre)) {
            System.out.println("Nombre valido.");
        } else {
            System.out.println("Nombre invalido. Solo letras y espacio.");
        }

        //---Validar Direccion con numero
        System.out.println("\nIngresa tu direccion con numero (ej. Calle 12)");
        String direccion = teclado.nextLine();

        String regexDireccion = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+\\d+$";
        if (direccion.matches(regexDireccion)) {
            System.out.println("Direccion valida.");
        } else {
            System.out.println("Direccion invalido. Solo letras y espacio.");
        }


teclado.close();


    }
}
