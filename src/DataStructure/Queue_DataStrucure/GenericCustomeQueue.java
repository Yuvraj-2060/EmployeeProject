package DataStructure.Queue_DataStrucure;

public class GenericCustomeQueue<T> {
    private int maxSize;
    private T[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public GenericCustomeQueue(int maxSize){
        this.maxSize = maxSize;
        queueArray = (T[]) new Object[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }
    public boolean insert(T item){
        if(isFull()){
            return false;
        }
        rear++;
        queueArray[rear] = item;
        nItems++;
        return true;
    }
    public T remove(){
        if(isEmpty())
            throw new RuntimeException("Queue is already empty");
        T item = queueArray[front];
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
    public T peek(){
        return queueArray[front];
    }
}

