interface Stack {
    void push(int element);
    int pop();
    boolean isEmpty();
    int size();
}

class DynamicLengthStack implements Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public DynamicLengthStack() {
        this.capacity = 10;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            capacity *= 2;
            int[] newStackArray = new int[capacity];
            System.arraycopy(stackArray, 0, newStackArray, 0, stackArray.length);
            stackArray = newStackArray;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

public class DynamicLengthStackDemo {
    public static void main(String[] args) {
        Stack stack = new DynamicLengthStack();
        performStackOperations(stack);
    }

    public static void performStackOperations(Stack stack) {
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
