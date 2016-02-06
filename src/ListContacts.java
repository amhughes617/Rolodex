/**
 * Created by alexanderhughes on 2/5/16.
 */
public class ListContacts {

    public static void listContacts(CreateContact contact) {
        for (int i = 0; i < Rolodex.contacts.size(); i++) {
            contact = (CreateContact) Rolodex.contacts.get(i);
            System.out.print((i+1) + ". " + contact.name + ": ");
            System.out.print(" Address: ");
            contact.streetAddress.printAddress();
            System.out.println("; Phone Number: " + contact.phoneNumber);
            System.out.println();
        }
    }
}
