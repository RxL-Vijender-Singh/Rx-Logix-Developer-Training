public class LinkedList {
    Node head;
    private int size;
    public LinkedList(Object obj){
        head = new Node(obj);
        size = 1;
    }

    public void printList(){
        Node temp = head;
        System.out.print("[ ");
        while(temp != null ){
            System.out.print(temp.getObj()+",");
            temp = temp.getNext();
        }
        System.out.print(" ]");
        System.out.println("");

    }

    public void add(Object obj){
        if(head.getNext() == null){
            head.setNext(obj);
        }else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(obj);
        }
        size++;
    }
    public int size(){
        return size;
    }
    public Object get(int index){
        if(index < size){
            int count = 0;
            Node temp = head;
            while(temp.getNext() != null && count != index){
                count++;
                temp = temp.getNext();
            }
            return temp.getObj();
        }else{
            return null;
        }
    }
    public void add(int index, Object obj){
        if(index < size){
            Node temp = head;
            int count = 0;
            while (temp != null && count < index ){
                temp = temp.getNext();
                count++;
            }
            Node temp1 = temp.getNext();
            temp.setNext(obj);
            temp = temp.getNext();
            temp.setNext(temp1);
        }else{
            System.out.println("No element at such index");
        }
    }
    public void remove(Object obj){
        if(head.getObj().equals(obj)){
            head = head.getNext();
        }
        Node temp = head;
        while(temp.getNext() != null){
            if(temp.getNext().getObj().equals(obj)){
                System.out.println("Object removed");
                temp.remove();
            }
            temp = temp.getNext();
        }
    }
}
