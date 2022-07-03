package com.narendra.sheet.linkedlist;

public class ReverseALinkedList {

    public static void main(String[] args) {
        LinkedList1 linkedList1 = new LinkedList1();
        linkedList1.head = new Node(1);
        linkedList1.head.next = new Node(2);
        linkedList1.head.next.next = new Node(3);
        linkedList1.head.next.next.next = new Node(4);
        printList(linkedList1.head);
        Node output = reverseLinkedList(linkedList1.head);
        printList(output);
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        // printList(head);
        return head;

    }


    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
