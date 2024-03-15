import java.util.Stack;

public class StackOps {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        for(int i = 1; i<=10; i++){
            stk.push(i);
        }
        System.out.println("Original Stack: "+stk);

        for(int i=0; i<4; i++){
            stk.pop();
        }
        System.out.println("Updated Stack: "+stk);

    }
}
