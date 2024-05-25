package iterative;



public class Fibonacci {
    public static long fibonacciIterative(int n) {
        // Handle the base cases where n is 0 or 1
        if (n <= 1) return n;

        // Initialize the first two Fibonacci numbers
        long a = 0, b = 1;

        // Iterate from 2 to n, updating the Fibonacci numbers
        for (int i = 2; i <= n; i++) {
            long temp = b; // Temporary variable to store the previous Fibonacci number
            b += a; // Update the current Fibonacci number
            a = temp; // Set the previous Fibonacci number
        }

        // Return the nth Fibonacci number
        return b;
    }
}

