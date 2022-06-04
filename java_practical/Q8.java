import java.util.Stack;

public class Q8 {
    // wap to create an array of characters and reverse all of them.

    public static void main(String[] args) {

        char[] charArray = { 'h', 'e', 'l', 'l', 'o' };
        Stack<Character> stack = new Stack<Character>();

        for (char c : charArray) {
            System.out.print((stack.push(c)).toString() + ' ');
        }
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

    }

}

// Output -> 
// h e l l o 
// o l l e h 
