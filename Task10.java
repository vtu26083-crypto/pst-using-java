import java.util.Scanner;

public class Task10 {

    // Function to return second word in uppercase
    static String secondWordUpper(String str) {

        String[] words = str.split(" ");

        if (words.length < 2)
            return "LESS";

        return words[1].toUpperCase();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String result = secondWordUpper(input);

        System.out.println("Output: " + result);

        sc.close();
    }
}
