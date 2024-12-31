import java.util.*;

public class backtrack {

    public static void backarr(int arr[], int i) {

        if (i >= arr.length) {
            return;
        }

        // adding no in the array
        arr[i] = i + 1;

        // Recursion
        backarr(arr, i + 1);
        arr[i] = arr[i] - 2;

    }

    public static void subsets(String str, String ans, int i) {
        // Base Case
        if (i >= str.length()) {
            System.out.println(ans);
            return;
        }
        // Recursion
        // Yes Choice
        subsets(str, ans + str.charAt(i), i + 1);
        // No Choice
        subsets(str, ans, i + 1);
    }

    public static void permutations(String str, String ans) {
        // Base
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permutations(newstr, ans + curr);
        }
    }

    public static void queens(char board[][], int row) {
        int count = 0;

        // base case
        if (row == board.length) {
            printboard(board);
            System.out.println("------- Chess Board -------");
            return;
        }

        // recursion
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j) == true) {
                board[row][j] = 'Q';
                queens(board, row + 1);
                board[row][j] = '.';
            }
        }
    }

    public static void printboard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean issafe(char board[][], int row, int col) {
        // upside
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        // backarr(arr, 0);
        // for(int i=0; i <arr.length; i++){
        // System.out.print(arr[i] + " ");
        //

        // subsets("abc", "", 0);

        // permutations("abc", "");

        int n = 8;
        // creation of board
        char board[][] = new char[n][n];

        // making an empty board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        queens(board, 0);
    }
}
