import java.util.Scanner;

public class fallasProduccion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] fallas = new int[9];
        int dia = 1;
        int tipo;

        System.out.println("REPORTE SEMANAL DE FALLAS");
        System.out.println("Tipos de fallas: 1, 2, 3, 4, 5, 6, 7, 8, 9");

for (dia = 1; dia <= 6; dia++) {
    System.out.println("Ingresa un numero de falla (1-9). Presiona 0 para pasar al siguiente dia.");
    while (true) {
        System.out.println("Tipo de falla ocurrido en el dia: " + dia);
        tipo = input.nextInt();
        if (tipo == 0) {
            break;
        }
        if (tipo >= 1 && tipo <= 9) {
            fallas[tipo - 1]++;
            System.out.println("Registrada falla tipo " + tipo);
        } else {
            System.out.println("Tipo de falla inválida");
        }

    }
}

        int totalFallas = 0;
        int tipoMasFrecuente = 0;
        int maxFallas = 0;

        for (int i = 0; i < 9; i++) {
            totalFallas += fallas[i];

            if (fallas[i] > maxFallas) {
                maxFallas = fallas[i];
                tipoMasFrecuente = i + 1;
            }
        }
         System.out.println("    REPORTE SEMANAL DE FALLAS    ");
        System.out.println("TOTAL DE FALLAS OCURRIDAS: " + totalFallas);

        for (int i = 0; i < 9; i++) {
            System.out.println("TOTAL FALLAS TIPO " + (i + 1) + ": " + fallas[i]);
        }

        System.out.println("TIPO DE FALLA QUE MÁS OCURRIÓ: " + tipoMasFrecuente);


    }



}
