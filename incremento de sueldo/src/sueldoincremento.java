import java.util.Scanner;

public class sueldoincremento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int tipoDeEmpleado;
        double sueldo, nuevoSueldo;
        System.out.println("Escriba su nombre: ");
        nombre = input.nextLine();
        System.out.println("Escriba el tipo de empleado que es segun la asignacion del 1 al 5: ");
        tipoDeEmpleado = input.nextInt();
        System.out.println("Ingrese su sueldo: ");
        sueldo = input.nextDouble();

        switch (tipoDeEmpleado) {
            case 1 : nuevoSueldo = sueldo *1.05; break;
            case 2 : nuevoSueldo = sueldo * 1.07; break;
            case 3 : nuevoSueldo = sueldo * 1.09; break;
            case 4 : nuevoSueldo = sueldo * 1.12; break;
            case 5 : nuevoSueldo = sueldo * 1.15; break;
            default: nuevoSueldo = sueldo;
            }

        System.out.println("Sueldo: " + sueldo);
        System.out.println("Nuevo sueldo: " + nuevoSueldo);


        }




    }

