package recursive;



public class Main {
    public static void main(String[] args) {
        // Create an instance of the Fibonacci class to access its methods
        // Assuming an instance method 'fibonacciRecursive' exists in the Fibonacci class
        Fibonacci fib = new Fibonacci();

        // Print the 10th Fibonacci number using the recursive method
        // Note: Directly using an instance method here suggests the method should be in the Fibonacci class;
        // otherwise, it needs to be static if used without an instance.
        System.out.println("10th Fibonacci number: " + fib.fibonacciRecursive(10));

        int n = 10; // You can change this value to compute a different Fibonacci number
        // This output will show how the method calculates the Fibonacci number at position n
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciRecursive(n));
    }

    /**
     * Calculates the nth Fibonacci number using a recursive method.
     * Time Complexity: O(2^n) - Exponential time complexity due to the nature of the recursive calls,
     * where each call results in two more calls until reaching the base case.
     * Space Complexity: O(n) - The space complexity is linear relative to the input size 'n',
     * due to the maximum depth of the recursion stack.
     *
     * @param n The position of the Fibonacci number to calculate
     * @return The nth Fibonacci number
     */
    public static long fibonacciRecursive(int n) {
        // If n is 0 or 1, return n (base cases of the recursion)
        if (n <= 1) return n;

        // Recursively call fibonacciRecursive for the sum of the previous two numbers
        // This approach uses the definition of the Fibonacci sequence directly
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}

