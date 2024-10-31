public class RotationString {
    static boolean isRotationString(@org.jetbrains.annotations.NotNull String a, String b){
        String temp=a.concat(a);
        if(temp.contains(b)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s="ABCDAB";
        String s1="ABABCD";

        System.out.println(s+" is Rotation of "+s1+" "+isRotationString(s,s1));
    }
}
