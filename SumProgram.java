public class SumProgram {
    public static void main(String[] args) {
        int a = 121;
        int org = a;
        int rev = 0;
        int sumDigits = 0;

        // Calculate the sum of digits and check for palindrome
        while (a > 0) {
            int digit = a % 10;
            sumDigits += digit; // Sum of digits
            rev = rev * 10 + digit;
            a = a / 10;
        }

        // Check if the number is a palindrome
        if (org == rev) {
            System.out.println(org + " is a palindrome.");
        } else {
            System.out.println(org + " is not a palindrome.");
        }

        // Print the sum of digits
        System.out.println("Sum of digits: " + sumDigits);
    }
}
