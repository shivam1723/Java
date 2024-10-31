package Optional;

import java.util.Optional;

public class Nullof {
    public static void main(String[] args) {

        Optional<String> opt=Optional.of(null);
        /**
         * Remember Optional.of cannot contain null value
         * It when null is present throws null pointer exception
         */

//        System.out.println(opt.get()); Exception in thread "main" java.lang.NullPointerException
//        String value = opt.orElse("Value");
        if(opt.isPresent()){

        }else{
            System.out.println("null");
        }

    }
}

