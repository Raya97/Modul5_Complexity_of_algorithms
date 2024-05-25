package dynamic.programming;



public class Main {
    public static void main(String[] args) {
        // Create an instance of the Fibonacci class
        Fibonacci fib = new Fibonacci();

        // Print the 10th Fibonacci number using the dynamic programming approach
        // This line demonstrates using the method from an instance which is not shown in this snippet.
        System.out.println("10th Fibonacci number (from instance): " + fib.fibonacciDynamic(10));

        int n = 10; // You can change this value to compute a different Fibonacci number

        // Print the nth Fibonacci number using the static method defined below
        // This demonstrates how the method can be called with different values of 'n'
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciDynamic(n));
    }

    /**
     * Calculates the nth Fibonacci number using dynamic programming (bottom-up approach).
     * Time Complexity: O(n) - Linear time complexity as it calculates each Fibonacci number from 2 to n exactly once.
     * Space Complexity: O(n) - Linear space complexity as it uses an array to store all Fibonacci numbers up to n.
     *
     * @param n The position of the Fibonacci number to calculate
     * @return The nth Fibonacci number
     */
    public static long fibonacciDynamic(int n) {
        if (n <= 1) return n;  // Handle the base cases where n is 0 or 1

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
