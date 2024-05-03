package DataStructure.Stack_DataStrucure;


public class CustomeStack<T> {

    private int maxSize;
    private T[] stackArray;
    private int top;

    public CustomeStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = (T[]) new Object[maxSize]; // Creating An Array Of Generic Type T Using Type Erasure
        top = -1;
    }

    public void push(T data) {
        if (isFull()) {
            throw new RuntimeException("Stack is already full");
        }
        top++;
        stackArray[top] = data;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is already empty");
        }
        T data = stackArray[top];
        top--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (maxSize - 1);
    }
}
