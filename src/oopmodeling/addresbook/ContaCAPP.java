package oopmodeling.addresbook;

import java.util.Scanner;

public class ContaCAPP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddresBook book = new AddresBook();

        int option = 0;

        while (option != 4) {

            System.out.println("\n1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Eliminar (por índice)");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            option = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            // OPCIÓN 1
            if (option == 1) {

                System.out.print("Nombre: ");
                String name = sc.nextLine();

                System.out.print("Teléfono: ");
                String phone = sc.nextLine();

                book.addContact(new Contact(name, phone));
            } 

            // OPCIÓN 2
            else if (option == 2) {

                book.showContacts();
            } 

            // OPCIÓN 3
            else if (option == 3) {

                book.showContacts();
                System.out.print("Número del contacto a eliminar: ");

                int index = sc.nextInt();
                sc.nextLine();

                if (index > 0 && index <= book.contacts.size()) {
                    Contact c = book.contacts.get(index - 1);
                    book.removeContact(c);
                } else {
                    System.out.println("Índice inválido.");
                }
            } 

            // OPCIÓN 4
            else if (option == 4) {

                System.out.println("Adiós!");
            } 

            // CUALQUIER OTRO NÚMERO
            else {

                System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}
