package subsets;

public class Permutation {
    static void main() {
        permutations("", "abc");
        System.out.println();
        permutations("", "abcd");
    }

    public static void permutations(String r, String s) {
        if(s.isEmpty()) {
            System.out.print(r + " ");
            return;
        }
        char ch = s.charAt(0);
        for(int i = 0; i <= r.length(); i++) {
            String a = r.substring(0, i);
            String b = r.substring(i, r.length());
            permutations(a + ch + b, s.substring(1));
        }
    }
}
