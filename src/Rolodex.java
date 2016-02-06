import java.util.Scanner;

/**
 * Created by alexanderhughes on 2/5/16.
 */
public class Rolodex {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Would you like to...");
            System.out.println("1. Create new contact.");
            System.out.println("2. List contacts.");
            System.out.println("3. Delete contact.");
            System.out.println("(Enter the number corresponding to your choice)");
            String selection = scanner.nextLine();

            while (true) {
                switch (selection) {
                    case "1":
                        //create new contact
                        break;
                    case "2":
                        //list contacts
                        break;
                    case "3":
                        //delete contact
                        break;
                    default:
                        System.out.println("Incorrect response, please try again");
                        break;
                }
                break;
            }
        }
    }
}
