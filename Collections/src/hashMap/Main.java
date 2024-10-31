package hashMap;

import java.util.*;

public class Main{

    public static void main(String[] args) {
//        IdentityHashMap<String,Integer> map=new IdentityHashMap<>();
//        String s=new String("key");
//        String s1="key";
//        System.out.println(s.hashCode()+" "+s1.hashCode());
//        map.put(s,null);
//        s="value";
//        System.out.println(s.hashCode());
//        map.put("key",1);
//        System.out.println(map);
//        String s3="Shivam";
//        for(int i=0;i>s3.length();i++){
//            System.out.println("Shivam");
//        }
////        val();
////        for(int i=s3.length();i>0;i++){
////            System.out.println("Shivam");
////        }
//
//        StringBuffer sb=new StringBuffer();
//        StringBuilder stringBuilder=new StringBuilder();
//        System.out.println(sb.capacity());
//        System.out.println(stringBuilder.capacity());

        HashMap<String,String> map= new HashMap<>();
        map.put("England", "London");
        map.put("Germany", "Berlin");
        map.put("Norway", "Oslo");
        map.put("USA", "Washington DC");
        map.put("Ukraine",null);


        System.out.println(map.computeIfPresent("Eng",(k,v)->v+"("+k+")"));
        System.out.println(map.computeIfAbsent("Ukraine",(k)->"kiev"));
        System.out.println(map.compute("India",(k,v)->"Delhi"));
        System.out.println(map.entrySet());
    }
}
