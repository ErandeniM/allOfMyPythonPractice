import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import.java.time.temporal.ChronoUnit;


public class salidasavion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------BIENVENIDO A AEROLINEAS S1ST3M45----------");
        System.out.print("Ingrese el numero de asiento que desea reservar para comprobar su disponibilidad: ");
        String userSel = input.nextLine();

        boolean[] asientos =;
                LocalDate myObj = LocalDate.now();



        LocalDateTime fecha1 = LocalDateTime.of(year:2025,month:9, dayOfMonth:9, hour:)
        LocalDateTime fecha2 = LocalDateTime.of()
        long dias = ChronoUnit.DAYS.between(fecha1, fecha2);

        long hours = ChronoUnit.HOURS.between(fecha1, fecha2);
        long minutes = ChronoUnit.MINUTES.between(fecha1, fecha2);
        System.out.println("Dias de diferencia: " + dias);
        System.out.println("Horas de diferencia: " + hours);
        System.out.println("Minutos diferencia: " + minutes);

    }



}
