/**
 * Created by alexanderhughes on 2/5/16.
 */
public class DeleteContact {

    public static void deleteContact(CreateContact contact) {

        while (true) {
            int choice;
            ListContacts.listContacts(contact);      //list contacts
            System.out.println("Please enter the index number of the contact you wish to delete:");

            try {
                choice = Rolodex.scanner.nextInt();

                if (choice <= Rolodex.contacts.size() && choice > 0) {
                    Rolodex.contacts.remove(choice - 1);
                    Rolodex.scanner.nextLine();
                    break;
                }
                else {
                    System.out.println("Invalid Response!!!");
                }
            }
            catch (Exception e) {
                System.out.println("Invalid Response!!!");
                Rolodex.scanner.nextLine();
            }

        }
        System.out.println("Contact deleted.");
    }
}
