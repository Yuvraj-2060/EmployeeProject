package DataStructure.Queue_DataStrucure;

public class MainGenericCustomeQueue {
    public static void main(String[] args) {
        GenericCustomeQueue queue = new GenericCustomeQueue(5);

        queue.insert("Yuvraj");
        queue.insert(1);
        queue.insert(11.67f);
        queue.insert('Y');

        queue.displayQueue();


    }
}
