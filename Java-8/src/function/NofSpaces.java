package function;

import java.util.function.Function;

public class NofSpaces {
    public static void main(String[] args) {
        Function<String,Integer> count=(a)->a.length()-a.replaceAll(" ","").length();
        int val=count.apply(" Value  ");
    }
}
