import java.util.ArrayList;

public class ArrayQueue<T> implements Queue<T> {

    private ArrayList<T> queue = new ArrayList();

    @Override
    public void push(T value) {
        queue.add(value);
    }

    @Override
    public T pop() {
        return queue.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
