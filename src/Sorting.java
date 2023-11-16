import java.util.*;

public class Sorting {

    private final Integer[] array;
    private final List<Integer> list;
    private static final Random random = new Random();

    public Sorting(int n){
        this.array = new Integer[n];
        this.list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            array[i] = random.nextInt(100);
        }
    }

    public Sorting(){
        this(10);
    }

    public void sort(Comparator<Integer> comparator){
        Arrays.sort(array, comparator);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
