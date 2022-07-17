import java.util.ArrayList;
import java.util.List;

public class Stack1 {
    private  List stack ;
    public Stack1(){
        stack = new ArrayList<>();
    }
    public void printStack(){
        System.out.println(stack);
    }
//    add method in stack
    public  void push(Object o){
        stack.add(o);
    }
//    delete method in stack
    public  Object pop(){
        if(stack.size()==0){
            System.out.println("Empty Stack");
            return null;
        }
        Object o = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return o;
    }
    public  Object empty(){
        return stack.size() == 0;
    }
    public  Object peek(){
        if(stack.size()==0){
            System.out.println("Empty stack exception");
        }
        return stack.size() == 0 ? null : stack.get(stack.size()-1);
    }
    public  Object search(Object o){
        if(stack.size() == 0)
            return new Integer(-1);
        return stack.contains(o) ? new Integer(stack.indexOf(o)) : new Integer(-1);
    }
}
