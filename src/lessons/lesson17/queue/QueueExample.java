package lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    static Queue<Integer> myQueue = new LinkedList<>();

    public static void main(String[] args) {
        addMethod(myQueue);
        elementExample(myQueue);
    }

    static void elementExample(Queue<Integer> queue) {
        System.out.println(queue.element());
        showQueue(queue);
    }

    static void peakExample(Queue<Integer> queue) {
        System.out.println(queue.peek());
        showQueue(queue);
    }

    static void offerExample(Queue<Integer> queue,int object) {
        System.out.println("Before deleting with offer method");
        showQueue(queue);
        queue.offer(object);
        System.out.println('\n' + "After deleting with offer method");
        showQueue(queue);
    }

    static void removeByObjectExample(Queue<Integer> queue,int object) {
        System.out.println("Before deleting with remove method");
        showQueue(queue);
        queue.remove(object);
        System.out.println('\n' + "After deleting with remove method");
        showQueue(queue);
    }

    static void removeExample(Queue<Integer> queue) {
        System.out.println("Before deleting with remove method");
        showQueue(queue);
        queue.remove();
        System.out.println('\n' + "After deleting with remove method");
        showQueue(queue);
    }

    static void pollExample(Queue<Integer> queue) {
        System.out.println("Before deleting with poll method");
        showQueue(queue);
        queue.poll();
        System.out.println('\n' + "After deleting with poll method");
        showQueue(queue);
    }

    static void addMethod(Queue<Integer> queue) {
        queue.add(3);
        queue.add(6);
        queue.add(34);
        queue.add(23);
        queue.add(76);
    }

    static void showQueue(Queue<Integer> queue) {
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
    }
}
