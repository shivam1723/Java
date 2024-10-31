package biFunction;
import java.util.function.BiPredicate;
class BiPredicate1 {
    public static void main(String[] args) {
        BiPredicate<String,String> bi=(a,b)->a==b;
        boolean bn=bi.test("Shivam","Shivam");
        System.out.println(bn);
    }
}
