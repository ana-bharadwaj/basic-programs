
import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<Integer>();
        int[] b = { 1, 2, 3, 4, 5 };
        int length = b.length;

        for (int i = 0; i < b.length; i++) {
            a.push(b[i]);
        }
        int[] reverse = new int[length];
        for (int i = 0; i < b.length; i++) {
            reverse[i] = a.pop();

        }
        System.out.println(reverse.toString());
    }
}
