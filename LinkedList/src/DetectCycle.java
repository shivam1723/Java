
//```````````````````O(n) complexity ````````````````````````//

class Node{
    int data;
    Node4 next;

    Node(int data, Node4 next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class DetectCycle {
    static boolean detectCycle(Node4 head){
        Node4 fast=head;
        Node4 slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Node4 head = new Node4(1);
        Node4 second = new Node4(2);
        Node4 third = new Node4(3);
        Node4 fourth = new Node4(4);
        Node4 fifth = new Node4(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = null;

        // Check if there is a loop
        // in the linked list
        if (detectCycle(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

    }

}
