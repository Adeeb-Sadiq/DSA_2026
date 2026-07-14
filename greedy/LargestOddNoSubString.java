package greedy;

public class LargestOddNoSubString {
    static void main() {
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("526781"));
        System.out.println(largestOddNumber("52678"));
    }

    public static String largestOddNumber(String num) {
        char[] arr = num.toCharArray();
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] % 2 == 1) return num.substring(0, i + 1);
        }
        return "";
    }
}
