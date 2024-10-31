public class InsertAtPosition {
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

    static void printLL(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    static void insert(int data,int position){
        if(position==1){
            if(head==null){
                head=new Node(data,null);
                return;
            }
            Node temp=new Node(data,null);
            temp.next=head;
            head=temp;
            return;
        }

        Node current=head;
        for(int i=1;i<position-1;i++){
            if(current.next==null){
                System.out.println("Position is out of Linked List index");
                return;
            }
            current=current.next;
        }

        Node temp=new Node(data,null);
        temp.next=current.next;
        current.next=temp;
    }
    public static void main(String[] args) {

        insert(10,1);
        insert(30,2);
        insert(20,2);
        printLL();
    }

}
