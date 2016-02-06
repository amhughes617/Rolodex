/**
 * Created by alexanderhughes on 2/5/16.
 */
public class StreetAddress {     //Stores full street address

    public int number;
    public String streetName;
    public String city;
    public String state;
    public int zipcode;

    public void enterStreetAddress() {

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
        Rolodex.scanner.nextLine();
    }

    public void printAddress() {
        System.out.print(number + " " + streetName + "   " + city + ", " + state + "  " + zipcode);
    }

}