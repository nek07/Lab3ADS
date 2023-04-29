import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    MyArrayList<T> queue;
    public MyArrayListQueue(){
        queue = new MyArrayList<T>();
    }
    public void enqueue(T item){
        queue.add(item);
    }
    public T dequeue(int index){
        if(index>=queue.size() || index<0){
            return null;
        }
        T removedElement =queue.remove(index);
        return removedElement;
    }
    public T peek(){
        if(queue.size()==0){
            return null;
        }
        return queue.get(0);
    }

}
