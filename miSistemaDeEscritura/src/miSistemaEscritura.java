import java.util.Scanner;


public class miSistemaEscritura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nFecha: 25/octubre/2007\nArma tu nickname para messenger gratis.\n\n");
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        nombre = nombre.toUpperCase();
        String nombreModif = "";

        for (int i = 0; i < nombre.length(); i++) {
            char letraRecorrida = nombre.charAt(i);

            switch (letraRecorrida) {
                case 'A':
                    nombreModif += "å";
                    break;
                case 'B':
                    nombreModif += "β";
                    break;
                case 'C':
                    nombreModif += "©";
                    break;
                case 'D':
                    nombreModif += "đ";
                    break;
                case 'E':
                    nombreModif += "ɛ";
                    break;
                case 'F':
                    nombreModif += "ӻ";
                    break;
                case 'G':
                    nombreModif += "ϱ";
                    break;
                case 'H':
                    nombreModif += "Ħ";
                    break;
                case 'I':
                    nombreModif += "!";
                    break;
                case 'J':
                    nombreModif += "Ĵ";
                    break;
                case 'K':
                    nombreModif += "κ";
                    break;
                case 'L':
                    nombreModif += "∟";
                    break;
                case 'M':
                    nombreModif += "ϻ";
                    break;
                case 'N':
                    nombreModif += "η";

                    break;
                case 'O':
                    nombreModif += "θ";
                    break;
                case 'P':
                    nombreModif += "ҏ";
                    break;
                case 'Q':
                    nombreModif += "Ψ";
                    break;
                case 'R':
                    nombreModif += "Я";

                    break;
                case 'S':
                    nombreModif += "ϩ";
                    break;
                case 'T':
                    nombreModif += "†";
                    break;
                case 'U':
                    nombreModif += "ů";
                    break;
                case 'V':
                    nombreModif += "ν";
                    break;
                case 'W':
                    nombreModif += "ω";
                    break;
                case 'X':
                    nombreModif += "ж";
                    break;
                case 'Y':
                    nombreModif += "Ӵ";
                    break;
                case 'Z':
                    nombreModif += "ζ";
                    break;
                default:
                    System.out.println("Sin datos para este simbolo."  + letraRecorrida);

            }

        }

        System.out.println("Tu nickname es: ˚ ༘♡ ⋆｡˚⋆୨୧˚" + nombreModif + "˚⋆୨୧˚ ༘♡ ⋆｡˚");

    }
}
