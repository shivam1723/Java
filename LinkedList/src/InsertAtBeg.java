public class InsertAtBeg {
    static Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    static void addNode(int data){
        if(head==null){
            head=new Node(data,null);
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=new Node(data,null);
    }

    static void insertAtBeg(int data){
        if(head==null){
            head=new Node(data,null);
        }

        Node temp=new Node(data,head);
        head=temp;
    }

    static void printLL(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) {
        addNode(10);
        addNode(20);
        addNode(30);
        addNode(40);
        insertAtBeg(10);
        printLL();
    }
}
