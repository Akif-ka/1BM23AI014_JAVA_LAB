import java.util.Arrays;

class DynamicQueue<T> {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;

    public DynamicQueue(int initialCapacity) {
        queue = new Object[initialCapacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(T element) {
        if (size == queue.length) {
            resizeQueue();
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = element;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T element = (T) queue[front];
        front = (front + 1) % queue.length;
        size--;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    private void resizeQueue() {
        int newCapacity = queue.length * 2;
        Object[] newQueue = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % queue.length];
        }
        queue = newQueue;
        front = 0;
        rear = size - 1;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % queue.length] + " ");
            }
            System.out.println();
        }
    }
}

public class DynamicQueueDemo {
    public static void main(String[] args) {
        DynamicQueue<Integer> intQueue = new DynamicQueue<>(3);

        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        intQueue.displayQueue();

        intQueue.enqueue(40);
        intQueue.enqueue(50);
        intQueue.displayQueue();

        System.out.println("Dequeued: " + intQueue.dequeue());
        System.out.println("Dequeued: " + intQueue.dequeue());
        intQueue.displayQueue();

        intQueue.enqueue(60);
        intQueue.displayQueue();
    }
}
