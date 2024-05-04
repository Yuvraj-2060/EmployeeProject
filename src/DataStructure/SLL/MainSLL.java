package DataStructure.SLL;

public class MainSLL {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();



        list.inserttLast(10);
        list.inserttLast(50);
        list.inserttLast(20);
        list.inserttLast(30);
        list.insertFirst(70);
        list.insertFirst(100);

        list.removeFirst();

        list.display();

    }
}
