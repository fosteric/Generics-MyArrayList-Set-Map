import java.util.ArrayList;

public class MyArrayList <E> {
    private static final int DEFAULT_CAPACITY = 15;
    Object[] myArray = new Object[DEFAULT_CAPACITY];

    public void add(E e){

        myArray = new Object[myArray.length + 1];
        myArray[myArray.length-1] = e;
    }

    public E get(int index){
        return (E)myArray[index];
    }

    public E remove(int index) {
        return null;
    }

    public boolean remove(Object object){
        return false;
    }
}
