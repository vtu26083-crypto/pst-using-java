import java.util.Scanner;

public class Task3 {

    // Function to check palindrome number
    public static int isPalinNum(int input1) {

        int temp = input1;
        int rev = 0;

        while (input1 > 0) {
            rev = rev * 10 + (input1 % 10);
            input1 = input1 / 10;
        }

        // If not palindrome return 1, else return 2
        if (rev != temp)
            return 1;

        return 2;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = isPalinNum(num);

        if (result == 2)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");

        sc.close();
    }
}

