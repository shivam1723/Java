public class RotationString {
//    RotationString
    public static void main(String[] args) {
        String s="ABCDA";
        String s2="BCDAA";

        String temp=s.concat(s2);
        if(temp.contains(s2)){
            System.out.println(s2 +" is rotation of "+s);
        }else{
            System.out.println(s2 +"is Not rotation of "+s);
        }
    }
}
