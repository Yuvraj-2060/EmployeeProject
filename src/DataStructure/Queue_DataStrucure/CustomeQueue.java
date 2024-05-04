package DataStructure.Queue_DataStrucure;

public class CustomeQueue {
    private int maxSize;
    private String[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public CustomeQueue(int maxSize){
        this.maxSize = maxSize;
        queueArray = new String[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }
    public boolean insert(String item){
        if(isFull()){
            return false;
        }
        rear++;
        queueArray[rear] = item;
        nItems++;
        return true;
    }
    public String remove(){
        if(isEmpty())
            throw new RuntimeException("Queue is already empty");
        String item = queueArray[front];
        front++;
        nItems--;
        return item;
    }
    public void displayQueue(){
        for(int i=front;i<=rear;i++)
            System.out.println(queueArray[i]);
    }
    public boolean isFull() {
        return nItems==maxSize;
    }
    public boolean isEmpty(){
        return nItems==0;
    }
    public String peek(){
        return queueArray[front];
    }
}
