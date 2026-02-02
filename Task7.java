import java.util.Scanner;

public class Task7 {

    // Function to count unique digits in a number
    static int uniqueDigitCount(int n) {

        boolean[] seen = new boolean[10];
        int count = 0;

        // Convert negative number to positive
        if (n < 0)
            n = -n;

        // Special case: n = 0
        if (n == 0)
            return 1;

        while (n > 0) {
            int d = n % 10;

            if (!seen[d]) {
                seen[d] = true;
                count++;
            }
            n = n / 10;
        }

        return count;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = uniqueDigitCount(num);

        System.out.println("Number of unique digits = " + result);

        sc.close();
    }
}


