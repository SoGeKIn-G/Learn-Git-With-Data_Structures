import java.util.Stack;

public class R4_Delete_Middle_Element_From_Stack {
    public static void main(String[] args) {


//      middle element =(size/2)+1;  //always
//        5 4 3 2 1       ->>>>>    5 4 2 1
//        6 5 4 3 2 1     ->>>>>    6 5 3 2 1

        Stack<Integer> stack = new Stack<>();
        int a[] = new int[]{6,5,4,3,2,1};
        for (int i = 0; i < a.length; i++) {
            stack.add(a[i]);
        }
        int k= (stack.size()/2)+1;
        solve(stack,k);
        System.out.println(stack);
    }

    private static void solve(Stack<Integer> stack,int k) {

        if(stack.size()==0){
            return;
        }
        if(k==1){
            stack.pop();
            return;
        }

        int temp= stack.pop();
        solve(stack,k-1);
stack.push(temp);
    }
}
