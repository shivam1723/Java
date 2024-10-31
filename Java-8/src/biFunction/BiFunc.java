package biFunction;

import java.util.function.*;
public class BiFunc {
    public static void main(String[] args) {
        BiFunction<String,String,String> val=(a,b)->a+" "+b;
        System.out.println(val.apply("Shivam","Pandey"));
    }
}
