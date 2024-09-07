import java.util.*;    //to find the middle node of a linkedlist.
class Node {           // tortoise and hare algorithm
    int data; 
    Node next;     
    Node(int data, Node next) {
        this.data = data;
        this.next = next;}
    Node(int data) {
        this.data = data;
        this.next = null;
    }}
public class FindMiddleOfLinkedList {
    static Node findMiddle(Node head) {
        Node slow = head; 
        Node fast = head;   
        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;  
            slow = slow.next;        
        }
        return slow;  
    }
    public static void main(String[] args) {
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middleNode = findMiddle(head);
        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);
    }
}
