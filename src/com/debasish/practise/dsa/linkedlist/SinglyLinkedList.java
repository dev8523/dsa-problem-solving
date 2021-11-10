package com.debasish.practise.dsa.linkedlist;

public class SinglyLinkedList {
    private final SinglyLinkedListNode head = null;

    public static void main(String[] args) {
        SinglyLinkedListNode linkedListNode = new SinglyLinkedListNode(12);
        SinglyLinkedListNode linkedListNode1 = new SinglyLinkedListNode(25);
        SinglyLinkedListNode linkedListNode2 = new SinglyLinkedListNode(19);
        printLinkedList(linkedListNode);
    }

    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Print the linkedlist: " + head);
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode insertableNode = new SinglyLinkedListNode(data);
        insertableNode.next = llist;
        return insertableNode;
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode insertableNode = new SinglyLinkedListNode(data);
        if (head == null) {
            head = insertableNode;
        } else {
            SinglyLinkedListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = insertableNode;
        }
        return head;
    }
}
