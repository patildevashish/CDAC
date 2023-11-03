
package linked_list.SinglyLinked;


class Node{
    int data;
    Node next;
}
public class SinglyLinkedList {
    Node head;
    
    void addFirst(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next=head;
        
        head =newNode;  //Shifting of head to new node
    }
    
    void addLast(int val){
        Node newNode = new Node();
        newNode.data = val;
        
        if (head == null) {
            head = newNode;
        } 
        else {
            Node lastNode = head;
            while(lastNode.next !=null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }
    
    void deleteNode(int val){
        if (head.data==val) {
            head = head.next;
        } 
        else {
            Node temp = head;
            while(temp.next != null){
                if (temp.next.data == val) {
                    temp.next = temp.next.next;
                    break;
                } 
                temp = temp.next;
            }
        }
    }
    
    boolean searchNode(int val){
        Node temp = head;
        
        while(temp != null){
            if(temp.data == val)
                return true;
            else
                temp = temp.next;
        }
        return false;
    }
    
    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
        System.out.println("\n****************ADD TO FIRST*****************\n");
        s.addFirst(10);
        s.addFirst(20);
        s.addFirst(30);
        s.addFirst(40);
        s.addFirst(50);
        s.printList();
        
        System.out.println("\n****************ADD TO LAST*****************\n");
        s.addLast(100);
        s.addLast(90);
        s.addLast(80);
        s.printList();
        
        System.out.println("\n****************DELETE NODE*****************\n");
        s.deleteNode(50);
        s.deleteNode(100);
        s.printList();
        
        
        System.out.println("\n****************SEARCH NODE*****************\n");
        System.out.println(s.searchNode(30));
        System.out.println(s.searchNode(3000));
    }
}
