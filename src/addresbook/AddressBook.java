package addresbook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private static final String FILE_NAME = "contacts.txt";
    private List<Contact> contacts = new ArrayList<>();

    public AddressBook() {
        loadContactsFromFile();
    }

    // 1. Cargar contactos desde el archivo
    private void loadContactsFromFile() {

        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {

                if (!line.contains(",")) {
                    continue; // ignora líneas incorrectas
                }

                String[] data = line.split(",");
                if (data.length == 2) {
                    contacts.add(new Contact(data[0], data[1]));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 2. Añadir contacto y guardarlo en el archivo
    public void addContact(String name, String phone) {

        Contact contact = new Contact(name, phone);
        contacts.add(contact);

        try (BufferedWriter bw =
                new BufferedWriter(new FileWriter(FILE_NAME, true))) {

            bw.write(contact.toString());
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showContacts() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
