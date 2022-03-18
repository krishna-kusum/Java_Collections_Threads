import java.util.HashSet;
import java.util.Set;

public class CollectionFrameworkTask3 {
    public static void main(String[] args){
        Set<Integer> integerHashSet = new HashSet<Integer>();

        integerHashSet.add(23);
        integerHashSet.add(45);
        integerHashSet.add(83);
        integerHashSet.add(47);
        integerHashSet.add(83);
        integerHashSet.add(23);

        System.out.println("A group of integers: "+integerHashSet.toString());
    }
}
