import java.security.spec.ECField;

class MyThread implements Runnable{
    public void run(){
        System.out.println("Outside Finally");
    }
}
class CustomException extends Exception{
    CustomException(String Errormsg){
        super(Errormsg);
    }
}
public class Main {
    public static void main(String[] args)
    {
        try{
//            int a=10/0;
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Inside nested Try Catch");
            }
            throw new CustomException("Exception");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
//            System.exit(0);
            System.out.println("finally");
        }
        System.out.println("Hello");
    }
}