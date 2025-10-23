import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
    int numero;
    int contadorDivisores;

        for (numero = 2; numero <= 1000; numero++) {
            contadorDivisores = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contadorDivisores++;
                }
            }
            if (contadorDivisores == 2) {
                System.out.println(numero);
            }
        }
    }
}

