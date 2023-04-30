# MyArrayListStack
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