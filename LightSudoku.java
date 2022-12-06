import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LightSudoku {

        public static void main(String[] args) {
//            int[][] board = {
//                    {5,3,4,6,7,8,9,1,2},
//                    {6,7,2,1,9,5,3,4,8},
//                    {1,9,8,3,4,2,5,6,7},
//                    {8,5,9,7,6,1,4,2,3},
//                    {4,2,6,8,5,3,7,9,1},
//                    {7,1,3,9,2,4,8,5,6},
//                    {9,6,1,5,3,7,2,8,4},
//                    {2,8,7,4,1,9,6,3,5},
//                    {3,4,5,2,8,6,1,7,9}
//            };//-->True

            int[][] board = {
                    {5,3,4,6,7,8,9,1,0},
                    {6,7,2,1,9,5,3,0,8},
                    {1,9,8,3,4,2,0,6,7},
                    {8,5,9,7,6,6,4,2,3},
                    {4,2,6,8,8,3,7,9,1},
                    {7,1,3,3,2,4,8,5,6},
                    {9,6,6,5,3,7,2,8,4},
                    {2,2,7,4,1,9,6,3,5},
                    {0,4,5,2,8,6,1,7,9}
            };//-->False
            System.out.println(sudoku(board));
        }

        public static boolean sudoku(int[][] board){

            for(int i =0; i < 9; i++){
                Set<Integer> check = new HashSet<Integer>();
                for(int j =0; j < 9; j++){
                    if(check.contains(board[i][j])){
                        return false;
                    }
                    check.add(board[i][j]);

                }
//                System.out.println(check);
            }
            for(int j =0; j < 9; j++){
                Set<Integer> check = new HashSet<Integer>();
                for(int i =0; i < 9; i++){
                    if(check.contains(board[i][j])){
                        return false;
                    }
                    check.add(board[i][j]);
                }
            }
            for(int x = 0; x < 7; x += 3){
                for(int y = 0; y < 7; y += 3){
                    Set<Integer> check = new HashSet<Integer>();

                    for(int i = 0; i < 3; i++){
                        for(int j=0; j < 3 ; j++){
                            if(check.contains(board[i+x][j+y])){
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
}

