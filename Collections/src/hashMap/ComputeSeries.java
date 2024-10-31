package hashMap;

import java.util.HashMap;
import java.util.Map;

public class ComputeSeries {
    public static void main(String[] args) {
//        computeifAbsent
//        computeifPresent
//        compute

        Map<String,String> map=new HashMap<>();
        map.put("England", "London");
        map.put("Germany", "Berlin");
        map.put("Norway", "Oslo");
        map.put("USA", "Washington DC");
        map.put("Ukraine",null);

        map.compute("India",(k,v)->"Delhi");
        map.computeIfAbsent("Ukraine",(k)->"kiev");
        map.computeIfPresent("England",(k,v)->v+"("+k+")");
        System.out.println(map);

    }

}
