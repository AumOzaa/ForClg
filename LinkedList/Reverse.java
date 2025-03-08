package Lecture;

public class LinkedListLL {
    private Node head;
    private Node tail;
    private int size;

    public void display() {
        Node node = head;

        while (node != null) {
            System.out.print(node.value+"-->");
            node = node.next;
        }
        System.out.print("null");
    }

    public void reverse(Node node) { // Through recursion Pretty simple, no need of an explanation.
        if(node == tail) {
            head = tail; // transferring the head to tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null; // Pointing to null, so for first element the next element is null;
    }

    public void add(int value) {
        Node node = new Node(value);
        if(size == 0) {
              head = node;
              tail = node;
              size++;
              return;
        }
        tail.next = node;
        tail = node;
        size+=1;
    }

    public Node getHead() {
        return head;
    }

    public void reverseW(Node node) { // through iterative approach

        if (size == 0) {
            head = head;
            return;
        }
        Node previous = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = previous;
            previous = present;
            present = next;

            if(next != null){
                next =next.next;
            }
        }
        head = previous;
    }

    class Node{
        Node next;
        int value;

        Node(int value) {
            this.value=value;
        }
    }
}
