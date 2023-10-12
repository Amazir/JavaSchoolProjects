import java.util.Random;
import java.util.Scanner;

public class ZadanieDomowe2 {
    public static Random random = new Random();

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] liczby = new int[n];
        for(int i = 0; i < n; i++){
            liczby[i] = random.nextInt(0, 11);
            String test = "";
            for(int j = 0; j < liczby[i]; j++)
                test += "*";
            System.out.println(i + " " + test);
        }
    }
}
