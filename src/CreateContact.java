/**
 * Created by alexanderhughes on 2/5/16.
 */
public class CreateContact {

    public String name;
    public StreetAddress streetAddress = new StreetAddress();
    public PhoneNumber phoneNumber = new PhoneNumber();

    public void createContact() throws Exception {
        System.out.println("Please enter your new contact's info");
        System.out.println("Name:");
        name = Rolodex.scanner.nextLine();

        System.out.println("Address:");
        streetAddress.enterStreetAddress();

        phoneNumber.getPhoneNumber();
    }                                                //may create a class to store phone number
}
