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
        if (n < 3) {
            return n; // Base cases
        }
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    public static int fIterative(int n) {
        if (n < 3) {
            return n;
        }
        int[] results = new int[n + 1];
        results[0] = 0; // f(0)
        results[1] = 1; // f(1)
        results[2] = 2; // f(2)
    
        for (int i = 3; i <= n; i++) {
            results[i] = results[i - 1] + 2 * results[i - 2] + 3 * results[i - 3];
        }
        return results[n];
    }
}