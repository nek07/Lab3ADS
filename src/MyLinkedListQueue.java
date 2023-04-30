import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> {
    MyLinkedList<T> queue;
    public MyLinkedListQueue(){
        queue = new MyLinkedList<T>();
    }
    public void enqueue(T item){
        queue.add(item);
    }
    public T dequeue(){
        isEmptyThrowException();
        T removedItem = queue.remove(0);
        return removedItem;
    }
    public int size(){
        return queue.size();
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public T peek(){
        isEmptyThrowException();
        return queue.get(0);
    }

    private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }



}
