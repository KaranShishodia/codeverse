package Backtracking;

public class ratInADeadMaze {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {
                { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 1 }
        };
        boolean[][] isVisited = new boolean[rows][cols];
        print(0, 0, rows - 1, cols - 1, "", maze, isVisited);
    }

    private static void print(int sr, int sc, int er, int ec, String s, int[][] maze, boolean[][] isVisited) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec || isVisited[sr][sc] || maze[sr][sc] == 0) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0) {
            return; // If the cell is a dead end, return
        }
        if (isVisited[sr][sc] == true) {
            return; // If the cell is already visited, return
        }
        isVisited[sr][sc] = true; // Mark the cell as visited
        print(sr + 1, sc, er, ec, s + "D", maze, isVisited); // Down
        print(sr - 1, sc, er, ec, s + "U", maze, isVisited); // Up
        print(sr, sc + 1, er, ec, s + "R", maze, isVisited); // Right
        print(sr, sc - 1, er, ec, s + "L", maze, isVisited); // Left
        isVisited[sr][sc] = false;
    }

}
