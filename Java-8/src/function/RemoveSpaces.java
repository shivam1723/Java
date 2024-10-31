package function;

import java.util.function.Function;


public class RemoveSpaces {
    public static void main(String[] args){
        Function<String,String> func=(a)-> a.replaceAll(" ","");
        System.out.println(func.apply("  Val ue  "));
    }
}
