import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        String s="AAABBBBC";
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c)>1){
                    int val=map.get(c);
                    map.put(c,++val);
                    continue;
                }
                int val=map.get(c);
                map.put(c,++val);
                System.out.println(c + " is Duplicate element");
            }
            else{
                map.put(c,1);
            }
        }
    }
}
