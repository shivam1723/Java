package arrayList;

import java.util.*;

public class LL {
    public static void main(String[] args) {

//        Write a Java program to append the specified element to the end of a linked list.
        LinkedList<String> list=new LinkedList<>();
        list.add("Blue");
        list.add("Black");
        list.add("Violet");
        list.add("Pink");
        System.out.println(list);

//        Write a Java program to iterate through all elements in a linked list.

        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

//      4. Write a Java program to iterate a linked list in reverse order.
        Iterator<String> iterator=list.descendingIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        Write a Java program to insert the specified element at the specified position in the linked list.

        list.set(1,"inseted Val");
        list.addFirst("First");
        list.addLast("Last");
        System.out.println("The last element of "+list.getFirst());
        System.out.println("The Last element of "+list.getLast());

        list.clear();
        Collections.swap(list,1,list.size()-1);

        Collections.shuffle(list);


    }
}
