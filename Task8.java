import java.util.Scanner;

public class Task8 {

    // Function to find the most frequently occurring digit
    static int mostFrequentDigit(int n) {

        int[] freq = new int[10];

        // Convert negative number to positive
        if (n < 0)
            n = -n;

        // Special case: n = 0
        if (n == 0)
            return 0;

        while (n > 0) {
            freq[n % 10]++;
            n = n / 10;
        }

        int max = freq[0];
        int digit = 0;

        // If tie, smaller digit is returned
        for (int i = 1; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }

        return digit;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = mostFrequentDigit(num);

        System.out.println("Most frequently occurring digit = " + result);

        sc.close();
    }
}
