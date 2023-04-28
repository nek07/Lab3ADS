
public class MyArrayListStack<T> {
    MyArrayList<T> stack;
    public MyArrayListStack(){
        stack = new MyArrayList<T>();
    }
    public void push(T item){
        stack.add(item);
    }
    public T pop(){
        stack.checkIndex(stack.size()-1);
        T removedElement = stack.remove(stack.size()-1);
        return (T) removedElement;
    }
    public T peek(){
        stack.checkIndex(stack.size()-1);
        return (T) stack.get(stack.size()-1);
    }
    public boolean isEmpty(){
        return stack.size() == 0;
    }

}
