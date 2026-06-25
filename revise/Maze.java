package revise;

public class Maze {
    static void main() {
        // true = path, false = blocked
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println("First maze");
        maze("", 0, 0, maze);
        System.out.println();
        boolean[][] maze2 = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println("Second maze");
        maze("", 0, 0, maze2);
    }

    public static void maze(String p, int row, int col, boolean[][] maze) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.print(p + "  ");
            return;
        }
        if(!maze[row][col]) return;
        if(row < maze.length - 1) maze(p + "D", row + 1, col, maze);
        if(col < maze[0].length - 1) maze(p + "R", row, col + 1, maze);
    }
}
