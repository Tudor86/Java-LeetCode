package com.company;

public class Main {
    public static void main(String[] args) {


    RevLinkedList lista = new RevLinkedList();

    lista.add(1);
    lista.add(2);
    lista.add(15);

    lista.printList(lista.head);

    lista.head = lista.reverse(lista.head);
    lista.printList(lista.head);








    }
}