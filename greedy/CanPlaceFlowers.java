package greedy;

public class CanPlaceFlowers {
    static void main() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowerbed, 1));
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                boolean left = i == 0 || flowerbed[i - 1] == 0;
                boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;

                if(left && right){
                    flowerbed[i] = 1;
                    count++;
                    if(count >= n) return true;
                }
            }
        }

        return count >= n;
    }
}
