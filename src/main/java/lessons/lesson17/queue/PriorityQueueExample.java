package lessons.lesson17.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Бананы");
        queue.add("Апельсины");
        queue.add("Мандарины");
        queue.add("Яблоки");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println(queue.size());
    }
}