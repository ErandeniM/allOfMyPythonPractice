import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SistemaInscripciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Ingrese fecha de inicio de inscripciones (dd/MM/yyyy): ");
        String inicioStr = scanner.nextLine();
        System.out.print("Ingrese fecha límite de inscripciones (dd/MM/yyyy): ");
        String limiteStr = scanner.nextLine();

        try {
            Date fechaInicio = sdf.parse(inicioStr);
            Date fechaLimite = sdf.parse(limiteStr);
            Date fechaActual = new Date();

            if (fechaActual.before(fechaInicio)) {
                System.out.println("Aún no inician las inscripciones");
                return;
            }

            if (fechaActual.after(fechaLimite)) {
                System.out.println("Las inscripciones han cerrado");
                return;
            }

            System.out.print("Ingrese su nombre completo: ");
            String nombreEstudiante = scanner.nextLine();

            String[] materias = {"Álgebra", "Cálculo Diferencial e Integral I",
                    "Fundamentos de computación I", "Desarrollo de Sistemas I", "Ética"};
            int[] creditos = {4, 5, 5, 5, 2};
            double costoPorCredito = 50.0;

            ArrayList<String> materiasInscritas = new ArrayList<>();
            int totalCreditos = 0;

            int opcion;
            do {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1. Inscribir materias");
                System.out.println("2. Mostrar resumen de inscripción");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("\nMaterias disponibles:");
                        for (int i = 0; i < materias.length; i++) {
                            System.out.println((i + 1) + ". " + materias[i] + " (" + creditos[i] + " créditos)");
                        }

                        System.out.print("Seleccione el número de la materia: ");
                        int seleccion = scanner.nextInt();
                        scanner.nextLine();

                        if (seleccion < 1 || seleccion > materias.length) {
                            System.out.println("Selección inválida");
                            break;
                        }

                        String materiaSeleccionada = materias[seleccion - 1];
                        int creditosMateria = creditos[seleccion - 1];

                        if (materiasInscritas.contains(materiaSeleccionada)) {
                            System.out.println("Ya está inscrito en esta materia");
                            break;
                        }

                        if (totalCreditos + creditosMateria > 25) {
                            System.out.println("No puede exceder el límite de 25 créditos");
                            break;
                        }

                        materiasInscritas.add(materiaSeleccionada);
                        totalCreditos += creditosMateria;
                        System.out.println("Materia inscrita: " + materiaSeleccionada);
                        break;

                    case 2:
                        System.out.println("\n--- RESUMEN DE INSCRIPCIÓN ---");
                        System.out.println("Nombre del estudiante: " + nombreEstudiante);

                        if (materiasInscritas.isEmpty()) {
                            System.out.println("No se ha inscrito en ninguna materia");
                        } else {
                            System.out.println("Materias inscritas:");
                            for (String materia : materiasInscritas) {
                                System.out.println("- " + materia);
                            }
                            System.out.println("Total de créditos: " + totalCreditos);
                            double totalPagar = totalCreditos * costoPorCredito;
                            System.out.println("Total a pagar: $" + totalPagar);
                        }
                        break;

                    case 3:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }

            } while (opcion != 3);

        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido");
        }

        scanner.close();
    }
}
