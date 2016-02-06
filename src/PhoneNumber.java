/**
 * Created by alexanderhughes on 2/6/16.
 */
public class PhoneNumber {

    public int areaCode;
    public int phoneNumber;

    public void getPhoneNumber() throws Exception {

            System.out.print("Enter phone number area code: ");

            if (Rolodex.scanner.hasNextInt()) {
                areaCode = Rolodex.scanner.nextInt();
                Rolodex.scanner.nextLine(); //nextInt() was basically entering an empty string into the streetName nextLine()
            }
            else {
                    throw new Exception("Invalid Response!!!"); // exception for non int input
                }
            System.out.print("Enter 7 digit phone number: ");

            if (Rolodex.scanner.hasNextInt()) {
                phoneNumber = Rolodex.scanner.nextInt();
                Rolodex.scanner.nextLine();     //put this one here as the next bit of code after this method is running a nextLine()
                }
            else {
                throw new Exception("Invalid Response!!!"); // exception for non int input
            }

            }
    public void printPhoneNumber() {
        System.out.print("(" + areaCode + ")" + phoneNumber);
    }
}
