import java.awt.image.ImageProducer;
import java.util.*;

public class Occurence {
    public static void main(String[] args) {
        String s="helloiaamhere";
        Map<Character,Integer> map=new HashMap<>();

        int cnt=0;
        int minCnt=Integer.MAX_VALUE;
        Character ans=0;
        Character minAns=0;
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(map.containsKey(c)){
                int val=map.get(c);
                map.put(c,++val);
            }else{
               map.put(s.charAt(i),1);
            }

            if(cnt<map.get(c)){
                ans=c;
                cnt=map.get(c);
            }

        }

        for (Map.Entry<Character, Integer> set : map.entrySet()){
            Character c=set.getKey();
            if(minCnt>set.getValue()){
                minAns=c;
                minCnt= set.getValue();
            }
        }

        System.out.println("Max occuring Character is "+ ans);
        System.out.println("Min occuring Character is "+minAns);
        System.out.println(map);

    }
}
