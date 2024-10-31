import java.util.Arrays;
import alphabets.Alphabets;
public class Anagram {
    public static void main(String[] args) {
        String str="gram";
        String str1="arm";
        char[] strArray=str.toCharArray();
        char[] strArray1=str1.toCharArray();

        Arrays.sort(strArray1);
        Arrays.sort(strArray);
        int flag=1;
        if(strArray.length==strArray1.length){
            for(int i=0;i<strArray.length;i++){
                if(strArray[i]!=strArray1[i]){
                    System.out.println("Not Anagram");
                    flag=0;
                    break;
                }
            }
        }else{
            flag=0;
            System.out.println("Not Anagram");
        }

        if(flag==1){
            System.out.println("Anagram");
        }

    }
}
