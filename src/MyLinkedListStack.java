import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    MyLinkedList<T> stack;
    public MyLinkedListStack(){
        stack = new MyLinkedList<>();
    }
    public void push(T item){
        stack.add(item,0);
    }
    public boolean isEmpty(){
        return stack.size() == 0;
    }
    private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
    public T pop(){
        isEmptyThrowException();
        T removedElement = stack.remove(0);
        return removedElement;
    }
    public T peek(){
        return stack.get(0);
    }




}
