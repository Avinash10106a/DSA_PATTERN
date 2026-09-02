import java.util.HashSet;

public class Valid_Sudoku_36 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board){

        int N = board.length;
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0;i<N;i++){
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                char ch = board[i][j];

                if(ch=='.'){
                    continue;
                }

                //Check row
                if(row[i].contains(ch)){
                    return false;
                }
                row[i].add(ch);

                if(col[j].contains(ch)){
                    return false;
                }

                col[j].add(ch);

                int idx = (i/3)*3 + j/3;
                if(boxes[idx].contains(ch)){
                    return false;
                }

                boxes[idx].add(ch);
            }
        }

        return true;
    }
}
