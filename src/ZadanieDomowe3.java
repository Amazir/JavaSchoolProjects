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


    private static boolean[][] nextMove(boolean[][] board) {
        int n = board.length;
        boolean[][] nextBoard = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int aliveNeighborsCount = countAliveNeighbors(board, i, j);
                if (board[i][j]) {
                    nextBoard[i][j] = aliveNeighborsCount == 2 || aliveNeighborsCount == 3;
                } else {
                    nextBoard[i][j] = aliveNeighborsCount == 3;
                }
            }
        }
        return nextBoard;
    }

    private static int countAliveNeighbors(boolean[][] board, int row, int col) {
        int n = board.length;
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < n && j >= 0 && j < n && !(i == row && j == col)) {
                    count += board[i][j] ? 1 : 0;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar planszy: ");
        int n = scanner.nextInt();
        boolean[][] board = new boolean[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = random.nextDouble() < 0.3;
            }
        }
        while (true) {
            printArray(board);
            System.out.println("Nacisnij Enter, aby wykonac kolejny ruch...");
            scanner.nextLine();
            board = nextMove(board);
        }

    }

}
