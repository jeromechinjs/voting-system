package adt;
/**
 *
 * @author Bryan Wong
 */
public class testSortArrayStack<T> extends ArrayStack<T> {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(2);
        stack.push(12);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(70);

        System.out.print("Before sort: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        stack.push(2);
        stack.push(12);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(70);
        
        ArrayStack<Integer> sortedStack = new ArrayStack<Integer>();
        sortedStack = stack.sortDescending(stack);
        
        System.out.print("After sort: ");
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
        }
    }
}
