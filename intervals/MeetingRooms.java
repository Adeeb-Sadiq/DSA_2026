package intervals;

import java.util.Arrays;

public class MeetingRooms {

    private static boolean canAttend(int[][] meetings) {
        if(meetings.length <= 1) return true;

        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        for(int i = 1; i < meetings.length; i++) {
            if(meetings[i][0] < meetings[i - 1][1]) {
                return false;
            }
        }
        return true;
    }

    static void main() {
        int[][] meetings = {{1, 4}, {10, 15}, {7, 10}};
        System.out.println(canAttend(meetings));
    }
}
