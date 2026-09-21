import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker");
        System.out.println("------------------");
        System.out.print("\nEnter a word or phrase: ");

        String originalInput = scanner.nextLine();
        String lowercaseInput = originalInput.toLowerCase();
        StringBuilder cleanedText = new StringBuilder();

        for (int i = 0; i < lowercaseInput.length(); i++) {
            char character = lowercaseInput.charAt(i);

            if (Character.isLetterOrDigit(character)) {
                cleanedText.append(character);
            }
        }

        StringBuilder reversedText = new StringBuilder(cleanedText);
        reversedText.reverse();

        boolean isPalindrome = cleanedText.toString().equals(reversedText.toString());

        System.out.println("\nOriginal input: " + originalInput);
        System.out.println("Cleaned text: " + cleanedText);
        System.out.println("Reversed text: " + reversedText);

        if (isPalindrome) {
            System.out.println("\nResult: This is a palindrome.");
        } else {
            System.out.println("\nResult: This is not a palindrome.");
        }

        scanner.close();
    }
}