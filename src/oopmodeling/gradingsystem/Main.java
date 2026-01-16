package oopmodeling.gradingsystem;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionNotas gestion = new GestionNotas();
        int opcion;

        do {
            System.out.println("\nGESTIÓN DE NOTAS");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("3. Buscar alumno");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Nota: ");
                double nota = sc.nextDouble();
                gestion.agregar(new Alumno(nombre, nota));

            } else if (opcion == 2) {
                gestion.listar();

            } else if (opcion == 3) {
                System.out.print("Nombre a buscar: ");
                gestion.buscar(sc.nextLine());

            } else if (opcion == 4) {
                System.out.print("Nombre a eliminar: ");
                gestion.eliminar(sc.nextLine());
            }

        } while (opcion != 5);

        sc.close();
    }
}
