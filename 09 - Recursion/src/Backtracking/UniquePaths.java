package Backtracking;

import java.util.ArrayList;

public class UniquePaths {
    public static void main(String[] args) {
//        System.out.println(countPaths(3, 7));
//        printPaths("", 3, 3);
//        System.out.println(storePaths("", 3, 3));
//        System.out.println(storePathsDiagonal("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathWithObstacles("", board, 0, 0);
    }

    public static int countPaths(int row, int col) {
        if (row == 1 || col == 1){
            return 1;
        }

        int left = countPaths(row-1, col);
        int right = countPaths(row, col-1);
        return left + right;
    }

    public static void printPaths(String ans, int row, int col) {
        if (row == 1 && col == 1){
            System.out.print(ans + " ");
            return;
        }

        if (row > 1){
            printPaths(ans + 'D', row-1, col);
        }
        if (col > 1){
            printPaths(ans + 'R', row, col-1);
        }
    }

    public static ArrayList<String> storePaths(String ans, int row, int col) {
        if (row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (row > 1){
            list.addAll(storePaths(ans + 'D', row-1, col));
        }
        if (col > 1){
            list.addAll(storePaths(ans + 'R', row, col-1));
        }

        return list;
    }

    public static ArrayList<String> storePathsDiagonal(String ans, int row, int col) {
        if (row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1 && col > 1) {
            list.addAll(storePathsDiagonal(ans + 'D', row - 1, col - 1));
        }

        if (row > 1){
            list.addAll(storePathsDiagonal(ans + 'V', row-1, col));
        }
        if (col > 1){
            list.addAll(storePathsDiagonal(ans + 'H', row, col-1));
        }

        return list;
    }

    public static void pathWithObstacles(String ans, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.print(ans + " ");
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        if (row < maze.length - 1){
            pathWithObstacles(ans + 'D', maze,row+1, col);
        }
        if (col < maze[0].length - 1){
            pathWithObstacles(ans + 'R', maze, row, col+1);
        }
    }
}
