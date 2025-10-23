import java.util.regex.*;

/**
 *
 * @author la_er
 */
public class regex {
    public static void main (String[] args) {
        String texto = "ejemplo123@gmail.com";
        String patron = "[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);


        if(matcher.find()){
            System.out.println("Correo encontrado: "+ matcher.group());
        } else {
            System.out.println("No se encontro correo");


        }








    }






}

