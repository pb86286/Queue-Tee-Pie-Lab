package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testQueueEnqueueAndSize() {
        QueueTees queue = new QueueTees(2);
        assertEquals(0, queue.size());

        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();

        queue.enqueue(puppy);
        assertEquals(1, queue.size());

        queue.enqueue(kitty);
        assertEquals(2, queue.size());

        // Attempt to enqueue beyond max capacity
        PygmyMarmoset marmoset = new PygmyMarmoset();
        queue.enqueue(marmoset);
        assertEquals(2, queue.size()); // should remain unchanged
    }

    @Test
    void testQueueDequeueOrder() {
        QueueTees queue = new QueueTees(3);

        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        Cutie first = queue.dequeue();
        assertEquals("A little puppy with big, sad eyes", first.description());

        Cutie second = queue.dequeue();
        assertEquals("A tiny kitten that purrs loudly", second.description());

        Cutie third = queue.dequeue();
        assertEquals("A pygmy marmoset clinging to a branch", third.description());

        Cutie empty = queue.dequeue();
        assertNull(empty);
    }
}