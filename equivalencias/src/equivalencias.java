import java.util.Scanner;
public class equivalencias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una medida en metros para convertir: ");
        int num = input.nextInt();

        double pulgada = .0254; //metros
        double pie =  12 * pulgada;
        double yarda = 3 * pie;
        double metro, pulgC, yardC, pieC;

        System.out.println("~~~~~~~~~~~~~~CONVERSIONES~~~~~~~~~~~~~~~");
        System.out.println("METROS   YARDAS     PULGADAS      PIES");

        for (int i = 1; i <= num; i++) {
            metro = i;
            pulgC = i / pulgada;
            pieC =  i/ pie;
            yardC = i/ yarda;
            System.out.printf("%-8.0f %-10.5f %-12.2f %-10.5f%n", metro, yardC, pulgC, pieC);
        }
    }


}
