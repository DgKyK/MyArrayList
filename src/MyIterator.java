import java.util.Iterator;

public class MyIterator<E> implements Iterator<E> {
    private E[] value;
    private int index = 0;

    public MyIterator(E[] value){
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return index < value.length;
    }

    @Override
    public E next() {
        return value[index++];
    }
}
