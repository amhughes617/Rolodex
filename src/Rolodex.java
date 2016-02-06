import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by alexanderhughes on 2/5/16.
 */
public class Rolodex {

    public static ArrayList contacts = new ArrayList();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {

            QueryPrint.queryPrint();

            while (true) {

                UserInput.userInput();
                break;
            }
        }
    }
}
