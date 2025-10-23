import  java.util.Scanner;

public class filtroIngreso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int especialidadBachillerato;
        double promedio;
        System.out.println("Ingreso a la Ingenieria Industrial y de Sistemas de la Universidad de Sonora");
        System.out.println("Ingresa el nombre del aspirante:");
        nombre = input.nextLine();
        System.out.println("Ingresa el especialidad cursada durante el bachillerato: ");
        System.out.println("Elige una del listado: 1. Fisico matematico 2.Quimico biologo 3.Contabilidad 4.Otras areas");
        especialidadBachillerato = input.nextInt();
        System.out.println("Ingresa tu promedio del bachillerato:");
        promedio = input.nextDouble();

        if (promedio>90 || ((promedio >=80 && promedio<=90) && especialidadBachillerato==1)) {
            System.out.println("Estimado aspirante "+ nombre +" has sido aceptado.");
        } else {
            System.out.println("Estimado aspirante " + nombre + " has sido rechazado.");
        }

    }

}
