import java.util.ArrayList;
import java.util.Scanner;

public class magicsquare {

    private static int[] xCol, yCol, boardVal;
    private static int[][] board;
    private static ArrayList distinct;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        board = new int[size][size];

        // read user input into the board array
        for (int i = 0; i < size;i++){
            for (int j = 0; j < size; j++){
                board[i][j] = scan.nextInt();
            }
        }

        checkSquare();
    }

    private static void checkSquare(){
        xCol = new int[board.length];
        yCol = new int[board.length];

        // calculate row and column totals
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                xCol[i] += board[i][j];
                yCol[i] += board[j][i];
            }
        }
        if (isMagic()){
            System.out.println("MAGIC");
        } else {
            notMagic();
        }
    }

    private static boolean isMagic(){

        boardVal = combineArray();

        int first = boardVal[0];

        // check if each value in the array is the same
        for (int i = 1; i < boardVal.length; i++) {
            if (first != boardVal[i]) return false;
        }

        return true;
    }

    private static void notMagic(){

       distinct = new ArrayList<>();

       for (int i = 0; i < boardVal.length; i++){
           if (!distinct.contains(boardVal[i])){
               distinct.add(boardVal[i]);
           }
       }

       // more than 2 distinct values results in a NOT MAGIC SQUARE
       if (distinct.size() - 1 == 1){
           System.out.println("ALMOST MAGIC");
           System.out.println(isAlmostSquare());
       } else {
           System.out.println("NOT MAGIC");
       }
    }

    private static int getIndex(int[] arr, int t){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == t){
                return i;
            }
        }
        return -1;
    }

    private static String isAlmostSquare(){

        int distCount1 = 0;
        int distCount2 = 0;

        // calculate pos of odd value
        int distVal1 = (int) distinct.get(0);
        int distVal2 = (int) distinct.get(1);

        for (int i = 0; i < boardVal.length; i++){
            if (boardVal[i] == distVal1){
                distCount1++;
            } else if (boardVal[i] == distVal2){
                distCount2++;
            }
        }

        int almostVal = distCount1 > distCount2 ? distVal2 : distVal1, desiredVal = distCount1 < distCount2 ? distVal2 : distVal1;

        int r = getIndex(xCol, almostVal);
        int c = getIndex(yCol, almostVal);
        int v = desiredVal - (almostVal - board[r][c]);

        return (r + 1) + " " + (c + 1) + " " + v;
    }

    private static int[] combineArray(){
        int[] combinedArr = new int[xCol.length * 2];

        System.arraycopy(xCol, 0, combinedArr, 0, xCol.length);
        System.arraycopy(yCol, 0, combinedArr, xCol.length, yCol.length);

        return combinedArr;
    }
}
