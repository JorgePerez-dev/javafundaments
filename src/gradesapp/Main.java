package gradesapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GradeManager manager = new GradeManager();
        int option;

        do {
            System.out.println("\n--- GESTIÓN DE NOTAS ---");
            System.out.println("1. Añadir alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Mostrar nota media");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            option = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (option) {
                case 1:
                    System.out.print("Nombre del alumno: ");
                    String name = scanner.nextLine();

                    System.out.print("Nota: ");
                    double grade = scanner.nextDouble();

                    manager.addStudent(name, grade);
                    System.out.println("Alumno añadido.");
                    break;

                case 2:
                    manager.showStudents();
                    break;

                case 3:
                    System.out.println("Nota media: " +
                            manager.calculateAverage());
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (option != 0);

        scanner.close();
    }
}
