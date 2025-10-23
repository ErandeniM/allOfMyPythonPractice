import java.util.Scanner;


public class sucursales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ;
        String[] nombresSuc = new String[10];
        double[] ventasTotales = new double[10];
        double[][] ventasXDias = new double[10][6];

        int mejorSucursal = 0;
        double ventaMayor = 0;
        int diaMayorVenta = 0;
        double ventaDiaMayor = 0;
        double[] totalPorDia = new double[6];


        for (int ren = 0; ren < 10; ren++) {
            System.out.println("Ingrese el nombre de la sucursal: " + (ren + 1));
            nombresSuc[ren] = input.nextLine();

            for (int col = 0; col < 6; col++) {
                System.out.println("Ingrese la cantidad de ventas del dia " + (col + 1) + ".");
        /*para convertir lo ingresado por el usuario es necesario parsear los valores, en caso de
        el resultado sea un string "", convierte lo ingresado a valor double*/
                double venta = Double.parseDouble(input.nextLine());


                /*declarar las variables asignandoles el primer valor del for*/
                ventasTotales[ren] += venta;
                ventasXDias[ren][col] = venta;
                totalPorDia[col] += venta;
            }
        }
        /*para saber cual es la sucursal con mas ventas*/
        for (int ren = 0; ren < 10; ren++) {
            if (ventasTotales[ren] > ventaMayor) {
                ventaMayor = ventasTotales[ren];
                mejorSucursal = ren ;
            }
        }
//para saber cual es el dia con mas ventas
        for (int ren = 0; ren < 6; ren++) {
            if (totalPorDia[ren] > ventaDiaMayor) {
                ventaDiaMayor = totalPorDia[ren];
                diaMayorVenta = ren + 1;
            }

        }

//printing time :)
        System.out.println("REPORTE SEMANAL DE VENTAS");
        System.out.println("\nSUCURSAL                DÍA1   DÍA2   DÍA3   DÍA4   DÍA5   DÍA6   VENTA SEMANAL");
        System.out.println("-----------------------------------------------------------------------------");

        for (int ren = 0; ren < 10; ren++) {
            System.out.printf("%-23s", nombresSuc[ren]);
            for (int col = 0; col < 6; col++) {
                System.out.printf("%7.0f", ventasXDias[ren][col]);
            }

            System.out.printf("%10.0f%n", ventasTotales[ren]);
        }

        System.out.println("-----------------------------------------------------------------------------");

        System.out.printf( "TOTALES");
        for (int col = 0; col < 6; col++) {
            System.out.printf("%7.0f", totalPorDia[col]);
        }
        System.out.printf("%10.0f%n",
                totalPorDia[0] + totalPorDia[1] + totalPorDia[2] +
                        totalPorDia[3] + totalPorDia[4] + totalPorDia[5]);


        System.out.println("SUCURSAL MAS VENDEDORA: " + nombresSuc[mejorSucursal]);
        System.out.printf("VENTA DE LA SUCURSAL MÁS VENDEDORA: %.2f%n", ventaMayor);
        System.out.println("DIA CON MAYOR VENTA GLOBAL: DIA " + diaMayorVenta);
        System.out.printf("VENTA MAXIMA EN ESE DIA: %.2f%n", ventaDiaMayor);

    }
}