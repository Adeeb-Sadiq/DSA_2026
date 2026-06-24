package revise;

public class Permutations {
    static void main() {
        String s = "abcd";
        permutations("", s);
    }

    static void permutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++) {
            String a = p.substring(0, i);
            String b = p.substring(i, p.length());
            permutations(a + ch + b, up.substring(1));
        }
    }
}
