import java.util.Comparator;

public class SortingTest {
    public static void main(String[] args){
        Sorting container = new Sorting();
        System.out.println(container);

        container.sort(new Comparator<>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o1-o2;
            }
        });
        System.out.println(container);

        container.sort(new Comparator<>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2-o1;
            }
        });
        System.out.println(container);

        container.sort(new Comparator<>(){
            @Override
            public int compare(Integer o1, Integer o2){
                int d1 = o1 % 10;
                int d2 = o2 % 10;
                if(d1 != d2) return d1 - d2;
                return o1-o2;
            }
        });
        System.out.println(container);
    }

}
