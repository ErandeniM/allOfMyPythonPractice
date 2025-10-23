import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class boletosAvion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//HORAS
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime salida = LocalDateTime.of(2025, 9, 27, 18, 36, 10);
       // LocalDateTime fecha2 = LocalDateTime.of(2025, 9, 27, 20, 15, 0);
        long minRestantes = ChronoUnit.MINUTES.between(ahora, salida);


//Pantalla de inicio/intefaz
        System.out.println("--------BIENVENIDO A AEROLINEAS S1ST3M45----------");
        System.out.println("VUELO HMO-CDMX");
        System.out.println(" ");
        System.out.println("Hora actual: "+ ahora.format(formato));
        System.out.println("Horario de salida: "+ salida.format(formato));
        System.out.println("Minutos hasta el vuelo mas cercano: " + minRestantes);
        System.out.println(" ");
        if (minRestantes <= 30) {
            System.out.println("Las reservas para el vuelo " + salida.format(formato) + " se encuentran cerradas. Tiempo restante para el despegue: " +  minRestantes );
            input.close();
            return;
        }


        //asientos

        int userSel;
        boolean[] asientosDisponibles = new boolean[30];
        boolean hayDisponibles = false;
//asientos
         for (int i = 0; i < 30; i++) {
            asientosDisponibles[i] = true;
        }

        do {
        System.out.print("Ingrese el numero de asiento que desea reservar para comprobar su disponibilidad: ");
         userSel = input.nextInt();
        if (userSel < 1 || userSel > 30) {
            System.out.println("Error. El número de asientos disponibles es del 1 al 30.");
        } else if (asientosDisponibles[userSel - 1] == false) {
            System.out.println("Asiento "+userSel+" no disponible. Favor de seleccionar otro asiento.");
        } else {
            break;
        }
        } while (true);

        asientosDisponibles[userSel - 1] = false;

       /* Para probar el mensaje final
       for (int i = 0; i < 30; i++) {
            asientosDisponibles[i] = false;
        }*/

//Enviar mensaje de reserva al usuario
        double precio = 0;

        String clase;
            if ( userSel <= 10) {
                clase = "premier";
                precio = 3000;
            } else {
            clase = "turista";
           precio = 2000;
            }
        System.out.println("Has seleccionado el asiento " + userSel + ": clase: " + clase + ".El horario de salida es: "+ salida.format(formato)+ ".El costo del boleto es de: $" + precio );
        System.out.println("Tienes " + minRestantes + " minutos para preparar tu vuelo.");


//Comprobar si hay asientos ocupados
        for (int i = 0; i < 30; i++) {
            if (asientosDisponibles[i]== true) {
                hayDisponibles = true;
            }
        }
if (!hayDisponibles) {
    System.out.println("Todos los asientos para el vuelo: "+ salida.format(formato)  + " se encuentran reservados.");
    input.close();
    return;
}

}
    }
