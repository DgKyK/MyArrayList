public interface MyList<E> extends Iterable<E> {
    boolean add(E element);
    boolean add(int index, E element);
    E get(int index);
    boolean remove(int index);
    boolean set(int index, E value);
    int size();
    void clear();

}
