package recursive;



public class Fibonacci {
    /**
     * Calculates the nth Fibonacci number using a recursive approach.
     * Time Complexity: O(2^n) - Exponential time complexity due to the recursive calls that grow exponentially.
     * Space Complexity: O(n) - Linear space complexity due to the depth of the recursion stack which grows linearly with n in the worst case.
     *
     * @param n the position of the Fibonacci number to calculate
     * @return the nth Fibonacci number
     */
    public static long fibonacciRecursive(int n) {
        // If n is 0 or 1, return n (base cases of the recursion)
        if (n <= 1) return n;
        // Recursively call fibonacciRecursive for the sum of the previous two numbers
        // This approach uses the definition of the Fibonacci sequence directly
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
