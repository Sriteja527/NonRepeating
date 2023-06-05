import java.util.*;
public class FirstNonRepeatingCharacter {
    public static int findFirstNonRepeatingCharacter(String s) {
        // Create an array to store the count of each character
        int[] charCount = new int[26]; // Assuming only lowercase alphabets
        
        // Count the occurrence of each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c - 'a']++;
        }
        
        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount[c - 'a'] == 1) {
                return i; // Return the index of the first non-repeating character
            }
        }
        
        return -1; // No non-repeating character found
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String input = sc.nextLine();
        int index = findFirstNonRepeatingCharacter(input);
        
        if (index != -1) {
            System.out.println("The first non-repeating character is '" + input.charAt(index) + "' at index " + index);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
