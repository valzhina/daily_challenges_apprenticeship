public class hackerrank_TheBombermanGame {

    public boolean[][] bomberman(int n, boolean[][] board){

        int time = 0;
        int boardY = board[0].length;
        int boardX = board.length;

        int[][] boardState = new int[boardX][boardY];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j]){
                    boardState[i][j] = 2;
                }
            }
        }
        board = new boolean[boardX][boardY];
        //0 0 0
        //0 2 0
        //0 0 0

        //plenting algorithm
        for (time = 1; time < n; time++){
            if(time % 2 != 0){
                for (int i = 0; i < board.length; i++){
                    for (int j = 0; j < board[0].length; j++){
                        if (boardState[i][j] > 0) {
                            boardState[i][j]--;
                        }
                        else{
                            boardState[i][j] = 3;
                        }
                    }
                }
            }
            else{
                for (int i = 0; i < board.length; i++ ) {
                    for (int j = 0; j < board[0].length; j++) {
                        boardState[i][j]--;
                        if (boardState[i][j] == 0) {
                            if(i-1 >= 0)       board[i - 1][j] = true;
                            if(i+1 < boardX)   board[i + 1][j] = true;
                            if(j-1 >= 0)       board[i][j - 1] = true;
                            if(j+1 < boardY)   board[i][j + 1] = true;
                        }
                    }
                }
                for (int i = 0; i < board.length; i++ ){
                    for (int j = 0; j < board[0].length; j++) {
                        if(board[i][j]) {
                            boardState[i][j] = 0;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++ ) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = (boardState[i][j] != 0);
            }
        }
        return board;
    }
}
