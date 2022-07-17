import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        --Stack Implementation
        Stack1 stack = new Stack1();
        stack.push(new Integer(11));
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        stack.push(new String("SDasdsad"));
        System.out.println(stack.pop());
        System.out.println(stack.search(new Integer(11)));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        --Queue Implementation
        Queue queue = new Queue();
        queue.enqueue(new String("first"));
        queue.enqueue(new String("second"));
        queue.printQueue();
        System.out.println(queue.dequeue());
        queue.printQueue();
        System.out.println(queue.empty());
        List l = new ArrayList();
//        --LinkedList implementation
        LinkedList list = new LinkedList(new String("first"));
        list.add(new String("second"));
        list.add(new String("third"));
        System.out.println("list");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        list.printList();
        list.add(new String("fourth"));
        list.remove(new String("first"));
        list.printList();
        list.remove(new String("third"));
        list.printList();
//      Employee sort by emplloyeeId, name, departmentId
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee("Ajey",1,1));
        employees.add(new Employee("Nitin",2,1));
        employees.add(new Employee("Rishab",3,1));
        employees.add(new Employee("Vijender",4,1));
        employees.add(new Employee("Ruhi",5,2));
        employees.add(new Employee("Bhupendra Singh",6,1));
        System.out.println(employees);
        Collections.sort(employees,new SortByEmployeeName());
        System.out.println("Sort By Name -"+employees);
        Collections.sort(employees,new SortByEmployeeId());
        System.out.println("Sort By Employee ID -"+employees);
        Collections.sort(employees,new SortByEmployeeDepartmentId());
        System.out.println("Sort By Department ID -"+employees);
//        find common elements in two arrayList, time complexity->O(whoevers has maximum length)
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2,4,1,56,3));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(56,8,2,4,3));
        System.out.println(findCommon(arr1,arr2));
    }

    public static List<Integer> findCommon(ArrayList<Integer> a1, ArrayList<Integer> a2){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        if(a1.size() > a2.size()){
            return findCommon(a2,a1);
        }
        for(int i = 0 ; i < a1.size() ; i++){
            hashMap.put(a1.get(i),hashMap.getOrDefault(a1.get(i),0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < a2.size() ; i++){
            if(hashMap.containsKey(a2.get(i)) && hashMap.get(a2.get(i)) > 0){
                result.add(a2.get(i));
                hashMap.put(a2.get(i),hashMap.get(a2.get(i))-1);
            }
        }
        return result;
    }

}
