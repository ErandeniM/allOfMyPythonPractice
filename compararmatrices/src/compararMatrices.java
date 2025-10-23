//Elaborar un programa que permita leer números enteros en una matriz de 4 x 5
//e imprima los elementos que al mismo tiempo sean el mayor de su renglón
//y el mayor de su columna. Usar un método para leer la matriz y otro para imprimir la matriz.

import java.util.Scanner;

public class compararMatrices {
    public static void main(String[] args) {
        int[][] matriz = leerMatriz(); //se tiene que llamar al metodo para llenar la matriz
        System.out.println("Matriz Ingresada: ");
        imprimirMatriz(matriz);
        System.out.println("Numeros que son de su respectivo renglon y columna: ");
        calcularMatrices(matriz);

    }

    //funcion donde ingresas los valores
    public static int[][] leerMatriz() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][5];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Ingrese un numero para llenar la matriz en: " + i + ", " + j);
                m[i][j] = sc.nextInt();

            }
        }
        return m;

    }

    //funcion para calcular los elementos mayores
    public static void calcularMatrices(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
//checar el mayor del renglon
                boolean esMayorRenglon = true;
                for (int k = 0; k < matriz[i].length; k++) {
                    if (matriz[i][j] < matriz[i][k]) {
                        esMayorRenglon = false;
                        break;
                    }
                }
//checar el mayor de la columna
                boolean esMayorColumna = true;
                for (int k = 0; k < matriz.length; k++) {
                    if (matriz[i][j] < matriz[k][j]) {
                        esMayorColumna = false;
                        break;
                    }
                }
                if (esMayorRenglon && esMayorColumna) {
                    System.out.println("Elemento mayor: " + matriz[i][j] +
                            " en [" + i + "][" + j + "]");
                }
            }
        }
    }

    //funcion para imprimir la matriz recorriendo el arreglo de nuevo, se llama arriba con la matriz leerMatriz como argumento
    public static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }


    }
}
