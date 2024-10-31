
class Node2 {
    public int data;
    public Node2 next;

    // Constructor for Node with data and next node
    public Node2(int data1, Node2 next1) {
        data = data1;
        next = next1;
    }

    // Constructor for Node with only data (next set to null)
    public Node2(int data1) {
        data = data1;
        next = null;
    }
}

public class DeleteNthNode {

    static Node2 DeleteNthNodefromEnd(Node2 head, int n){
        Node2 slow=head;
        Node2 fast=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        Node2 delNode=slow.next;
        slow.next=slow.next.next;
        delNode=null;
        return head;
    }

    public static void printLL(Node2 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int N = 3;
        Node2 head = new Node2(arr[0]);
        head.next = new Node2(arr[1]);
        head.next.next = new Node2(arr[2]);
        head.next.next.next = new Node2(arr[3]);
        head.next.next.next.next = new Node2(arr[4]);
        head.next.next.next.next.next=new Node2(arr[5]);

        head = DeleteNthNodefromEnd(head, N);
        printLL(head);
    }
}

