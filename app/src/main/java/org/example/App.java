package org.example;

public class App {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        QueueTees queue = new QueueTees(3); 

        queue.size(); 

        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        queue.size(); 

        queue.dequeue(); 
        queue.dequeue(); 
        queue.dequeue(); 

        queue.dequeue(); 
    }
}