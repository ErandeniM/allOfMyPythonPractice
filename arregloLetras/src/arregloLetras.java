import java.util.Random;

public class arregloLetras {
    public static void main(String[] args) {

     int[] array = new int[10];
     Random random = new Random();

     for (int i = 0; i < array.length; i++) {
         array[i] = random.nextInt(26)+97;
     }

        for (int i = 0; i < array.length; i++){
            int numeroRandom = array [i];

     switch(numeroRandom){
         case 97:
             System.out.println("a");
             break;
             case 101:
                 System.out.println("e");
                 break;
         case 105:
             System.out.println("i");
             break;
             case 111:
                 System.out.println("o");
                 break;
                 case 117:
                     System.out.println("u");
                     break;
                     default:
                         System.out.println("-");
                         break;
     }



     }






/* 66 al 90 mayusculas
 97-122 minusculas
*/



    }
}
// hacer una linea de tiempo de la evolucion de los discos duros
// debe contener texto e imagenes y el a;o que se hace referencia