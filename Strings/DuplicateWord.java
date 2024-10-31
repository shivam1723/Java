import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    public static void main(String[] args) {
        String s="Hello i am here Hello";
        String[] val=s.split(" ");

        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<val.length;i++){
            String c=val[i];
            if(map.containsKey(c)){
                if(map.get(c)>1){
                    int value=map.get(c);
                    map.put(c,++value);
                    continue;
                }
                int value=map.get(c);
                map.put(c,++value);
                System.out.println(c + " is Duplicate element");
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);

    }
}
