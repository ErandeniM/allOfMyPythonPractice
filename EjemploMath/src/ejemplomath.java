
import java.util.Scanner;

public class ejemplomath {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero decimal: ");
        double numero = leer.nextDouble();
        System.out.println("Ingresa un angulo en grados: ");
        double grados = leer.nextDouble();
        double raiz = Math.sqrt(Math.abs(numero));
        double potencia = Math.pow(numero, 2);
        double abs = Math.abs(numero);
        double redondear = Math.round(numero);
        double maximo = Math.max(numero, 100);
        double minimo = Math.min(numero, 100);
        double radianes = Math.toRadians(grados); // para calcular seno coseno y tangente se requiere que los grados esten convertidos a radianes
        double seno = Math.sin(radianes);
        double coseno = Math.cos(radianes);
        double tangente = Math.tan(radianes);

        //println solo texto sin formato
        //printf permite especificar los num decimales o cuantos quiero que tenga del tipo double
        System.out.printf("La raiz cuadrada de: %.2f%n", raiz);
        System.out.printf("La potencia del numero es: %.2f%n", potencia);
        System.out.printf("El valor absoluto del numero es: %.2f%n", abs);
        System.out.printf("El valor redondeado es: %.2f%n", redondear);
        System.out.printf("Maximo: %.2f%n", maximo);
        System.out.printf("Minimo: %.2f%n", minimo);
        System.out.printf("El seno es: %.2f%n", seno);
        System.out.printf("El coseno es: %.2f%n", coseno);
        System.out.printf("La tangente es: %.2f%n", tangente);

    }
}

//la libreria no req objeto solo la funcion q vamos a llamar