package java11_stack_queue.exercise.implemention_use_ring_link;

public class Solution<E> {
    public class Node {
        int data;
        Node link;
    }
    public class Queue{
        Node front;
        Node rear;
    }

    void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = q.rear = temp;
        } else {
            q.rear.link = temp;
            q.rear = temp;
            q.rear.link = q.front;
        }
    }
}
