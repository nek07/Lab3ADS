import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    MyArrayList<T> stack;
    /*
      @MyArrayListStack - constructor of class
      @no parameters
      @return void
     */
    public MyArrayListStack(){
        stack = new MyArrayList<T>();
    }
    /*
      @push - add element to the first position in stack
      @T item - generic type any object
      @add - method of the MyArrayList(adds element by index)
      @return void
     */
    public void push(T item){
        stack.add(item,0);
    }
    /*
      @pop - remove and retrieve top element of the stack.
      @no parameters
      @remove - method of the MyArrayList(remove element by index)
      @isEmptyThrowException - throw exception null
      @return void
     */
    public T pop(){
        isEmptyThrowException();
        T removedElement = stack.remove(0);
        return removedElement;
    }
    /*
      @peek - retrieve the first element of the stack
      @isEmptyThrowException - throw exception null
      @get - method of the MyArrayList(get the element).
      @return T - generic type object
     */
    public T peek(){
        isEmptyThrowException();
        return stack.get(0);
    }
    /*
     @isEmpty - checks is the stack empty or not
     @return boolean
   */
    public boolean isEmpty(){
        return stack.size() == 0;
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
