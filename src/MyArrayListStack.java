import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    MyArrayList<T> stack;
    public MyArrayListStack(){
        stack = new MyArrayList<T>();
    }

    public void push(T item){
        stack.add(item,0);
    }
    public T pop(){
        isEmptyThrowException();
        T removedElement = stack.remove(0);
        return removedElement;
    }
    public T peek(){
        isEmptyThrowException();
        return stack.get(0);
    }
    public boolean isEmpty(){
        return stack.size() == 0;
    }
    public int size(){
        return stack.size();
    }
    private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
}
