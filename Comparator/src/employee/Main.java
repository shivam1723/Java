package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Emp> list=new ArrayList<Emp>();
        list.add(new Emp("Shivam",10000));
        list.add(new Emp("Tanmay",142220));
        list.add(new Emp("Atul",12500));
        list.add(new Emp("Bunty",10000));

        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                int val=o1.getSalary()-o2.getSalary();
                if(val==0){
                    return o1.getName().compareToIgnoreCase(o2.getName());
                }
                return val;
            }
        });

        System.out.println(list);
    }
}
