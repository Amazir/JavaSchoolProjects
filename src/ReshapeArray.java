import java.util.Scanner;
import java.util.Random;

public class ReshapeArray{
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args){
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] array1 = generateArray(rows1, cols1);
        printArray(array1);
        int[][] array2 = reshape(array1, rows2, cols2);
        printArray(array2);
    }

    private static int[][] generateArray(int rows, int cols){
        int[][] array = new int[rows][cols];
        for(int i = 0; i < rows;i++){
            for(int j = 0; j < cols; j++){
                array[i][j] = random.nextInt(100);
            }
        }
        return array;
    }

    private static void printArray(int[][] array){
        for(int[] row : array){
            for(int value : row)
                System.out.printf("%4d", value);
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] reshape(int[][] in, int rows2, int cols2){
        if(rows2 <= 0 || cols2 <= 0 || rows2*cols2 != in.length * in[0].length)
            return in;
        int[][] out = new int[rows2][cols2];
        int row2 = 0, col2 = 0;
        for(int[] row : in)
            for(int value : row) {
                out[row2][col2] = value;
                ++col2;
                if(col2 == cols2){
                    col2 = 0;
                    ++row2;
                }
            }
        return out;
    }
}