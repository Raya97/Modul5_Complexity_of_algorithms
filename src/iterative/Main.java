package iterative;



public class Main {
    public static void main(String[] args) {
        // Create an instance of the Fibonacci class to access its methods
        Fibonacci fib = new Fibonacci();
        // Print the 10th Fibonacci number using the iterative method
        // Time Complexity: O(n), Space Complexity: O(1)
        System.out.println("10th Fibonacci number (from instance): " + fib.fibonacciIterative(10));

        int n = 10;  // You can change this value to compute a different Fibonacci number
        // Print the nth Fibonacci number using the static method defined below
        // This demonstrates how the method can be called with different values of 'n'
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciIterative(n));
    }

    /**
     * Calculates the nth Fibonacci number using an iterative approach.
     * Time Complexity: O(n) - Linear time complexity as it iterates from 2 to n.
     * Space Complexity: O(1) - Constant space complexity as it only stores two numbers regardless of input size.
     *
     * @param n The position of the Fibonacci number to calculate
     * @return The nth Fibonacci number
     */
    public static long fibonacciIterative(int n) {
        if (n <= 1) return n;  // Handle the base cases where n is 0 or 1

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
