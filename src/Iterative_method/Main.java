package Iterative_method;



public class Main {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacciIterative(10)); // Використання ітераційного методу
        int n = 10; // можна змінити це значення для обчислення іншого числа Фібоначчі
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciIterative(n));
    }



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