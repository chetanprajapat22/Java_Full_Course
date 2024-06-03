package in.co.Excercise;

public class Armstrong2 {
    public static void main(String[] args) {
        int number = 407;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;
        int n = 0;

        // Find the number of digits in the number
        originalNumber = number;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Calculate the sum of the nth power of its digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += (int) Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the result is equal to the original number
        return result == number;
    }
}
