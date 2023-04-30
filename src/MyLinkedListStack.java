import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    MyLinkedList<T> stack;
    /*
      @MyLinkedListStack - constructor of class
      @no parameters
      @return void
     */
    public MyLinkedListStack(){
        stack = new MyLinkedList<>();
    }

    public void push(T item){
        stack.add(item, 0);

    }

    public boolean isEmpty(){
        return stack.size() == 0;
    }
    /*
      @pop - remove and retrieve top element of the stack.
      @no parameters
      @remove - method of the MyLinkedList(remove element by index)
      @isEmptyThrowException - throw exception null
      @return void
     */
    public T pop(){
        isEmptyThrowException();
        T removedElement = stack.removeFirst(0);
        return removedElement;
    }
    /*
     @peek - retrieve the first element of the stack
     @isEmptyThrowException - throw exception null
     @get - method of the MyLinkedList(get the element).
     @return T - generic type object
    */
    public T peek(){
        isEmptyThrowException();
        return stack.get(0);
    }
    /*
     @size - return the size of stack
     @return int - size
    */
    public int size(){
        return stack.size();
    }
    /*
      @isEmptyThrowException - throw NoSuchElementException(), which is in java.util
      @return void
    */
    private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }




}
