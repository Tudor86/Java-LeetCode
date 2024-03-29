package com.company;


public class RevLinkedList {

    Node head;

     class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void add(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = newNode;
            return;
        }
        Node ult = head;
        while(ult.next != null){
            ult = ult.next;
        }
        ult.next = newNode;
    }
    Node reverse(Node node){

        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printList(Node node)
    {
        while(node != null){
        System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
}

/*        RevLinkedList lista = new RevLinkedList();
        lista.add(3);
        lista.add(2);
        lista.add(1);
        lista.head = lista.reverse(lista.head);
        lista.printList(lista.head);*/
