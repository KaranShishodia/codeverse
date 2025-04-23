package Backtracking;

public class fourDirection {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
        print(0, 0, rows - 1, cols - 1, "", isVisited);
    }

    private static void print(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec || isVisited[sr][sc]) {
            return;
        }
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true; // Mark the cell as visited
        print(sr + 1, sc, er, ec, s + "D", isVisited); // Down
        print(sr - 1, sc, er, ec, s + "U", isVisited); // Up
        print(sr, sc + 1, er, ec, s + "R", isVisited); // Right
        print(sr, sc - 1, er, ec, s + "L", isVisited); // Left
        isVisited[sr][sc] = false;
    }
}
