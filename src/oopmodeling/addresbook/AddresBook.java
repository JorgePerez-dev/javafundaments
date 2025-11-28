package oopmodeling.addresbook;

public class AddresBook {

    protected FlexibleArray<Contact> contacts = new FlexibleArray<>();

    public void showContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts yet.");
            return;
        }

        System.out.println("\n--- Contacts ---");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    public void addContact(Contact c) {
        contacts.add(c);
        System.out.println("Contact added: " + c);
    }

    public void removeContact(Contact c) {
        if (contacts.remove(c)) {
            System.out.println("Contact removed: " + c);
        } else {
            System.out.println("Contact not found.");
        }
    }
}
