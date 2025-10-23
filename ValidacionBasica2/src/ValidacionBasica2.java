import java.util.Scanner;


public class ValidacionBasica2 {

    public static void main(String[] args) {
        System.out.println("Ingrese su numero de celular: ");
        Scanner input = new Scanner(System.in);
        String celular =  input.nextLine();

        String regexCelular = "^[0-9]{10}$";

        if (celular.matches(regexCelular)) {
            System.out.println("Celular valido");
        }  else {
            System.out.println("Celular invalido. Ingresa 9 digitos.");
        }
/*     ^ - Inicio de la cadena
    \\d - Representa un dígito (0-9)
    {10} - Exactamente 10 repeticiones del patrón anterior
    $ - Fin de la cadena
 */

        /*
        arreglo vacio valor 10 entero tu decides de q tipo
                generar un valor aleatorio
                que sea una letra de la a min a la a may
          cada vez q salga vocal q la tome y la meta al arregle
          si se genera el 97 representa la a minuscula
          ponerle guion medio por un consonante y si es vocal
          */






    }
}
