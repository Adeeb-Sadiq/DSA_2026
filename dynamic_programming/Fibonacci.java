package dynamic_programming;

import java.util.Arrays;

public class Fibonacci {
    static void main() {
        System.out.println(fib(5));
        System.out.println(fib(10));
        System.out.println(fib(44));
    }

    public static int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return fib(n, dp);
    }

    private static int fib(int n, int[] dp) {
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}
