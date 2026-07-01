package slidingwindow;

public class MaxVowels {
    static void main() {
        System.out.println("abciiidef: " + maxVowels("abciiidef", 3));
        System.out.println("leetcode: " + maxVowels("leetcode", 3));
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int maxVowels(String s, int k) {
        int vowels = 0;
        int result;

        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) vowels++;
        }
        result = vowels;

        if(result == k) return k;

        for(int i = k; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) vowels++;
            if(isVowel((s.charAt(i - k)))) vowels--;
            result = Math.max(result, vowels);
            if(result == k) return k;
        }

        return result;
    }
}
