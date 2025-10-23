//import java.util.InputMismatchException;
//import java.util.Scanner;  //la libreria no esta usandose si esta en gris
import java.io.BufferedReader; //requiere al de abajo
import java.io.IOException;
import java.io.InputStreamReader; //lee caracter por caracter /se tiene q definir la libreria
public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in); //se creo un obj de la clase scanner Se requiere el system in de entrada
       BufferedReader br = new BufferedReader(isr);

       String nombre = null;
        int numero =0;
        double numeroDecimal = 0.0;

        try //intentara ejecutar instrucciones  en caso de q se genere una excepcion  en lugar de q truene envia el msj de error
        {
            System.out.println("Escriba nombre: ");
       // nombre = leer.nextLine(); //nextline lee la cadena de caracteres pero si escribo solo next no acepta espacios solo 1 palabra
            nombre =br.readLine();
            System.out.println("Escriba numero entero: ");
         //   numero = leer.nextInt();
            numero = Integer.parseInt(br.readLine());
            System.out.println("Escriba numero decimal: ");
           // numeroDecimal = leer.nextDouble();
            numeroDecimal = Double.parseDouble(br.readLine());
        } catch(IOException ioe) {
            System.out.println("Error: numero invalido");
        } catch(NumberFormatException nfe) {
            System.out.println("Error: numero invalido");
        }


        System.out.println("El nombre es: " + nombre);
        System.out.println("El numero es: " + numero);
        System.out.println("El numero decimal: " + numeroDecimal);
        }
    }
