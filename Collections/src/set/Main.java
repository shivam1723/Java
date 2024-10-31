package set;

import com.sun.source.tree.Tree;

import java.net.Inet4Address;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashSet<Integer> set=new HashSet<>();
////        Set<Integer> set1=new LinkedHashSet<>();
////        SortedSet<Integer> set3=new TreeSet<Integer>();
////        Queue<Integer> q=new PriorityQueue<Integer>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        set.add(6);
////        System.out.println(set);
//////        Iteration
////        Iterator itr=set.iterator();
////        while(itr.hasNext()){
////            System.out.println(itr.next());
////        }
////        System.out.println(set.size());
////        set.clear();
//        set.isEmpty();
//        HashSet<Integer> set1;
//        set1=(HashSet<Integer>) set.clone();
//        System.out.println(set1);
////        Integer[] arr=new Integer[set1.size()-1];
////        set.toArray(arr);
//        Integer[] new_array = new Integer[set1.size()];
//        set1.toArray(new_array);
//        System.out.println();
//        for (Integer i : new_array) {
//            System.out.println(i);
//        }
////        System.out.println(set1);
////        set1.add(7);
////        System.out.println(set1);
//
//        TreeSet<Integer> t=new TreeSet<>(set);
//        System.out.println(t);
//
//        HashSet<Integer> set2=new HashSet<Integer>();
//        set2.add(1);
//        set2.add(5);
//        set2.add(4);
//        set2.retainAll(set1);
//        System.out.println(set1);
//
//        ArrayList<String> value=new ArrayList<>();
//        for(Integer val:set){
//            value.add(set2.contains(val) ? "Yes":"oh! No");
//        }
//        System.out.println(value);
//
//

        TreeSet t=new TreeSet();
        t.add(new StringBuffer("Shivam"));
        t.add(new StringBuffer("Aman"));
        t.add(new StringBuffer("Akash"));
        t.add(new StringBuffer("Deepak"));
        System.out.println(t);

    }
}
