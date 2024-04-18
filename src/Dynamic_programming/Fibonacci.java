package Dynamic_programming;

public class Fibonacci {
    public static long fibonacciDynamic(int n) {
        if (n <= 1) {
            return n;
        }
        long[] fib = new long[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}

