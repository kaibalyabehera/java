
    import java.util.Scanner;

    public class SimpleCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);10

    
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
    
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
    
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
    
            double result;
    
            try {
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator entered.");
                }
            } catch (Exception e) {
                System.out.println("Error: An exception occurred. Please check your input.");
            } finally {
                scanner.close();
            }
        }
    }






    //OUTPUT--------------
   // Enter the first number: 55
// the operator (+, -, *, /): *
//Enter the second number: 88
//Result: 4840.0