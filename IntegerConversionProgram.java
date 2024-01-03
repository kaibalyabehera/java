 import java.util.Scanner;

public class IntegerConversionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Please enter an integer: ");
            String userInput = scanner.nextLine(); // Read user input as a string
            if (userInput == null || userInput.isEmpty()) {
                throw new NullPointerException("Input is null or empty");
            }
            int intValue = Integer.parseInt(userInput); // Convert the input to an integer
            System.out.println("You entered: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Input is null or empty. Please enter a valid integer.");
        } finally {
            // Close the scanner to release resources
            scanner.close();
        }
    }
}


//OUTPUT----------
// Please enter an integer: 76
//You entered: 76       

          




