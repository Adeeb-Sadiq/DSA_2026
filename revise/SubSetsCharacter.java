package revise;


public class SubSetsCharacter {
    static void main() {
        subsets("", "abc");
    }

    public static void subsets(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        subsets(p + up.charAt(0), up.substring(1));
        subsets(p, up.substring(1));
    }
}
