public class Reverse {
    static Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int data, Node next){
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

    static void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prev=null;
        Node temp=head;
        Node front=head.next;

        while(front!=null){
            prev=temp;
            temp=front;
            front=front.next;
            temp.next=prev;
        }
        head.next=null;
        head=temp;
    }

    static void printLL(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

//    static void delete(int data){
//        if(head==null){
//            System.out.println("There is nothing to delete");
//            return;
//        }
//        if(head.data==data){
//            head=head.next;
//            return;
//        }
//
//        Main.Node current =head;
//
//        while(current.next!=null){
//            if(current.next.data==data){
//                current.next=current.next.next;
//                return;
//            }
//            current=current.next;
//        }
//        if(current.next==null){
//            System.out.println("This element cannot be deleted as it does not exist");
//        }
//
//    }

    public static void main(String[] args) {
        addNode(10);
        addNode(20);
        addNode(30);
        addNode(40);
        addNode(50);
        reverse();
        printLL();
    }
}
