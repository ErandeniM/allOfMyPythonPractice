import java.util.Scanner;

public class operacionesbasicas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cantidad de numeros que vas a capturar: ");
        int n = input.nextInt();
        double prom,max,min,total;
        prom=0.0;
        max=0.0;
        total =0.0;
        min=0.0;
        for (int i = 1; i <= n; i++) {

            System.out.println("Escriba el numero: " + i);
             int entry = input.nextInt();
            total += entry ;
            prom = total / n;
            min = entry;
            if (entry > max){
                 max = entry;
            }
            if (entry < min){
                 min = entry;
            }
        }
        System.out.println("El promedio de las entradas numericas es: "+ prom);
        System.out.println("El numero mayor es: "+ max);
        System.out.println("El numero menor es: "+ min);
    }

}
