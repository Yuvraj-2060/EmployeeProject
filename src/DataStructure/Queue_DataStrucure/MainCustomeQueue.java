package DataStructure.Queue_DataStrucure;

import java.util.Queue;

public class MainCustomeQueue {
    public static void main(String[] args) {
        CustomeQueue queue = new CustomeQueue(5);

        queue.insert("Yuvraj");
        queue.insert("Aryan");

        queue.displayQueue();

        queue.remove();
        queue.displayQueue();

        queue.remove();
        queue.remove();
    }
}
