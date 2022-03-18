import java.util.ArrayList;
import java.util.List;

public class CollectionFrameworkTask1 {
    public static void main(String[] args){
        List<Integer> integerArray = new ArrayList<Integer>();

        integerArray.add(23);
        integerArray.add(45);
        integerArray.add(14);
        integerArray.add(47);
        integerArray.add(83);
        integerArray.add(59);

        System.out.println("A group of integers: "+integerArray.toString());
    }
}
