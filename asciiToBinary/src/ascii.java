import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        // System.out.print("Ingresa tu nombre: ");
        String nombre = "ERAN";
        int valueE = 69;
        int valueR = 82;
        int valueA = 65;
        int valueN =78;
/*
        switch (nombre){
    case "E":
         valueE = 69;
        break;
    case "R":
         valueR = 82;
        break;
    case "A":
        valueA = 65;
        break;
    case "N":
        valueN = 78;
        break;
}
 */

        String binE = Integer.toBinaryString(valueE);
        String binR = Integer.toBinaryString(valueR);
        String binA = Integer.toBinaryString(valueA);
        String binN = Integer.toBinaryString(valueN);

        System.out.println("Tu nombre en binario es: " + nombre);
        System.out.println("E es: " + binE);
        System.out.println("R es: " + binR);
        System.out.println("A es: " + binA);
        System.out.println("N es: " + binN);
    }
}
