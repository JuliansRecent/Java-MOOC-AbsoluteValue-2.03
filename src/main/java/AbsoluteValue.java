
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect the inputted number from the user
        int input = Integer.valueOf(scanner.nextLine());

        // If the number is less than 0, multiply the number by -1 and print the output
        if (input < 0) {
            System.out.println(input * -1);
        } else {
            // Else, just print the inputted number
            System.out.println(input);
        }

    }
}
