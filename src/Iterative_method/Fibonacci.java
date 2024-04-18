package Iterative_method;

public class Fibonacci {
    public static long fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        long prev = 0, next = 1;
        for (int i = 2; i <= n; i++) {
            long sum = prev + next;
            prev = next;
            next = sum;
        }
        return next;
    }
}

