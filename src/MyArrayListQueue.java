
import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    MyArrayList<T> queue;

    public MyArrayListQueue() {
        queue = new MyArrayList<T>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        isEmptyThrowException();
        T removedElement = queue.remove(0);
        return removedElement;
    }

    public T peek() {
        isEmptyThrowException();
        return queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }
    private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }


}