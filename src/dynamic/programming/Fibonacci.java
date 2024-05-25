package dynamic.programming;



public class Fibonacci {
    public static long fibonacciDynamic(int n) {
        // Handle the base cases where n is 0 or 1
        if (n <= 1) return n;

        // Create an array to store the Fibonacci numbers up to n
        long[] fib = new long[n + 1];
        fib[0] = 0; // The first Fibonacci number is 0
        fib[1] = 1; // The second Fibonacci number is 1

        // Calculate each Fibonacci number from 2 to n and store it
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; // Each number is the sum of the two preceding ones
        }

        // Return the nth Fibonacci number
        return fib[n];
    }
}

