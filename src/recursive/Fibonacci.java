package recursive;



public class Fibonacci {
    public static long fibonacciRecursive(int n) {
        // If n is 0 or 1, return n (base cases of the recursion)
        if (n <= 1) return n;

        // Recursively call fibonacciRecursive for the sum of the previous two numbers
        // This approach uses the definition of the Fibonacci sequence directly
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}