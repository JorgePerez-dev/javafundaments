package addresbook;

public class Main {

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        book.addContact("Pablo", "12345");
        book.addContact("Andres", "67890");

        book.showContacts();
    }
}
