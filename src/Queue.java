public interface Queue<T> {
    void push(T value);
    T pop();
    boolean isEmpty();
}
