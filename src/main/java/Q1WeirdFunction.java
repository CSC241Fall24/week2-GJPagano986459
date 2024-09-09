// src/main/java/Q1WeirdFunction.java
// Greg Pagano
// 9/9/2024
// Dr. Chen
// Dr. Chen created a ”weird” function f(n), based on the following rules:
// 1). If n < 3, then f(n) = n
// 2). If n ≥ 3, then f(n) = f(n − 1) + 2f(n − 2) + 3f(n − 3).
// • Please create a recursive method to implement this function f(n)
// • Please create an iterative method to implement this function.


public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function
        if (n < 3) {
            return n;
        }
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        if (n < 3) {
            return n;
        }
        int a = 0, b = 1, c = 2;
        for (int i = 3; i <= n; i++) {
            int temp = a + 2 * b + 3 * c;
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }
}