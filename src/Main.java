import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //      ## MyLinkedListStack
        System.out.println("MyLinkedListStack");
        MyLinkedListStack<Integer> linkedStack = new MyLinkedListStack<>();
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        System.out.println(linkedStack.isEmpty());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.peek());
        System.out.println(linkedStack.size());



//      ## MyLinkedListQueue
        System.out.println("MyLinkedListQueue");
        MyLinkedListQueue<Integer> linkedQueue = new MyLinkedListQueue<>();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        System.out.println(linkedQueue.isEmpty());
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.peek());
        System.out.println(linkedQueue.size());


//      ## MyArrayListStack
        System.out.println("MyArrayListStack");
        MyArrayListStack<Integer> arrStack = new MyArrayListStack<>();
        arrStack.push(1);
        arrStack.push(2);
        arrStack.push(3);
        System.out.println(arrStack.isEmpty());
        System.out.println(arrStack.pop());
        System.out.println(arrStack.pop());
        System.out.println(arrStack.peek());
        System.out.println(arrStack.size());


//      ## MyArrayListQueue
        System.out.println("MyArrayListQueue");
        MyArrayListQueue<Integer> arrQueue = new MyArrayListQueue<>();
        arrQueue.enqueue(1);
        arrQueue.enqueue(2);
        arrQueue.enqueue(3);
        System.out.println(arrQueue.isEmpty());
        System.out.println(arrQueue.dequeue());
        System.out.println(arrQueue.dequeue());
        System.out.println(arrQueue.peek());
        System.out.println(arrQueue.size());

    }
}


