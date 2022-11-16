import java.util.Stack;

public class R5_Reverse_Stack {
    public static void main(String[] args) {
//using recursion
        Stack<Integer> stack = new Stack<>();
        int a[] = new int[]{6, 5, 4, 3, 2, 1};
        for (int i = 0; i < a.length; i++) {
            stack.add(a[i]);
        }
        System.out.println("Previous " + stack);
        reverse(stack);
        System.out.println("After " + stack);
    }

    private static void reverse(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }
        int temp = stack.pop();
        reverse(stack);
        swap(stack, temp);
    }

    static void swap(Stack<Integer> s, int temp) {
        if (s.size() == 0) {
            s.push(temp);
            return;
        }
        int val = s.pop();
        swap(s, temp);
        s.push(val);
    }
}


