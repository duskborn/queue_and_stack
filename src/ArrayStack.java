import java.util.ArrayList;

public class ArrayStack<T> implements Stack<T> {

    private ArrayList<T> stack = new ArrayList();

    @Override
    public void push(T value) {
        stack.add(value);
    }

    @Override
    public T pop() {
        return stack.remove(stack.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
