package dynamic_programming;

import java.util.Arrays;

public class Fibonacci {
    static void main() {
        int n = 45;
        System.out.println(fib(n));
        System.out.println(fibonacci_1(n));
        System.out.println(fibonacci(n));
    }

    // Memoization
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

    // Tabulation
    public static int fibonacci_1(int n) {
        if(n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    // space optimization
    public static int fibonacci(int n) {
        if(n <= 1) return n;
        int prev2 = 0;
        int prev1 = 1;

        for(int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
