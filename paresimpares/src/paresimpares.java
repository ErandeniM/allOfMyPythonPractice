import java.util.Scanner;

public class paresimpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /*LOS PROGRAMAS DE ENSEGUIDA ESTAN ESTRUCTURADOS PARA PONER EN PRACTICA
        EL USO DE LOS LOOPS, HACEN EXACTAMENTE LO MISMO, PIDEN AL USUARIO INGRESAR
        NUMEROS 2 VECES */

        //PROGRAMA 1
        System.out.println("¿Cuántos números desea capturar para el programa 1?");
        int num = input.nextInt();
        double capturas1, capturas2;
        double totalCapturas = 0;
        double totalCapturas2 = 0;
        int pares =0 ;
        int pares2 = 0;
        int impares=0;
        int impares2=0;

        for (int i = 1; i <= num; i++) {
            System.out.println("Capture el numero " + i + ", del programa 1.");
             capturas1 = input.nextDouble();
             totalCapturas += capturas1;
            if(capturas1 % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        double promedio = totalCapturas/num;
        System.out.println("El promedio de los numeros ingresados al programa 1 es: "+promedio);
        System.out.println("La cantidad de numeros pares del programa 1 es de: " +pares);
        System.out.println("La cantidad de numeros impares del programa 1 es de: " +impares);

        //PROGRAMA2
        System.out.println("¿Cuántos números desea capturar para el programa 2?");
        int num2 = input.nextInt();
        int j = 0;
        do {
            System.out.println("Captura el numero " + (j+1) + ", del programa 2.");
            capturas2 = input.nextInt();
            totalCapturas2 += capturas2;
            if(capturas2 % 2 == 0) {
                pares2++;
            } else {
                impares2++;
            }
            j++;
        } while (j<num2);

        double promedio2 = totalCapturas2/num;
        System.out.println("El promedio de los numeros ingresados al programa 2 es: "+promedio2);
        System.out.println("La cantidad de numeros pares del programa 2 es de: " +pares2);
        System.out.println("La cantidad de numeros impares del programa 2 es de: " +impares2);



    }

}
