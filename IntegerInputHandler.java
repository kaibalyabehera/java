
    
import java.util.InputMismatchException;
import java.util.Scanner;
 class IntegerInputHandelr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Please enter an integer: ");
            int userInput = scanner.nextInt(); // Try to read an integer from user input
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            // Close the scanner to release resources
            scanner.close();
        }
    }
}



//OUTPUT------------------



//Please enter an integer: 23
//You entered: 23






