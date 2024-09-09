// src/main/java/Q4ReverseString.java
/*
 * Reverse String Using Recursion. Given the following class structure:
public class Q4ReverseString {
public static void main(String[] args) {
System.out.println(reverse("Hello"));
}
public static String reverse(String s) {
// TODO: Implement the recursive function to reverse the string
}
}
 */
public class Q4ReverseString {

    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string
        if (s == null || s.length() == 0) {
            return s; // Return as is
        }
        // Call the recursive helper function
        return reverseHelper(s, 0);
    }

    private static String reverseHelper(String s, int index) {
        // Base case: when the index reaches the end of the string
        if (index == s.length() - 1) {
            return String.valueOf(s.charAt(index));
        }
        // Recursive call: reverse the rest of the string and append the current character
        return reverseHelper(s, index + 1) + s.charAt(index);
        // Hint: The base case is when the string length is 1
        // Hint: Use substring to get the rest of the string
        // Hint: Use charAt to get the first character
    }
}