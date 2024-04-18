package Recursive_method;


public class Main {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacciRecursive(10)); // Використання рекурсивного методу
        int n = 10; // Можна змінити це значення для обчислення іншого числа Фібоначчі
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciRecursive(n));
    }

    public static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
