package dynamic.programming;



public class Fibonacci {
    /**
     * Calculates the nth Fibonacci number using the dynamic programming approach (bottom-up approach).
     * Time Complexity: O(n) - Linear time complexity as each number from 2 to n is calculated exactly once.
     * Space Complexity: O(n) - Linear space complexity as it uses an array to store all Fibonacci numbers up to n.
     *
     * @param n the position of the Fibonacci number to calculate
     * @return the nth Fibonacci number
     */
    public static long fibonacciDynamic(int n) {
        if (n <= 1) return n;
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}


