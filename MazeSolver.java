package Backtracking;

public class MazeSolver {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        int count = maze(1, 1, rows, cols);
        System.out.println("Total paths: " + count);
    }

    private static int maze(int sr, int sc, int er, int ec) {
        if (sr == er && sc == ec) {
            return 1;
        }
        if (sr > er || sc > ec) {
            return 0;
        }
        int downWays = maze(sr + 1, sc, er, ec);
        int rightWays = maze(sr, sc + 1, er, ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }
}
