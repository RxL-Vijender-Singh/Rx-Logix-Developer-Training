public class Node {
    private Object obj;
    private Node next;
    public Node(Object obj){
        this.obj = obj;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Object obj){
        next = new Node(obj);
    }
    public void setNext(Node temp ){

    }

    public Object getObj(){
        return obj;
    }

    public void remove(){
        next = next.next;
    }


}
