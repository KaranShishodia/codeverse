package Backtracking;

public class RatMazeOptimised {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {
                { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 1 }
        };
        print(0, 0, rows - 1, cols - 1, "", maze);
    }

    private static void print(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec || maze[sr][sc] == 0) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0) {
            return; // If the cell is a dead end, return
        }
        if (maze[sr][sc] == -1) {
            return; // If the cell is already visited, return
        }
        maze[sr][sc] = -1; // Mark the cell as visited
        print(sr + 1, sc, er, ec, s + "D", maze); // Down
        print(sr - 1, sc, er, ec, s + "U", maze); // Up
        print(sr, sc + 1, er, ec, s + "R", maze); // Right
        print(sr, sc - 1, er, ec, s + "L", maze); // Left
        maze[sr][sc] = 1; // Unmark the cell as visited
    }
}
