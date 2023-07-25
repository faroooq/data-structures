package com.data.linkedlist;

/* 
    A linked list is a linear data structure 
    that consists of a group of nodes which 
    together represent a sequence.
    Each node contains data and a reference 
    (in other words, a link) to the next node 
    in the sequence.
*/
public class LinkedList {
    /*
     * Below Node class is used only by the
     * LinkedList class. So we are adding the
     * Node class inside LinkedList class, so that
     * we can access its private fields.
     */
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        var node = new Node(item);

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }
}
