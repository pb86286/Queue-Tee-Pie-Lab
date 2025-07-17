package org.example;

import java.util.ArrayList;

public class QueueTees {
    private ArrayList<Cutie> queue;
    private int maxSize;

    public QueueTees(int maxSize) {
        this.queue = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void enqueue(Cutie c) {
        if (queue.size() >= maxSize) {
            System.out.println("Queue is full. Cannot add: " + c.description());
        } else {
            queue.add(c);
            System.out.println("Enqueued: " + c.description());
        }
    }

    public Cutie dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return null;
        } else {
            Cutie removed = queue.remove(0);
            System.out.println("Dequeued: " + removed.description());
            return removed;
        }
    }

    public int size() {
        System.out.println("Current queue size: " + queue.size());
        return queue.size();
    }
}