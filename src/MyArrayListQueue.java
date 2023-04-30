
import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    MyArrayList<T> queue;
    /*
      @MyArrayListQueue - constructor of class
      @no parameters
      @return void
     */

    public MyArrayListQueue() {
        queue = new MyArrayList<T>();
    }
    /*
      @enqueue - add element to the last position in queue
      @T item - generic type any object
      @add - method of the MyArrayList(adds element)
      @return void
     */
    public void enqueue(T item) {
        queue.add(item);
    }
    /*
      @dequeue - remove and retrieve top element of the queue.
      @no parameters
      @remove - method of the MyArrayList(remove element by index)
      @isEmptyThrowException - throw exception null
      @return void
     */
    public T dequeue() {
        isEmptyThrowException();
        T removedElement = queue.remove(0);
        return removedElement;
    }
    /*
      @peek - retrieve the first element of the queue
      @isEmptyThrowException - throw exception null
      @get - method of the MyArrayList(get the element).
      @return T - generic type object
     */
    public T peek() {
        isEmptyThrowException();
        return queue.get(0);
    }
    /*
     @size - return the size of queue
     @return int - size
    */
    public int size() {
        return queue.size();
    }
    /*
     @isEmpty - checks is the queue empty or not
     @return boolean
    */
    public boolean isEmpty() {
        return size() == 0;
    }
    /*
      @isEmptyThrowException - throw NoSuchElementException(), which is in java.util
      @return void
    */
    private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }


}