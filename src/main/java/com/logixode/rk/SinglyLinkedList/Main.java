package com.logixode.rk.SinglyLinkedList;

/** Class utama dari package SinglyLinkedList
 * @author Rohmad Kurniadi
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);
        
        myList.insertLast(9999);
        
        myList.displayList();
    }
}
// EOF