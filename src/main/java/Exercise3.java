import java.util.Stack;

public class Exercise3 {
    public static <E> void reverse(Stack<E> stack) {
        if (stack.isEmpty()) {
            return;
        }
        E element = stack.pop();
        reverse(stack);
        insertAtBottom(stack, element);
    }

    public static <E> void insertAtBottom(Stack<E> stack, E element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        E topElement = stack.pop();
        insertAtBottom(stack, element);
        stack.push(topElement);
    }
}
