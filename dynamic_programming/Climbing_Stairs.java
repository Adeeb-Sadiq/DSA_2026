package dynamic_programming;

public class Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        if(n <= 2) return n;
        int p2 = 1, p1 = 2, curr;
        for(int i = 3; i <= n; i++) {
            curr = p2 + p1;
            p2 = p1;
            p1 = curr;
        }
        return p1;
    }
}
