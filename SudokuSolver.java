package CollegeIPE.Easy;

import java.util.Scanner;

class Mains {
    public static void main(String[] args) {
        boolean exit = true;

        while(exit) {

            System.out.println();
            System.out.println("Enter 1 to Solve the Sudoku!");
            System.out.println("Enter 2 to Exit the Sudoku Solver!");
            System.out.println("A rule : The number you enter must be between 0 to 9");
            System.out.println("Else it'll be treated as 0");
//            System.out.println("2. Exit");

            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();



            switch(userInput) {
                case 1 : solveTheSudoku();
                    break;

                case 2: exit = false;
                    break;
            }

        }


    }

    static {
        System.out.println("Topics Covered: ");
        System.out.println("1. Switch statement");
        System.out.println("2. Backtracking Algorithm");
        System.out.println("3. Recursion");
        System.out.println("4. 2D Arrays");
        System.out.println("5. Nested Loops");
        System.out.println("6. Input/Output");
        System.out.println("7. Static Methods");
        System.out.println("8. Static Blocks");
        System.out.println("9. If-Else statements");
        System.out.println("10. Mathematical Operations");
    }

    public static void solveTheSudoku() {

        Scanner sc = new Scanner(System.in);

        int[][] board = new int[9][9];

        System.out.println();
        System.out.println("Enter the sudoku: ");
        for(int i = 0; i<board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        if (solve(board)) {
            System.out.println();
            System.out.println("Sudoku solved Successfully");
            System.out.println();
            display(board);
        }
        else {
            System.out.println();
            System.out.println("Invalid Sudoku");
        }


    }
    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        for(int i = 0; i<n ; i++) {
            for(int j = 0; j<n; j++) {//Here we're searching for 0
                if (board[i][j] == 0) {
                    row = i; // Here by doing this the position is being transferred to
                    col = j; // to the variables "row" and "col"
                    emptyLeft=false;
                    break; // This one is written to break the J loop
                }
            }
            //If found some empty element in the row then break
            if (emptyLeft == false) { // This one is added because
                break; // for the previous break the j loop was broken now the i one would break
            }
        }

        if (emptyLeft == true) {
            return true;
            //Sudoku is solved
        }
        //backtrack
        for(int number = 1; number<=9; number++) { // trying to check whether the number can fit inside the board.
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    //found the ans
                    return true;
                }else{ // backTrack
                    board[row][col] = 0; // Whatever changes you made undo that changes.
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board,int row,int col,int num) {
        // Checking the row
        for(int i = 0; i< board.length; i++) {
            // check if the number is in the Row
            if (board[row][i] == num) { // Now the interesting thing over here is that it is not checking till the
                return false; // the targeted index but checking for all elements of the row.
            }
        }
        //check the column :
        for(int[] nums : board) {
            // Check if the num is in the col
            if (nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;

        for(int r = rowStart; r<rowStart+sqrt; r++) {
            for(int c = colStart; c<colStart+sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
