import java.util.Scanner;

public class NofChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to count the character");
        String val=sc.nextLine();
        System.out.println("The Number of Character in "+ val +" is "+val.length());
    }
}
