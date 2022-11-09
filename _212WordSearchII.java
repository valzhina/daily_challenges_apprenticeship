import java.util.ArrayList;
import java.util.List;

public class _212WordSearchII {

    private class TrieNode {
        public TrieNode[] children = new TrieNode[26];

        public String word;
    }

    private TrieNode root;

    public List<String> findWords(char[][] board, String[] words) {
        //Building Trie
        for(String word: words) {
            TrieNode cursor = root;
            for(char c: word.toCharArray()) {
                if (cursor.children[(int)c - (int)'a'] == null) {
                    cursor.children[(int)c - (int)'a'] = new TrieNode();
                }
                cursor = cursor.children[(int)c - (int)'a'];
            }
            cursor.word = word;
        }

        List<String> output = new ArrayList<>();
        //Traversal and Search function

        //DFS on a trie and comparing our results
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                search(board,i, j, root, output);
            }
        }
        return output;
    }

    // A helper method
    public void search(char[][] board, int i, int j, TrieNode node, List<String> output){

        //check for illegal traversal
        if(board[i][j] == '*') {
            return;
        }
        //if we are outside of the board
        if(i < 0 || i == board.length || j < 0 || j == board[0].length){
            return;
        }

        char c = board[i][j];

        //look at self
        TrieNode child = node.children[(int)c - 'a'];

        if(child == null) return;

        //does it complete a word?
        if(child.word != null){
            //if, so, add word to output
            output.add(child.word);
            child.word = null;
        }

        //does it advance any of the words?
            // if so, search the neighbours
        board[i][j] = '*'; //if the node has been visited
        search(board, i+1, j, child, output);
        search(board, i-1, j, child, output);
        search(board, i,j+1, child, output);
        search(board, i,j-1, child, output);
        board[i][j] = c;
    }



    //Option 1 brute-forth solution
//    public List<String> findWords(char[][] board, String[] words) {
//        for (String word: words) {
//            for (int i = 0; i < board.length; i++){
//                for (int j = 0; j < board[0].length; j++) {
//                    int letterIndex = 0;
//                    int xCursor, yCursor;
//                    if (board[i][j] == word.charAt(letterIndex)) {
//                        xCursor = i;
//                        yCursor = j;
//                        while (true) {
//                            if (board[xCursor + 1][yCursor] == word.charAt(letterIndex + 1)) {
//                                xCursor = xCursor + 1;
//                                letterIndex++;
//                            }
//                            if (board[xCursor - 1][yCursor] == word.charAt(letterIndex + 1)) {
//                                xCursor = xCursor - 1;
//                                letterIndex++;
//
//                            }
//                            if (board[xCursor][yCursor + 1] == word.charAt(letterIndex + 1)) {
//                                yCursor;
//                            }
//                            if (board[xCursor][yCursor - 1] == word.charAt(letterIndex + 1)) {
//                            }
//
//                        }
//                    }
//                }
//            }
//        }
//    }
}
