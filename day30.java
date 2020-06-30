class Solution {
   
 
  class TrieNode {
        TrieNode[] children;
        boolean isWord;
        
        TrieNode() {
            children = new TrieNode[26];
        }
    }
    
    private TrieNode root = new TrieNode();
    private int[][] directions = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    
    public List<String> findWords(char[][] board, String[] words) {
        buildTrie(words);
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                findWords(board, i, j, "" + board[i][j], root.children[board[i][j] - 'a'], list);
            }
        }
        return list;
    }
    
    private void buildTrie(String[] words) {
        for (String word : words) {
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                current = current.children[index];
            }
            current.isWord = true;
        }
    }
    
    private void findWords(char[][] board, int row, int col, String current, TrieNode node, List<String> list) {
        if (node == null) {
            return;
        }
        if (node.isWord && !list.contains(current)) {
            list.add(current);
        }
        
        char temp = board[row][col];
        board[row][col] = ' ';
        for (int i = 0; i < 4; i++) {
            int nextRow = row + directions[i][0];
            int nextCol = col + directions[i][1];
            if (nextRow >= 0 && nextRow < board.length && nextCol >= 0 && nextCol < board[0].length) {
                char c = board[nextRow][nextCol];
                if (c == ' ') {
                    continue;
                }
                findWords(board, nextRow, nextCol, current + c, node.children[c - 'a'], list);
            }
        }
        board[row][col] = temp;
    }
}
