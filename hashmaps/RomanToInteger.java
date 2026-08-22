package hashmaps;

import java.util.HashMap;

public class RomanToInteger {

    static HashMap<String, Integer> values = new HashMap<>();

    static {
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);
        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("DCCXII"));
        System.out.println(romanToInt("MCDIX"));
        System.out.println(romanToInt("DXC"));
    }

    public static int romanToInt(String s) {
        int sum = 0, i = 0;
        while(i < s.length()) {
            if(i < s.length() - 1) {
                String value = s.substring(i, i + 2);
                if(values.containsKey(value)) {
                    sum += values.get(value);
                    i += 2;
                    continue;
                }
            }
            String value = s.substring(i , i + 1);
            sum += values.get(value);
            i++;
        }
        return sum;
    }
}
