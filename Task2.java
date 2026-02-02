import java.util.Scanner;

public class Task2 {

    // Function to find nth Fibonacci number
    public static long nthFibonacci(int input1) {

        // Base cases
        if (input1 == 0)
            return 0;
        if (input1 == 1)
            return 1;

        long a = 0;
        long b = 1;
        long c = 0;

        for (int i = 2; i <= input1; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        long result = nthFibonacci(n);
        System.out.println("Nth Fibonacci number is: " + result);

        sc.close();
    }
}
