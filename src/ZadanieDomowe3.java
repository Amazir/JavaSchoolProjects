import java.util.Random;
import java.util.Scanner;

public class ZadanieDomowe3 {
    public static Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    private static void printArray(boolean[][] array){
        for(boolean[] row : array){
            for(boolean value : row) {
                if(value)
                    System.out.print(" "+1);
                else
                    System.out.print(" "+0);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = scanner.nextInt();
        boolean[][] board = new boolean[size][size];
        double startAlive = 0.3*size;

        for(int i = 0; i<size; i++)
            for(int j = 0; j<size; j++){
                board[i][j] = false;
            }
        for(int i = 0; i<startAlive; i++){
            int x = random.nextInt(1, size);
            int y = random.nextInt(1, size);
            board[x][y] = true;
        }
        printArray(board);

    }

}
