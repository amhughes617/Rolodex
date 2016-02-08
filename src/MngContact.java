/**
 * Created by alexanderhughes on 2/5/16.
 */
public class MngContact {

    public String name;
    public ContactInfo streetAddress = new ContactInfo();
    public ContactInfo phoneNumber = new ContactInfo();

    public void createContact() {
        System.out.println("Please enter your new contact's info");
        System.out.println("Name:");
        name = Rolodex.scanner.nextLine();

        System.out.println("Address:");
        streetAddress.enterStreetAddress();

        phoneNumber.getPhoneNumber();
    }                                                //may create a class to store phone number

    public static void listContacts(MngContact contact) {
        for (int i = 0; i < Rolodex.contacts.size(); i++) {
            contact = (MngContact) Rolodex.contacts.get(i);
            System.out.print((i + 1) + ". " + contact.name + ": ");
            System.out.print(" Address: ");
            contact.streetAddress.printAddress();       //calls through contact object the streetAddress object made in CreatContact
            System.out.print("; Phone Number: ");
            contact.phoneNumber.printPhoneNumber();     // same as above cont.ContactInfo...
            System.out.println();
        }
    }


    public static void deleteContact(MngContact contact) {

        while (true) {
            int choice;
            listContacts(contact);      //list contacts
            System.out.println("Please enter the index number of the contact you wish to delete:");

            try {
                choice = Rolodex.scanner.nextInt();

                if (choice <= Rolodex.contacts.size() && choice > 0) {
                    Rolodex.contacts.remove(choice - 1);
                    Rolodex.scanner.nextLine();
                    break;
                } else {
                    System.out.println("Invalid Response!!!");
                }
            } catch (Exception e) {
                System.out.println("Invalid Response!!!");
                Rolodex.scanner.nextLine();
            }

        }
        System.out.println("Contact deleted.");
    }
}