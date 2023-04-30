import java.util.Arrays;

public class MyArrayList<T>{
    private Object[] arr;
    private int size = 0;
    private int capacity = 5;
    /*
        @MyArrayList() - constructor of the class
        @noParameters
        @return void
    */
    public MyArrayList() {
        arr = new Object[capacity];
    }
    /*
        @add() - adds new element in an array.
        @T item -  any element in generic(any) type.
        @return void
    */
    public void add(T item) {
        if(size==capacity) //if array if overfilled
            increseBuffer();
        arr[size++] = item;
    }
    /*
        @increaseBuffer() - increase the size of arrayList
        @noParameters
        @return void
    */
    private void increseBuffer() {
        if (size == capacity) {
            capacity = (int) (capacity * 1.5);
            Object[] newArr = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }
    /*
        @get() - get the element from arrayList. O(1)
        @int index - index of element in arrayList.
        @return T type arr[index] - returns the index's element.
    */
    public T get(int index) {
        checkIndex(index);
        return (T) arr[index];
    }
    /*
        @size() - return the size of arrayList
        @noParameters
        @return int
    */
    public int size() {
        return this.size;
    }
    /*
        @contains() - checks that is the element in arrayList or not
        @Object o - generic type element(any type element)
        @return boolean
    */

    public boolean contains(Object o) {
        for(int i=0;i<size;i++){
            if(o.equals(arr[i])){
                return true;
            }
        }
        return false;
    }
    /*
        @add() - add the element in spicified place in arrayList.
        @T item - any type element(generic).
        @int index - index of element in an arrayList.
        @return void
    */

    public void add(T item, int index) {

        if (size == capacity) {
            increseBuffer();
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        size++;

    }
    /*
        @remove() - remove element in an arrayList and shift all the elements left.
        @T item - generic type element in an array
        @return boolean - if the element was in an array and deleted `true`
    */

    public boolean remove(T item) {
        int index = indexOf(item);
        if(index>=0){
            for (int i = index; i < size-1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            return true;
        }
        else{
            return false;
        }
    }
    /*
        @remove() - remove the element in arrayList by index and shift elements to the left
        @int index - index in arraylist.
        @return T - generic type, returns element in array.
    */

    public T remove(int index) {
        checkIndex(index);
        T element = (T) arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return element;
    }
    /*
        @clear() - delete all the elements, by creating new Object
        @noParameters
        @return void
    */

    public void clear() {
        this.arr = (T[]) new Object[5];
        size=0;
    }
    /*
        @indexOf() - return the index of specified element, otherwise -1
        @Object o - generic type element of an arrayList
        @return int - index or -1
    */

    public int indexOf(Object o) {
        for(int i = 0; i<size; i++){
            if(o.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
    /*
        @size() - return index of last occurence of specified element
        @Object o - generic type element of arrayList
        @return int - index of the element in arrayList
    */

    public int lastIndexOf(Object o) {
        int index=-1;
        for(int i=0;i<size;i++){
            if(o.equals(arr[i])){
                index=i;
            }
        }
        return index;
    }
    /*
        @sort() - sort the arrayList in ascending order(only integer)
        @noParameters
        @return void
    */

    public void sort() {
        Arrays.sort(arr);
    }

    /*
        @checkIndex - additional method which helps to determine is the index of LinkedList exist or not
        @int index - index of LinkedList
        @IndexOutOfBoundsException()- exception which checks is the index greater than size or smaller than 0
        @return void
     */
    void checkIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(); //exception
        }
    }
    /*
      @addAll - function which add list of data at specified index.
      @int index - specified index.
      @T[] list - contain elements which will be added.
      @checkIndex - checks is the index existed in arraylist or not.(IndexOutOfBoundException)
      @increaseBuffer() - increase the size of arrayList.
      @return void.
    */

    public void addAll(int index,T[] list) {
        for (int i=0;i<list.length;i++) {
            checkIndex(index);
            if (size == capacity) {
                increseBuffer();
            }
            for (int j = size; j > index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[index] = list[i];
            size++;
            index++;
        }
    }
}