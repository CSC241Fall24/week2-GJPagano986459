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
        if (s.length() == 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
        // Hint: The base case is when the string length is 1
        // Hint: Use substring to get the rest of the string
        // Hint: Use charAt to get the first character
    }
}