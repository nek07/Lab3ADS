import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> {
    MyLinkedList<T> queue;
    public MyLinkedListQueue(){
        queue = new MyLinkedList<T>();
    }
    public void enqueue(T item){
        queue.add(item);
    }


}
