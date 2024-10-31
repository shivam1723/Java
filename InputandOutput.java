import java.util.Scanner;

public class InputandOutput{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name=scanner.nextLine();
        System.out.println("Hello "+ Name+" !");
    }
}