import java.util.Scanner;

public class CharacterOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Input character to count
        System.out.print("Enter a character to count: ");
        char targetChar = scanner.next().charAt(0);
        
        // Close the scanner
        scanner.close();
        
        // Call the function to count occurrences
        int count = countOccurrences(inputString, targetChar);
        
        // Display the result
        System.out.println("The character '" + targetChar + "' occurs " + count + " times in the string.");
    }
    
    // Function to count occurrences of a character in a string
    public static int countOccurrences(String inputString, char targetChar) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }
}
