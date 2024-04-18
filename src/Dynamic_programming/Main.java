package Dynamic_programming;

public class Main {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacciDynamic(10));   // Використання методу динамічного програмування
        int n = 10; // можна змінити це значення для обчислення іншого числа Фібоначчі
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciDynamic(n));
    }

    public static long fibonacciDynamic(int n) {
        if (n <= 1) {
            return n;
        }
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
