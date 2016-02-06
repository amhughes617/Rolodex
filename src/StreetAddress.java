/**
 * Created by alexanderhughes on 2/5/16.
 */
public class StreetAddress {     //Stores full street address

    public int number;
    public String streetName;
    public String city;
    public String state;
    public int zipcode;

    public void enterStreetAddress() throws Exception { //takes input of the contacts street address

        while (true) {
            System.out.println("Please enter street number:");
            if (Rolodex.scanner.hasNextInt()) {
                number = Rolodex.scanner.nextInt();
                Rolodex.scanner.nextLine(); //nextInt() was basically entering an empty string into the streetName nextLine()
                break;
            } else {
                throw new Exception("Invalid Response!!!"); // exception for non int input
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
            if (Rolodex.scanner.hasNextInt()) {
                zipcode = Rolodex.scanner.nextInt();
                Rolodex.scanner.nextLine();     //put this one here as the next bit of code after this method is running a nextLine()
                break;
            }
            else {
                throw new Exception("Invalid Response!!!"); // exception for non int input
            }
        }
    }

    public void printAddress() { //print address is here because its variables are here making it easier to run
        System.out.print(number + " " + streetName + "   " + city + ", " + state + "  " + zipcode);
    }

}