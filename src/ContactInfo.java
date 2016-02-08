/**
 * Created by alexanderhughes on 2/5/16.
 */
public class ContactInfo {     //Stores full street address

    public int number;
    public String streetName;
    public String city;
    public String state;
    public int zipcode;
    public int areaCode;
    public int phoneNumber;

    public void enterStreetAddress() { //takes input of the contacts street address

        while (true) {
            System.out.println("Please enter street number:");

            try {
                number = Rolodex.scanner.nextInt();
                Rolodex.scanner.nextLine(); //nextInt() was basically entering an empty string into the streetName nextLine()
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Response!!!");
                Rolodex.scanner.nextLine();     //consumes empty line from nexInt() carriage return to prevent infinite loop of invalid responses
            }
        }

        System.out.println("Please enter street name:");
        streetName = Rolodex.scanner.nextLine();

        System.out.println("Please enter city name:");
        city = Rolodex.scanner.nextLine();

        System.out.println("Please enter state:");
        state = Rolodex.scanner.nextLine();

        while (true) {
            System.out.println("Please enter zipcode:");

            try {
                zipcode = Rolodex.scanner.nextInt();
                Rolodex.scanner.nextLine();     //put this one here as the next bit of code after this method is running a nextLine()
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Response!!!");
                Rolodex.scanner.nextLine();
            }
        }
    }

    public void getPhoneNumber() {

        while (true) {
            System.out.println("Enter phone number area code: ");

            try {
                areaCode = Rolodex.scanner.nextInt();
                Rolodex.scanner.nextLine(); //nextInt() was basically entering an empty string into the streetName nextLine()
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Response!!!");
                Rolodex.scanner.nextLine(); //prevents infinite loop problem where the nextLine() in try keeps reading the non int input forever
            }
        }

        while (true) {
            System.out.println("Enter 7 digit phone number: ");

            try {
                phoneNumber = Rolodex.scanner.nextInt();
                Rolodex.scanner.nextLine();     //put this one here as the next bit of code after this method is running a nextLine()
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Response!!!");
                Rolodex.scanner.nextLine();
            }
        }
    }

    public void printPhoneNumber() {
        System.out.print("(" + areaCode + ")" + phoneNumber);
    }
    public void printAddress() { //print address is here because its variables are here making it easier to run
        System.out.print(number + " " + streetName + "   " + city + ", " + state + "  " + zipcode);
    }


}