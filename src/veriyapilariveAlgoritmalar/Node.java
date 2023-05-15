package veriyapilariveAlgoritmalar;
import java.util.Scanner;
public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;

    Queue() {
        front = null;
        rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " kuyruğa eklendi.");
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Kuyruk boş!");
            return -1;
        }

        int removedData = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return removedData;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Kuyruk boş!");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

