import java.util.Scanner;
import java.util.InputMismatchException;

public class diames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(" \n 1. Enero \n 2. Febrero \n 3. Marzo \n 4. Abril \n 5. Mayo \n 6. Junio \n 7. Julio \n 8. Agosto \n 9. Septiembre \n 10. Octubre \n 11. Noviembre \n 12. Diciembre \n Escriba el numero de mes segun corresponda:");
            int mes = input.nextInt();
            System.out.println("Escriba un dia del mes.");
            int dia = input.nextInt();

            boolean datoValido = false;
            switch (mes) {
                case 2:
                    if(dia >29) {
                        System.out.println("Este mes tiene hasta 29 dias en años bisiestos."); break;
                    }
                case 4 , 6, 9, 11:
                    if (dia > 31) {
                        System.out.println("Este mes tiene hasta 30 dias."); break;
                    }
            }

            if ( mes >=13) {
                System.out.println(mes+" no es un numero valido. Elija uno del rango asignado.");
            } else if (dia>31) {
                System.out.println("Numero de dia no valido.");
            } else  {
                System.out.println("Has elegido el dia: "+ dia+ " del mes: "+ mes + ".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Solo se permiten números enteros, no decimales ni letras.");
        }
    }
}
