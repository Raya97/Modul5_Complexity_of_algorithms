package recursive;



public class Main {
    public static void main(String[] args) {
        // Create an instance of the Fibonacci class to access its methods
        Fibonacci fib = new Fibonacci();
        // and print the 10th Fibonacci number using the recursive method
        System.out.println(fib.fibonacciRecursive(10));
        int n = 10; // You can change this value to compute a different Fibonacci number
        // This output will show how the method calculates the Fibonacci number at position n
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciRecursive(n));
    }

    public static long fibonacciRecursive(int n) {
        // If n is 0 or 1, return n (base cases of the recursion)
        if (n <= 1) return n;

        // Recursively call fibonacciRecursive for the sum of the previous two numbers
        // This approach uses the definition of the Fibonacci sequence directly
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
