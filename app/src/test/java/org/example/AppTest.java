package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testQueueEnqueueDequeue() {
        QueueTees queue = new QueueTees();
        Puppy puppy = new Puppy();

        assertEquals(0, queue.size());

        queue.enqueue(puppy);
        assertEquals(1, queue.size());

        Cutie dequeued = queue.dequeue();
        assertNotNull(dequeued);
        assertEquals("A little puppy with big, sad eyes", dequeued.description());
        assertEquals(0, queue.size());
    }

    @Test
    void testQueueFull() {
        QueueTees queue = new QueueTees();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(new Puppy());
        }
        assertEquals(10, queue.size());

        // This should not change the size
        queue.enqueue(new Puppy());
        assertEquals(10, queue.size());
    }

    @Test
    void testQueueEmpty() {
        QueueTees queue = new QueueTees();
        Cutie result = queue.dequeue();
        assertNull(result);
    }
}
