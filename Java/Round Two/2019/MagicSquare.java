import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] board = new int[size][size];

        for (int i = 0; i < size;i++){
            for (int j = 0; j < size; j++){
                board[i][j] = scan.nextInt();
            }
        }

        int[] rowCount = new int[size];
        int[] colCount = new int[size];

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                rowCount[i] += board[i][j];
            }
        }

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                colCount[i] += board[j][i];
            }
        }

        if (Arrays.equals(rowCount, colCount)){
            System.out.println("MAGIC");
        } else {
            System.out.println("NOT MAGIC");
        }
    }
}
