package revise;

import java.util.ArrayList;
import java.util.List;

public class SubSetsCharacter {
    static void main() {
        subsets("", "abc");
        System.out.println();
        System.out.println(returnList(new ArrayList<>(), "abc"));
    }

    public static void subsets(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        subsets(p + up.charAt(0), up.substring(1));
        subsets(p, up.substring(1));
    }

    public static List<List<Character>> returnList(List<Character> p, String up) {
        if(up.isEmpty()) {
            List<List<Character>> result = new ArrayList<>();
            result.add(p);
            return result;
        }
        List<Character> include = new ArrayList<>(p);
        include.add(up.charAt(0));
        List<List<Character>> left = returnList(include, up.substring(1));
        List<List<Character>> right = returnList(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
