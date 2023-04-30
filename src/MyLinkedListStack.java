import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    MyLinkedList<T> stack;
    public MyLinkedListStack(){
        stack = new MyLinkedList<>();
    }
    public void push(T item){
        stack.add(item, 0);
    }
    public boolean isEmpty(){
        return stack.size() == 0;
    }
    public T pop(){
        isEmptyThrowException();
        T removedElement = stack.removeFirst(0);
        return removedElement;
    }
    public T peek(){
        isEmptyThrowException();
        return stack.get(0);
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
