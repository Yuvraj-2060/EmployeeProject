package DataStructure.SLL;

public class SinglyLinkedList {
    private Node first;
    private Node last;

//    public SinglyLinkedList(Node first, Node last) {
//        this.first = first;
//        this.last = last;
//    }

    public boolean isEmpty(){
        return first==null;
    }
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;
        if(isEmpty()){
            first = newNode;
        }
        newNode.next=first;
        first=newNode;
    }
    public void inserttLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first = newNode;
            last = newNode;
            return;
        }
        last.next= newNode;
        last=newNode;
    }
    public Node removeFirst(){
        Node temp = first;
        if(first.next==null){
            last=null;
        }
        first = first.next;
        return temp;
    }
    public void display(){
        Node curr = first;
        while(curr!=null){
            curr.displayNode();
            curr=curr.next;
        }
    }
}
