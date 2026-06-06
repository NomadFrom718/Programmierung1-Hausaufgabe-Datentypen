import java.util.Scanner;

public class Schach {
    public static void main(String[] args) {



        char board[][] = createBoard();

        showBoard(createBoard());

        showBoard(board);

        Scanner scanner=new Scanner(System.in);

        showBoard(board);

        System.out.println("Select a piece by entering the column letter and row number");
        char fromCol=scanner.next().charAt(0);
        int fromRow=scanner.nextInt();
        System.out.println("Place the piece at the desired position by entering the column letter and row number");
        char toCol=scanner.next().charAt(0);
        int toRow=scanner.nextInt();
        move(board, fromCol, fromRow, toCol, toRow);
        showBoard(board);

    }

    public static char[][] createBoard() {


        char[] theFirstRow = {'♜', '♞', '♝', '♛', '♚', '♝', '♞', '♜' };
        char[] theSecondRow = {'♟', '♟', '♟', '♟', '♟', '♟', '♟', '♟' };
        char[] theThirdRow = {'0', '0', '0', '0', '0', '0', '0', '0' };
        char[] theFourthRow = {'0', '0', '0', '0', '0', '0', '0', '0' };
        char[] theFourthRow2 = {'0', '0', '0', '0', '0', '0', '0', '0' };
        char[] theThirdRow2 = {'0', '0', '0', '0', '0', '0', '0', '0' };
        char[] theSecondRow2 = {'♙', '♙', '♙', '♙', '♙', '♙', '♙', '♙' };
        char[] theFirstRow2 = {'♖', '♘', '♗', '♕', '♔', '♗', '♘', '♖' };




        return new char[][] {theFirstRow, theSecondRow, theThirdRow, theFourthRow, theFourthRow2, theThirdRow2, theSecondRow2, theFirstRow2};
    }


    public static void showBoard(char[][] board){

        System.out.println("  a b c d e f g h");
        int rowNum=8;

        for (char [] row:board) {
            System.out.print(rowNum+" ");
            rowNum--;
            for (char c : row) {
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }

    public static void move(char[][] board, char fromCol, int fromRow, char toCol, int toRow){

        int indexFromCol=fromCol-'a';

        int indexToRow = toRow;
        int indexToCol = toCol - 'a';
        char p = 0;
        if ( board[8 - fromRow][indexFromCol]!=0) {
            p = board[8 - fromRow][indexFromCol];
            board[8 - fromRow][indexFromCol] = '0';


            board[8 - indexToRow][indexToCol] = p;



        }

    }
}
