public class Nqueens {

    static boolean isSafe(String[][] board , int col ,int row){
        //vertical up
        for (int i = row-1; i >=0 ; i--) {
            if((board[i][col]).equals("Q ")){
                return false;
            }
        }

        //left diagonal
        for (int i = row-1 , j = col-1; i >=0 && j >= 0 ; i--,j--) {
            if((board[i][j]).equals("Q ")){
                return false;
            }
        }

//        right diagonal
        for (int i = row-1 , j = col+1; i >=0 && j<board.length ; i--,j++) {
            if((board[i][j]).equals("Q ")){
                return false;
            }
        }

        return true;

    }
    static void printBoard(String[][] cBoard){
        for (int i = 0; i < cBoard.length; i++) {
            for (int j = 0; j < cBoard[0].length; j++) {
//                        cBoard[i][j]="x ";
                System.out.print(cBoard[i][j]);
            }
            System.out.println();
        }
    }
    static void nqueen(String[][] cBoard , int row){

        if(row == cBoard.length){
            System.out.println("---------------------");
              printBoard(cBoard);
                return;
        }

        for (int i = 0; i < cBoard.length; i++) {
            if (isSafe(cBoard,i,row)){
                cBoard[row][i] = "Q ";
                nqueen(cBoard,row+1);
                cBoard[row][i] = "x ";
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        String[][] chessBoard = new String[n][n];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {

                chessBoard[i][j]="x ";
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
            nqueen(chessBoard,0);

    }
}

