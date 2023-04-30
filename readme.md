# MyArrayListStack
### ➕ MyArrayListStack
**Description**: Constructor of the class
```java
public MyArrayListStack(){
        stack = new MyArrayList<T>();
        }
```
### ➕ push
**Description**: Add the element on the top of the arrayList and shift other elements to the right.
```java
public void push(T item){
        stack.add(item,0);
        }
```
### ➕ pop
**Description**: Remove and return the top element of the stack.
```java

public T pop(){
        isEmptyThrowException();
        T removedElement = stack.remove(0);
        return removedElement;
        }
```
### ➕ peek
**Description**: Return the top element of the stack.
```java
public T peek(){
        isEmptyThrowException();
        return stack.get(0);
    }
```
### ➕ size
**Description**: Return the size of the stack.
```java
public int size(){
        return stack.size();
        }
```
### ➕ isEmpty
**Description**: Checks is the stack empty or not and respectively return `true` or `false`.
```java
public boolean isEmpty(){
        return stack.size() == 0;
        }
```
### ➕ isEmptyThrowException
**Description**: If the stack is empty then throw `EmptyStackException()` exception.
```java

private void isEmptyThrowException() {
        if (isEmpty()) {
        throw new EmptyStackException();
        }
}
```
# MyLinkedListStack
### ➕ MyArrayListStack
**Description**: Constructor of the class
```java
public MyLinkedListStack(){
        stack = new MyLinkedList<T>();
        }
```
### ➕ push
**Description**: Add the element on the top of the stack and shift other elements to the right.
```java
public void push(T item){
        stack.add(item,0);
        }
```
### ➕ pop
**Description**: Remove and return the top element of the stack.
```java

public T pop(){
        isEmptyThrowException();
        T removedElement = stack.removeFirst(0);
        return removedElement;
        }
```
### ➕ peek
**Description**: Retrieve the top element of the stack.
```java
public T peek(){
        isEmptyThrowException();
        return stack.get(0);
    }
```
### ➕ size
**Description**: Return the size of the stack.
```java
public int size(){
        return stack.size();
        }
```
### ➕ isEmpty
**Description**: Checks is the stack empty or not and respectively return `true` or `false`.
```java
public boolean isEmpty(){
        return stack.size() == 0;
        }
```
### ➕ isEmptyThrowException
**Description**: If the stack is empty then throw `NoSuchElementException()` exception.
```java

private void isEmptyThrowException() {
        if (isEmpty()) {
        throw new EmptyStackException();
        }
}
```
# MyArrayListQueue
### ➕ MyArrayListQueue
**Description**: Constructor of the class
```java
public MyArrayListQueue(){
        queue = new MyLinkedList<T>();
        }
```
### ➕ enqueue:
**Description**: Add the element to the last position(`tail`) in queue.
```java
public void enqueue(T item) {
        queue.add(item);
        }
```
### ➕ dequeue
**Description**: Retrieves and remove the head of this queue, or return null if the queue is empty.
```java
public T dequeue() {
        isEmptyThrowException();
        T removedElement = queue.remove(0);
        return removedElement;
    }
```
### ➕ peek
**Description**: Retrieves, the head of this queue, or returns null if this queue is empty.
```java
 public T peek() {
        isEmptyThrowException();
        return queue.get(0);
    }
```
### ➕ size
**Description**: Return the size of the queue.
```java
public int size() {
        return queue.size();
    }
```
### ➕ isEmpty
**Description**: Checks is the queue empty or not, respectively return true|false.
```java
public boolean isEmpty() {
        return size() == 0;
    }
```
### ➕ isEmptyThrowException
**Description**: If the stack is empty then throw `EmptyStackException()` exception.
```java
private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }
```
# MyLinkedListQueue
### ➕ MyLinkedListQueue
**Description**: Constructor of the class
```java
public MyLinkedListQueue(){
        queue = new MyLinkedList<T>();
        }
```
### ➕ enqueue:
**Description**: Add the element to the last position(`tail`) in queue.
```java
public void enqueue(T item) {
        queue.add(item);
        }
```
### ➕ dequeue
**Description**: Retrieves and remove the head of this queue, or return null if the queue is empty.
```java
public T dequeue() {
        isEmptyThrowException();
        T removedElement = queue.remove(0);
        return removedElement;
    }
```
### ➕ peek
**Description**: Retrieves, the head of this queue, or returns null if this queue is empty.
```java
 public T peek() {
        isEmptyThrowException();
        return queue.get(0);
    }
```
### ➕ size
**Description**: Return the size of the queue.
```java
public int size() {
        return queue.size();
    }
```
### ➕ isEmpty
**Description**: Checks is the queue empty or not, respectively return true|false.
```java
public boolean isEmpty() {
        return size() == 0;
    }
```
### ➕ isEmptyThrowException
**Description**: If the stack is empty then throw `EmptyStackException()` exception.
```java
private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }
```
