import  java.util.Scanner;
public class conversiones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String resp;

            System.out.println("Ingrese el valor de un angulo: ");
            double grados = input.nextDouble();

            if (grados == 90) {
                System.out.println("El ángulo es un ángulo recto");
            } else {
                System.out.println("El angulo no es un angulo recto.");
            }
            double positivos = 0;
            double negativos = 0;

            double temperatura;

        do {
            System.out.println("Ingresa un valor de temperatura: ");
            temperatura = input.nextFloat();
            if (temperatura > 100) {
                System.out.println("La temperatura es mayor al punto de ebullicion del agua");

            } else if (temperatura < 100) {
                System.out.println("La temperatura se encuentra por debajo del punto de ebullición del agua");
            } else {
                System.out.println("La temperatura se encuentra en el punto de ebullicion del agua.");
            }

            if (temperatura > 0) {
                positivos += temperatura;
                System.out.println("Suma de temperaturas positivas: " + positivos);
            } else if (temperatura < 0) {
                negativos += temperatura;
                System.out.println("Suma de temperaturas negativas: " + negativos);
            } else {
                System.out.println("La temperatura es 0.");
            }
            System.out.println("¿Desea ingresar nuevos valores? s/n");
            resp = input.next().toLowerCase();
        } while (resp.equals("s")) ;


    }
}

