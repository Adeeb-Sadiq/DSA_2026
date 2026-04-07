package fast_and_slow_pointers;

public class HappyNumber {
    static void main() {
        System.out.println("19: " + isHappy(19));
        System.out.println("10: " + isHappy(10));
        System.out.println("20: " + isHappy(20));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(true) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
            if(slow == fast) {
                break;
            }
        }

        return slow == 1;
    }

    public static int getNext(int n) {
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }
        return sum;
    }
}
