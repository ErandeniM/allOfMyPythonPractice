
/*Elaborar un programa que permita leer un número entero e indique si es capicúa
 (es capicúa si se lee igual de izquierda a derecha que en sentido contrario).
 Utilizar un método que reciba como parámetro el número y que proporcione
 el valor True si es capicúa o False en caso de no ser capicúa.
 Ejemplo: 1991.*/

import java.util.Scanner;

public class capicua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Qué es un capicúa?\nUn número (o palabra) es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda.");
        System.out.println("Escribe un numero para determinar si es capicua o no: ");
        String num = input.nextLine();
        boolean esCapicua = checker(num);

        if (esCapicua) {
            System.out.println(num + " Es capicúa");
        } else {
            System.out.println(num + " No es capicúa");
        }

    }

    public static boolean checker(String num) {
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) { //si el caracter en la posicion i del numero no es igual al ultimo y recorre en invertido
                return false;
            }

        }
        return true;

    }

    //tengo que recibir un numero
    //analizo el numero contando la cantidad de caracteres que tiene
    //puedo hacer dos cosas primero dividir a la mitad y si es par hacer una cosa pero si es impar hacer otra
    //si es par me quedo con la mitad de los valores, cambio de posicion el fragmento es decir lo invierto o volteo y comparo
    //si es impar, parto en dos y busco el numero que esta exactamente en medio
    //luego borro ese numero y hago lo mismo como cuando cheque si era par
    //uso un == para verificar si es igualito y si es es capicua y si no pues es false

}






















