import java.util.Scanner;

public class PunctCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the String");
        String str="Good Morning!, Let's";
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':'){
                count++;
            }
        }
        System.out.println("The count of Punctuation is "+ count);
    }
}
