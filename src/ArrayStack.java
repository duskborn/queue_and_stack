import java.util.ArrayList;

public class ArrayStack<T> implements Stack<T> {

    private ArrayList<T> stack = new ArrayList();
    int i = 0;

    @Override
    public void push(T value) {
        stack.add(value);
        i++;
    }

    @Override
    public T pop() {
        i--;
        return stack.remove(i);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
