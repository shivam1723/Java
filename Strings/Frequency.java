import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String s="shivamm";
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(map.containsKey(c)){
                int val=map.get(c);
                map.put(c,++val);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
