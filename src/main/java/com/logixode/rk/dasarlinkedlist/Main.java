package com.logixode.rk.dasarlinkedlist;

/** Class utama
 * @author Rohmad Kurniadi
 */
public class Main {
    public static void main(String[] args) {
        // membuat beberapa object dari Class Node
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        // menghubungkan antar node
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
        System.out.println(listLength(nodeC));

    }
  
    /** Function untuk menghapus array dengan index pertama
     * @param oNode Node  node saat ini
     * @return panjang data dari Node oNode
     */
    public static int listLength( Node oNode ) {
        int length = 0;
        Node currentNode = oNode;

        while( currentNode != null ) {          
           length++;
           currentNode = currentNode.next;
        }

        return length;
    }
  
}
// EOF