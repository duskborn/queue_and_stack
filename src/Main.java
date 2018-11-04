public class Main {
    public static void main(String args[]) {
        Queue<Integer> q = new ArrayQueue<>();
        assert q.isEmpty();
        q.push(1);
        assert !q.isEmpty();
        q.push(2);
        assert !q.isEmpty();
        q.push(3);
        assert !q.isEmpty();
        assert q.pop() == 1;
        assert !q.isEmpty();
        assert q.pop() == 2;
        assert !q.isEmpty();
        assert q.pop() == 3;
        assert q.isEmpty();

        Stack<Integer> s = new ArrayStack<>();
        assert s.isEmpty();
        s.push(1);
        assert !s.isEmpty();
        s.push(2);
        assert !s.isEmpty();
        s.push(3);
        assert !s.isEmpty();
        assert s.pop() == 3;
        assert !s.isEmpty();
        assert s.pop() == 2;
        assert !s.isEmpty();
        assert s.pop() == 1;
        assert s.isEmpty();
    }
}
