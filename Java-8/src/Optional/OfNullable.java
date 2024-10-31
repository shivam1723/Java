//package Optional;
//
//import java.util.Optional;
//import java.util.function.Supplier;
//
//public class OfNullable {
//    public static void main(String[] args) {
//        System.out.println("Of nullable of Optional");
//        Optional<String> val=Optional.ofNullable("A");
////        System.out.println(val.get()); Exception in thread "main" java.util.NoSuchElementException
////        if(val.isPresent()){
////            System.out.println("Yes");
////        }else{
////            System.out.println("false");
////        }
//
//        String nothingFound = val.orElse("Nothing found");
////        Supplier<Integer> n=()-> true;
//        String s = val.orElseGet(() -> "Get by Supplier");
//        Optional<String> s1 = val.filter((v) -> v.charAt(0) == 'A');
//        String c=s1.get();
//        System.out.println();
//        System.out.println(s);
//
//        String
//        Optional.map()
//    }
//}
