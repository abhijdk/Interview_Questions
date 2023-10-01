package hacker_rank_codes;
public class ReverseString {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        
        // Create a StringBuilder object and initialize it with the input string
        StringBuilder reversedString = new StringBuilder(inputString);
        
        // Use the reverse() method to reverse the string
        reversedString.reverse();
        
        // Convert the StringBuilder back to a String
        String result = reversedString.toString();
        
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + result);
    }
}
