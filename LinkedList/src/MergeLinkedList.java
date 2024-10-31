class Node1 {
    int data;

    Node1 next;

    Node1(int data1, Node1 next1) {
        data = data1;
        next = next1;
    }

    Node1(int data1) {
        data = data1;
        next = null;
    }
}


public class MergeLinkedList {

    static Node1 sortTwoLinkedLists(Node1 list1,Node1 list2){
        Node1 dummpyNode=new Node1(-1);
        Node1 temp=dummpyNode;

        while (list1!=null && list2!=null){

            if(list1.data<list2.data){
                temp.next=list1;
                list1=list1.next;
            }else{
                temp.next=list2;
                list2=list2.next;
            }

            temp=temp.next;

        }

        if(list1!=null){
            temp.next=list1;
        }else{
            temp.next=list2;
        }

        return dummpyNode;

    }

    static void printLinkedList(Node1 head) {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node1 list1 = new Node1(1);
        list1.next = new Node1(3);
        list1.next.next = new Node1(5);

        Node1 list2 = new Node1(2);
        list2.next = new Node1(4);
        list2.next.next = new Node1(6);

        System.out.print("First sorted linked list: ");
        printLinkedList(list1);

        System.out.print("Second sorted linked list: ");
        printLinkedList(list2);

        Node1 mergedList = sortTwoLinkedLists(list1, list2);

        System.out.print("Merged sorted linked list: ");
        printLinkedList(mergedList);
    }
}
