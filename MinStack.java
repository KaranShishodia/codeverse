import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top()); // return 0
        System.out.println(minStack.getMin()); // return -2
    }

    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if (st.size() == 0) {
            st.push(val);
            min.push(val);
        } else {
            st.push(val);
            if (min.peek() < val)
                min.push(min.peek());
            else
                min.push(val);
        }

    }

    public void pop() {
        st.pop();
        min.pop();

    }

    public int top() {
        return st.peek();

    }

    public int getMin() {
        return min.peek();

    }
}
