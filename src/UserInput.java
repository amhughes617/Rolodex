/**
 * Created by alexanderhughes on 2/5/16.
 */
public class UserInput {

    public static void userInput() throws Exception {
        String selection = null;       //resets selection for each loop through method
        selection = Rolodex.scanner.nextLine();
        CreateContact contact = new CreateContact();

        switch (selection) {
            case "1":                   //create new contact
                contact.createContact();
                Rolodex.contacts.add(contact);
                break;
            case "2":       //displays contacts
                ListContacts.listContacts(contact);      //list contacts
                break;
            case "3":       //deletes selected contact
                DeleteContact.deleteContact(contact);
                break;
            default:
                System.out.println("Incorrect response, please try again");
                break;
        }
    }
}
