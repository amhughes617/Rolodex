/**
 * Created by alexanderhughes on 2/6/16.
 */
public class PhoneNumber {

    public int areaCode;
    public int phoneNumber;

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
}
