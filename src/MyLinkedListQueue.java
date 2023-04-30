import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> {
    MyLinkedList<T> queue;
    /*
      @MyLinkedListQueue - constructor of class
      @no parameters
      @return void
     */
    public MyLinkedListQueue(){
        queue = new MyLinkedList<T>();
    }
    /*
      @enqueue - add element to the last position in queue
      @T item - generic type any object
      @add - method of the MyLinkedList(adds element)
      @return void
     */
    public void enqueue(T item){
        queue.add(item);
    }
    /*
      @dequeue - remove and retrieve top element of the queue.
      @no parameters
      @remove - method of the MyLinkedList(remove element by index)
      @isEmptyThrowException - throw exception null
      @return void
     */
    public T dequeue(){
        isEmptyThrowException();
        T removedItem = queue.remove(0);
        return removedItem;
    }
    /*
      @size - return the size of queue
      @return int - size
     */
    public int size(){
        return queue.size();
    }
    /*
      @isEmpty - checks is the queue empty or not
      @return boolean
     */
    public boolean isEmpty(){
        return size()==0;
    }
    /*
      @peek - retrieve the first element of the queue
      @isEmptyThrowException - throw exception null
      @get - method of the LinkedList(get the element).
      @return T - generic type object
     */
    public T peek(){
        isEmptyThrowException();
        return queue.get(0);
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
