/**
 * Created by alexanderhughes on 2/5/16.
 */
public class UserInput {

    public static void userInput(MngContact contact) {
        String selection;
        selection = Rolodex.scanner.nextLine();

        switch (selection) {
            case "1":                   //create new contact
                contact.createContact();
                Rolodex.contacts.add(contact);
                break;
            case "2":       //displays contacts
                MngContact.listContacts(contact);      //list contacts
                break;
            case "3":       //deletes selected contact
                MngContact.deleteContact(contact);
                break;
            default:
                System.out.println("Incorrect response, please try again");
                break;
        }
    }
}
