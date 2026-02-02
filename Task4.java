import java.util.Scanner;

public class Task4 {

    // Function to add last digits of two numbers
    public static int addLastDigits(int input1, int input2) {

        // Convert negative numbers to positive
        if (input1 < 0)
            input1 = -input1;
        if (input2 < 0)
            input2 = -input2;

        return (input1 % 10) + (input2 % 10);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = addLastDigits(num1, num2);

        System.out.println("Sum of last digits = " + result);

        sc.close();
    }
}
