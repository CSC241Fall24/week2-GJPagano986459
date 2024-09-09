/*
 * Print Array Using Recursion (2). Given the following class structure:
public class Q3PrintArrayBackwards {
private static int[] array = {1, 2, 3, 4, 5, 6, 7};
public static void main(String[] args) {
printRecursion(array.length);
}
private static void printRecursion(int i) {
// TODO: Implement the recursive method to print array elements backwards
}
}
Please implement the printRecursion() method to print the array elements in reverse
order. The output should be:
7
6
5
4
3
2
1
You must use recursion to solve this problem.
*/
public class Q3PrintArrayBackwards {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length);
    }

    private static void printRecursion(int i) {
        if (i <= 0) {
            return;
        }
        System.out.println(array[i - 1]);
        printRecursion(i - 1);
        // TODO: Implement the recursive method to print array elements backwards
        // Hint: The base case is when i <= 0
        // Hint: Print the element after the recursive call
    }
}