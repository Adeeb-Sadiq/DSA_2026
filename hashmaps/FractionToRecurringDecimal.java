package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {
    static void main() {
        System.out.println(fractionToDecimal(4, 333));
        System.out.println(fractionToDecimal(22, 3));
    }

    private static String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";

        StringBuilder res = new StringBuilder();
        if((numerator < 0) ^ (denominator < 0)) res.append("-");

        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);

        res.append(n / d);
        long rem = n % d;

        if(rem == 0) return res.toString();
        res.append(".");

        Map<Long, Integer> map = new HashMap<>();
        while(rem != 0) {
            if(map.containsKey(rem)) {
                int idx = map.get(rem);
                res.insert(idx, "(");
                res.append(")");
                break;
            }
            map.put(rem, res.length());
            rem *= 10;
            res.append(rem / d);
            rem %= d;
        }

        return res.toString();
    }
}
