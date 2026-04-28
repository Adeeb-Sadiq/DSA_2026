package subsets;

public class StringSubSet {
    static void main() {
        subset("", "abc");
    }

    static void subset(String r, String s) {
        if(s.isEmpty()) {
            System.out.print(r + "  ");
            return;
        }
        subset(r + s.charAt(0), s.substring(1));
        subset(r, s.substring(1));
    }
}
