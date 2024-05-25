package iterative;



public class Main {
    public static void main(String[] args) {
        // Create an instance of the Fibonacci class to access its methods
        Fibonacci fib = new Fibonacci();
        // and print the 10th Fibonacci number using the iterative method
        System.out.println(fib.fibonacciIterative(10));
        int n = 10;  // You can change this value to compute a different Fibonacci number
        // This output will show the Fibonacci number at the specified position
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciIterative(n));
    }



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