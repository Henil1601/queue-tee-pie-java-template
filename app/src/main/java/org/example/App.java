package org.example;

public class App {
    public static void main(String[] args) {
        // Create a bunch of objects that conform to the Cutie interface
        Puppy puppy = new Puppy();
        Puppy puppy2 = new Puppy();
        Puppy puppy3 = new Puppy();

        // Create the queue
        QueueTees queue = new QueueTees();

        // Initial size
        System.out.println("Initial queue size: " + queue.size());

        // Enqueue puppies
        queue.enqueue(puppy);
        queue.enqueue(puppy2);
        queue.enqueue(puppy3);

        // After enqueuing
        System.out.println("Queue size after adding cuties: " + queue.size());

        // Dequeue and print descriptions
        System.out.println("Dequeued: " + queue.dequeue().description());
        System.out.println("Dequeued: " + queue.dequeue().description());
        System.out.println("Dequeued: " + queue.dequeue().description());

        // Final size
        System.out.println("Final queue size: " + queue.size());
    }
}
