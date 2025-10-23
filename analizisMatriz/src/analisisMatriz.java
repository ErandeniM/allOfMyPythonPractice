/* Hacer un programa en Java para ingresar una matriz de 5 filas y 5 columnas
y calcular su matriz transpuesta. Crear un método para ingresar la matriz,
otro para imprimir la matriz y otro para calcular la matriz transpuesta. */

import java.util.Scanner;

public class analisisMatriz {
    public static void main(String[] args) {

        int[][] matriz = leerMatriz();
        int[][] darkMatriz = calcularMatriz(matriz);

        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        System.out.println("Matriz reordenada: ");
        imprimirMatriz(darkMatriz);

    }

    //funcion para ingresar los valores en la matriz
    public static int[][] leerMatriz() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Ingrese un numero entero para llenar la matriz en: " + i + ", " + j);
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    //funcion para ordenar la matriz
    //con el i recorro las filas y con la j las columnas de lo que ya ingresé anteriormente
    //se leen de izquierda a derecha por filas y de arriba a abajo
    public static int [][] calcularMatriz(int[][] matriz) {
        int[][] darkMatriz = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                darkMatriz[i][j] = matriz[j][i];
            }
        }
        return darkMatriz;

    }


    // funcion para imprimir la matriz
    public static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();

        }
    }


}