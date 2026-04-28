package slidingwindow;

import java.util.HashSet;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int longest = 0;

        for(int right = 0; right < s.length(); right++) {
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            longest = Math.max(right - left + 1, longest);
        }

        return longest;
    }
    static void main() {
        String str = "abcdefffghi";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
