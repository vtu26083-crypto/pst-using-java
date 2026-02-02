import java.util.Scanner;

public class Task6 {

    // Function to calculate sum of digits raised to power of total digits
    static int sumOfPowerDigits(int n) {

        int temp = n;
        int sum = 0;

        // Count number of digits
        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int d = temp % 10;
            sum += (int) Math.pow(d, digits); // FIXED
            temp = temp / 10;
        }

        return sum;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sumOfPowerDigits(num);

        System.out.println("Sum of power of digits = " + result);

        // Armstrong check
        if (result == num)
            System.out.println("It is an Armstrong Number");
        else
            System.out.println("It is NOT an Armstrong Number");

        sc.close();
    }
}
