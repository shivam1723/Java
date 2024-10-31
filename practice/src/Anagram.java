import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(String s,String s1){
        char[] arr=s.toCharArray();
        char[] arr1=s1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(arr.length==arr1.length){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=arr1[i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s="listen";
        String s1="silent";

        System.out.println(isAnagram(s,s1));
    }
}
