package subsets;

public class DiceRoll {
    static void main() {
        dice("", 2);
        System.out.println();
        dice("", 4);
        System.out.println();
        dice("", 6);
    }

    private static void dice(String p, int target) {
        if(target == 0) {
            System.out.print(p + " ");
            return;
        }
        for(int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }
}
