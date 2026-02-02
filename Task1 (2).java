public class Task1 {

    // Function to calculate sum of even or odd digits
    public static int EvenOddDigitsSum(int input1, String input2) {
        int sum = 0;

        while (input1 > 0) {
            int d = input1 % 10;

            if (input2.equalsIgnoreCase("even") && d % 2 == 0) {
                sum += d;
            } 
            else if (input2.equalsIgnoreCase("odd") && d % 2 != 0) {
                sum += d;
            }

            input1 = input1 / 10;
        }
        return sum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int number = 12345;

        System.out.println("Sum of even digits: " + EvenOddDigitsSum(number, "even"));
        System.out.println("Sum of odd digits: " + EvenOddDigitsSum(number, "odd"));
    }
}
