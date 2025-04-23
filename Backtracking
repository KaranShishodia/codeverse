package Backtracking;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solveNQueens(board, 0);
    }

    private static void solveNQueens(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            printBoard(board);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                solveNQueens(board, row + 1);
                board[row][j] = '.'; // backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Check row
        int n = board.length;
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // check column
        for (int i = 0; i < n; i++) { // corrected loop variable
            if (board[i][col] == 'Q') { // corrected index
                return false;
            }
        }
        int i = row;
        int j = col;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--; // corrected indentation
            j++;
        }
        i = row;
        j = col;
        while (i < n && j < n) {
            if (board[i][j] == 'Q')
                return false; // added return statement
            i++;
            j++;
        }
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (board[i][j] == 'Q')
                return false; // added return statement
            i++;
            j--;
        }
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false; // added return statement
            i--;
            j--;
        }
        return true;
    }

    private static void printBoard(char[][] board) {
        System.out.println("Solution:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
