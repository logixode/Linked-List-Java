package com.logixode.rk.SinglyLinkedList;

/** Simulasi kerja Linked List
 * @author Rohmad Kurniadi
 */
public class Node {
    public int data;
    public Node next;
    
    /** Method untuk menampilkan satuan data List
     * @return void
     */
    public void displayNode() {
        System.out.println("\t[ " + data + " ]");
    }
}
// EOF