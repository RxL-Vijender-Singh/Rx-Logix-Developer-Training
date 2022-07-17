import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List queue ;
    public Queue(){
        queue = new ArrayList<>();
    }
    public void printQueue(){
        System.out.println(queue);
    }
    //    add method in stack
    public  void enqueue(Object o){
        queue.add(o);
    }
    //    delete method in stack
    public  Object dequeue(){
        if(queue.size()==0){
            System.out.println("Empty Queue");
            return null;
        }
        Object o = queue.get(0);
        queue.remove(0);
        return o;
    }
    public  Object empty(){
        return queue.size() == 0;
    }
    public  Object get(int i){
        if(queue.size()==0){
            System.out.println("Empty queue exception");
        }
        i = queue.size()-1-i;
        return i >= queue.size() || i < 0  ? null : queue.get(i);
    }

}
