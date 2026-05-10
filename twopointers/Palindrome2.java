package twopointers;

public class Palindrome2 {
    // can delete one character at most for getting valid palindrome
    public static boolean validPalindrome(String s) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(str[i] == str[j]) {
                i++; j--;
            } else {
                return check(str, i + 1, j) || check (str, i , j - 1);
            }
        }
        return true;
    }

    static boolean check(char[] str, int i, int j) {
        while(i < j) {
            if(str[i] != str[j]) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    static void main() {
        System.out.println(validPalindrome("abbca"));
        System.out.println(validPalindrome("deeee"));
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abadd"));
        System.out.println(validPalindrome("abdaabad"));
    }
}
