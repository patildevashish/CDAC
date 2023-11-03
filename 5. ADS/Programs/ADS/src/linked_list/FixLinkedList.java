
package linked_list;

class Node{
    int data;
    Node next;
}
public class FixLinkedList {
    Node head,middle,Last;
    
    void createList(){
        head = new Node();
        middle = new Node();
        Last = new Node();
        
        head.data = 10;
        middle.data = 20;
        Last.data = 30;
        
        head.next = middle;
        middle.next = Last;
        Last.next = null;
    }
    
    void showList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        FixLinkedList obj = new FixLinkedList();
        obj.createList();
        obj.showList();
    }
}
