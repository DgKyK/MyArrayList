import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
    private E[]values;

    public MyArrayList(){
        try{
            values = (E[]) new Object[0];
        }catch(ClassCastException e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(E element) {
        try {
            values = Arrays.copyOf(values, values.length + 1);
            values[values.length - 1] = element;
            return true;
        }catch(ClassCastException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean add(int index, E element) {
        E[] temp = values;
        try{
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0 ,index);
            System.arraycopy(temp, index, values, index + 1, temp.length - index);
            values[index] = element;
            return true;
        }catch(ClassCastException e) {
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public boolean remove(int index) {
        E[] temp = values;
        try{
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp,0,values,0,index);
            System.arraycopy(temp,index + 1, values, index, temp.length - index - 1);
            return true;
        }catch(ClassCastException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean set(int index, E value) {
        values[index] = value;
        return true;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void clear() {
        try{
            values = (E[]) new Object[0];
        }catch(ClassCastException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(values);
    }

}
