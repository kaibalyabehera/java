
    import java.util.ArrayList;

public class SumEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);
        numbers.add(8);
        numbers.add(10);

        // Calculate the sum of even numbers
        int sum = sumEvenNumbers(numbers);

        System.out.println("Sum of even numbers: " + sum);
    }

    public static int sumEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number; // Add the even number to the sum
            }
        }

        return sum;
    }
}


//OUTPUT--------------

//Sum of even numbers: 30



