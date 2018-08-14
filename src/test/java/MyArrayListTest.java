import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNull;

public class MyArrayListTest {

    @Test
    public void addTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer expected = 10;
        myArrayList.add(expected);
        Integer actual = myArrayList.get(0);
        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getTestEmpty(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.get(0);
    }

    @Test
    public void removeIndexTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer expected = 10;
        myArrayList.add(expected);
        Integer actual = myArrayList.remove(0);
        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeIndexTest2(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer i = 10;
        myArrayList.add(i);
        myArrayList.remove(0);
        myArrayList.get(0);
    }

    @Test
    public void removeObjectTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer i = 10;
        myArrayList.add(i);
        assertTrue(myArrayList.remove(i));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeObjectTest2(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Integer i = 10;
        myArrayList.add(i);
        myArrayList.remove(i);
        myArrayList.get(0);
    }

    @Test
    public void setTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
    }

    @Test
    public void clearTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
    }

    @Test
    public void isEmptyTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
    }

    @Test
    public void containsTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
    }

    @Test
    public void sortTest(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
    }

    @Test
    public void testCapacity(){
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        for (int i = 0; i<14; i++){
            System.out.println(myArrayList.get(i));
        }
    }

}
