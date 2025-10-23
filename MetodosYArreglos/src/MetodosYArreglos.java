/*
Elaborar un programa que defina tres matrices A, B y S de 7
x 7, que lea números enteros para A y B, obtenga S
multiplicando los elementos A(1,1) y B(1,1) y lo coloque en el
 S(1,1), y así sucesivamente. Al final debe imprimir las tres
 matrices.
Utilizar un metodo para leer, otro para calcular la multiplicación
de matrices y otro para imprimir.
 */
import java.util.Scanner;
/* es capicua
public static boolean esCapicua(int numero){
instrucciones para calcular si es capicua
boolean valor = false;
...if...
valor = true;


}
*/
public class MetodosYArreglos { //la clase principal es el nombre del archivo basicamente
    public static void main(String[] args) { // una clase que no regresa ningun valor, dice main porque es la principal supongo que es el ejecutador principal de funciones, recibe un arreglo llamado string y el args no se q es
        int[][] a = new int[2][2]; //se declaran 3 arreglos bidimensionales cada uno con valores enteros de 2 en col y filas
        int[][] b = new int[2][2];
        int[][] s = new int[2][2];
        a = leerMatriz(a); // que? lo que veo es una variable, supongo que es el arreglo antes declarado el cual lee el valor de a dentro de la funcion leerMatriz
        b = leerMatriz(b);// pues este hace lo mismo pero ahora con b, la duda es que supongo que la matriz se llena con los valores de b, pero b que es, si b es el nombre de la matriz, y tambien seria el valor del metodo a lque se llama
        s = calcularMultiplicacionMatrices(a, b, s);// esta s, multiplica las matrices, como pues no se mas abajo vere
        System.out.println("Matriz A"); // imprime cada uno de los titulos de las matrices y a su vez la matriz rellenada de valores
        imprimirMatriz(a);
        System.out.println("Matriz B");
        imprimirMatriz(b);
        System.out.println("Matriz S");
        imprimirMatriz(s);
    }
    public static int[][] leerMatriz(int[][] m) {// se declara otra funcion estztica con un valor de enteros de arreglo bidimensional tiene un nombre y recibe un arreglo de enteros llamado m
        Scanner leer = new Scanner(System.in); //se hara uso de la entrada
        for (int r = 0; r < m.length; r++) {  // se inicializa una variable en 0, se ejecuta mientras r sea menor que la longitud de m, se aumenta el valor de r por 1
            for (int c = 0; c < m[r].length; c++) { // como es un arreglo bidimensional por cada renglon se repasa una columna hace lo mismo que anteriormente va recorriendo valores
                System.out.println("Escriba numero entero: "); // se rellena con los valores que el usuario ingreso
                m[r][c] = leer.nextInt();// si me queda confuso pero a su vez puedo visualizar que m fue el parametro del arreglo y que este 'acepta' los valores del arreglo bidimensional los cuales son renglones y columnas, antes recorridos
            }
        }
        return m; //regresa el valor de m, a quien ? a quien llame a la funcion supongo
    }
    public static int[][] calcularMultiplicacionMatrices
            (int[][] a, int[][] b, int[][] s) { // recibe 3 parametros, a b y s, estas fueron ya declaradas antes es necesario volver a declararlas?
        for (int r = 0; r < a.length; r++) { // se inicia el renglon en r, se ejecuta mientras que el renglon sea menor a la medida de a, se aumenta 1 el valor renglon
            for (int c = 0; c < a[r].length; c++) { //hace lo mismo q el anterior, recorre el arreglo mientras c sea menor a (aqui no entiendo bien mientras a multiplicado por r o el a de r ) de su largo, aumenta 1 el valor c
                s[r][c] = a[r][c] *  b[r][c]; //el int s recibe los valores de rc,y sera igual a los arreglos que recibio a y se multiplica por los que recibio b,
            }
        }
        return s;
    }
    public static void imprimirMatriz(int[][] m) { // se declara otra funcion que no regresa /guarda valor, solamente muestra al usuario este acepta un parametro de arreglo bidimensional llamado m  vuelve a recorrer e imprime el arreglo
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                System.out.print(m[r][c] + " ");
            }
            System.out.println();
        }
    }
}


/*APLICACION DE USO DE METODOS PARA LEER MATRICES
SE LEEN MATRICES Y SE IMPRIMEN LAS MATRICES
 */