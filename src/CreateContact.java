/**
 * Created by alexanderhughes on 2/5/16.
 */
public class CreateContact {
    public String name;
    public StreetAddress streetAddress = new StreetAddress();
    public String phoneNumber;

    public void createContact() throws Exception {
        System.out.println("Please enter your new contact's info");
        System.out.println("Name:");
        name = Rolodex.scanner.nextLine();

        System.out.println("Address:");
        streetAddress.enterStreetAddress();

        System.out.println("Phone Number:");
        phoneNumber = Rolodex.scanner.nextLine();    //stored as string instead of int so 10 digit numbers could be stored
    }                                                //may create a class to store phone number
}
