/**
 * Created by alexanderhughes on 2/5/16.
 */
public class StreetAddress {     //Stores full street address

    public int number;
    public String streetName;
    public String city;
    public String state;
    public int zipcode;

    public void enterStreetAddress() { //takes input of the contacts street address

        System.out.println("Please enter street number:");
        number = Rolodex.scanner.nextInt();
        Rolodex.scanner.nextLine(); //nextInt() was basically entering an empty string into the streetName nextLine()

        System.out.println("Please enter street name:");
        streetName = Rolodex.scanner.nextLine();

        System.out.println("Please enter city name:");
        city = Rolodex.scanner.nextLine();

        System.out.println("Please enter state:");
        state = Rolodex.scanner.nextLine();

        System.out.println("Please enter zipcode:");
        zipcode = Rolodex.scanner.nextInt();
        Rolodex.scanner.nextLine();     //put this one here as the next bit of code after this method is running a nextLine()
    }

    public void printAddress() { //print address is here because its variables are here making it easier to run
        System.out.print(number + " " + streetName + "   " + city + ", " + state + "  " + zipcode);
    }

}