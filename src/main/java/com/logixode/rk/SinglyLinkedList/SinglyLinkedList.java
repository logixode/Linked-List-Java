package com.logixode.rk.SinglyLinkedList;

/** Proses utama SinglyLinkedList
 * @author Rohmad Kurniadi
 */
public class SinglyLinkedList {
    private Node first;
    
    // -- constructor yang tidak terpakai --
    // public SinglyLinkedList() {}
    
    /** Function untuk cek kondisi jika first kosong
     * @return boolean true atau false
     */
    public boolean isEmpty() {
        return(first == null);
    }
    
    /** Method untuk menambahkan data ke awal List
     * @param data int  value untuk ditambahkan
     * @return void
     */
    public void insertFirst( int data ) {
        Node newNode    = new Node();
        newNode.data    = data;
        newNode.next    = first;
        first           = newNode;
    }
    
    /** Method untuk manghapus data yang berada di awal List
     * @return Node alamat memory variable fisrt
     */
    public Node deleteFirst() {
        Node temp   = first;
        first       = first.next;
        
        return temp;
    }
    
    /** Method untuk menampilkan List
     * @return void
     */
    public void displayList() {
        System.out.println("List (first --> last)");
        Node current = first;
        
        while( current != null ) {
            current.displayNode();
            current = current.next;
        }
        
        System.out.println();
    }
    
    /** Method untuk menambahkan data ke akhir list
     * @param data int  value untuk ditambahkan
     * @return void
     */
    public void insertLast( int data ) {
        Node current = first;
        
        while( current.next != null ) {
            current = current.next;
        }
        
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
}
// EOF