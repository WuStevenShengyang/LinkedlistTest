package dataStructure;

public class LinkedList {
    private int size;
    private Node head;

    public LinkedList() {
        this.size = 0;
        this.head = null;
    }

    public void push(String s) {
        Node newnode = new Node();
        newnode.next = this.head;
        newnode.value = s;
        
        this.head = newnode;
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public String get(int index) {
        Node curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.value;
    }
    
    public void remove(int index) {
        Node curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }

    private static class Node {
        public Node next;
        public String value;

    }

}
