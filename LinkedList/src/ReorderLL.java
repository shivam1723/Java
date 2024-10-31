
class Node4 {
    int data;
    Node4 next;

    Node4(int data, Node4 next){
        this.data=data;
        this.next=next;
    }
    Node4(int data){
        this.data=data;
        this.next=null;
    }
}

public class ReorderLL {

    static Node4 middle(Node4 head){
        Node4 fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    static Node4 reverse(Node4 head){
        if(head==null || head.next==null){
            return head;
        }
        Node4 prev=null;
        Node4 temp=head;
        Node4 front=head.next;

        while(front!=null){
            prev=temp;
            temp=front;
            front=front.next;
            temp.next=prev;
        }
        head.next=null;
        head=temp;
        return head;
    }

    static Node Merge(Node head,Node mid){
        Node list1=head;
        Node list2=mid;



    }

    public static void printLL(Node4 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        int N = 3;
        Node4 head = new Node4(arr[0]);
        head.next = new Node4(arr[1]);
        head.next.next = new Node4(arr[2]);
        head.next.next.next = new Node4(arr[3]);
        head.next.next.next.next = new Node4(arr[4]);
        head.next.next.next.next.next=new Node4(arr[5]);

        Node4 mid=middle(head);
        Node4 r=reverse(mid.next);

        printLL(r);
    }
}
