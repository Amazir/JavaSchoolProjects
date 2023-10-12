import java.util.Scanner;

public class ZadanieDomowe1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); // Wczytywnaie liczby calkowitej
        for(int i = 1; i <= a; i++){
            if(a%i == 0){
                System.out.printf("Podzielnik: %d%n", i);
            }
        }
    }
}
