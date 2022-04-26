public class Fibo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Fibonacci(n));
    }

    public static int Fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return (Fibonacci(n - 1) + Fibonacci(n - 2));
    }
}