/**
 * Created by alexanderhughes on 2/5/16.
 */
public class UserInput {

    public static String selection;

    public static void userInput() {

        selection = Rolodex.scanner.nextLine();

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
    }
}
