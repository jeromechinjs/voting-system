package adt;
/**
 *
 * @author Bryan Wong
 */
public class testSortArrayStack<T> {
    public static void main(String[] args) {
        StackInterface<Integer> stack = new ArrayStack<>();

        stack.push(2);
        stack.push(12);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(7);

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
        stack.push(7);
        
        StackInterface<Integer> sortedStack = new ArrayStack<Integer>();
        sortedStack = stack.sortDescending(stack);
        
        System.out.print("After sort: ");
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
        }
    }
}
