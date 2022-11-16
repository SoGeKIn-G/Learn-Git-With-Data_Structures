import java.util.Stack;

public class R3_Sort_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int a[] = new int[]{3, 2, 45, 1, -4, 34, 0, 435, 3, 32, -67, -23};
        for (int i = 0; i < a.length; i++) {
            stack.add(a[i]);
        }
        sortStack(stack);
        System.out.println(stack);
    }

    private static void sortStack(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }
        int temp = stack.pop();
//        stack.pop();
        sortStack(stack);
        insert(stack, temp);
    }

    private static void insert(Stack<Integer> stack, int temp) {
        if (stack.size() == 0) {
            stack.push(temp);
        } else if (stack.get(stack.size() - 1) < temp) {
            stack.push(temp);
        } else {
            int val = stack.pop();
            insert(stack, temp);
            ;
            stack.push(val);
        }

    }
}
