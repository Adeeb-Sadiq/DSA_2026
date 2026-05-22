package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PhoneLetterCombinations {
    static void main() {
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations("5"));
        System.out.println(letterCombinations("567"));
    }

    public static List<String> letterCombinations(String digits) {
        return pad("", digits);
    }

    private static List<String> pad(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        String str = letterToDigit(up.charAt(0));
        for(int i = 0; i < str.length(); i++) {
            list.addAll(pad(p + str.charAt(i), up.substring(1)));
        }
        return list;
    }

    private static String letterToDigit(char digit) {
        // can use hashmap too
        if(digit == '2') {
            return "abc";
        } else if(digit == '3') {
            return "def";
        } else if(digit == '4') {
            return "ghi";
        } else if(digit == '5') {
            return "jkl";
        } else if(digit == '6') {
            return "mno";
        } else if(digit == '7') {
            return "pqrs";
        } else if(digit == '8') {
            return "tuv";
        } else if(digit == '9') {
            return "wxyz";
        }
        return "";
    }
}
