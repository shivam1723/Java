package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();

        list.add(new Student("Shivam",22));
        list.add(new Student("Aman",15));
        list.add(new Student("Yugal",33));
        list.add(new Student("Piyush",10));

        System.out.println("Before using Comparator");
        System.out.println(list);

        System.out.println("After using Comparator");
        Collections.sort(list,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                return s1.getAge()-s2.getAge();
            }
        });

        System.out.println(list);
    }
}
