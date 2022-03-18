import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionFrameworkTask5 {

    public static void main(String[] args){
        Queue<Integer> queue = new PriorityQueue<Integer>();

//        inserting 6 integers
        queue.add(11);
        queue.add(10);
        queue.add(95);
        queue.add(43);
        queue.add(57);
        queue.add(36);

        Iterator<Integer> itr = queue.iterator();
        
        System.out.println("Queue size "+queue.size());
        System.out.println("The queue contains elements: ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=======================");
        int i = 2;
        System.out.println("Removing elements :");
        while (i>0){
            System.out.println(queue.peek());
            queue.poll();
            i--;
        }
        System.out.println("=======================");

        itr = queue.iterator();
        System.out.println("Queue size "+queue.size());
        System.out.println("The queue elements left : ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=======================");
    }
}
