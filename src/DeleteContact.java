/**
 * Created by alexanderhughes on 2/5/16.
 */
public class DeleteContact {

    public static void deleteContact(CreateContact contact) {
        ListContacts.listContacts(contact);      //list contacts
        System.out.println("Please enter the index number of the contact you wish to delete:");
        int choice = Rolodex.scanner.nextInt();
        Rolodex.contacts.remove(choice - 1);
    }
}
