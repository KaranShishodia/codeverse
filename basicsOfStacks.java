
import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.peek()); // 40
        System.out.println(st); // [10, 20, 30, 40]
        System.out.println(st.pop()); // 40
        System.out.println(st); // [10, 20, 30]
        System.out.println("size is :" + st.size()); // 3
        System.out.println(st.isEmpty()); // false
        System.out.println(st.search(20)); // 2 (position from top)
        System.out.println(st.search(100)); // -1 (not found)
        System.out.println(st.contains(20)); // true
        System.out.println(st.contains(100)); // false
        System.out.println(st.empty()); // false
        System.out.println(st.capacity()); // 10 (default capacity)
        System.out.println(st.get(0)); // 10 (element at index 0)
        System.out.println(st.get(1)); // 20 (element at index 1)
        System.out.println(st.get(2)); // 30 (element at index 2)

        System.out.println(st.get(3)); // 40 (element at index 3)
        System.out.println(st.get(4)); // IndexOutOfBoundsException

    }
}
