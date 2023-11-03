
package linked_list.CircularDoubly;

class Node{
    Node prev;
    int data;
    Node next;
}
public class CircularDoublyDemo {
    Node head;
    void addFirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        
        if (head==null) {
            newNode.next=head;
            head = newNode;
        }
        else{
            Node last=head;
            while (last.next!=head) {                
                last = last.next;
            }
            last.next= newNode;
            newNode.next = head;
            head = newNode;
        }
        
    }
    void printList(){
        System.out.println("Forward Movement...");
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.println(temp.data);
            if(temp.next==null){
                last=temp;
            }
            temp=temp.next;
        }
        System.out.println("Backward Movement...");
        while(last!=null){
            System.out.println(last.data);
            last=last.prev; 
        }
    }
    
    
    public static void main(String[] args) {
        CircularDoublyDemo cd = new CircularDoublyDemo();
        cd.addFirst(10);
        cd.addFirst(20);
        
        cd.printList();
    }
}
