//Anonymous inner Class that extends another class
class val{
    void fun(){
        System.out.println("Lets enjoy");
    }

}

public class Main {
    public static void main(String[] args) {
//        Anonymous Inner class
        val v=new val(){
            void fun(){
                System.out.println("Lets enjoy more");
            }
        };
        v.fun();

        val v1=new val();
        v1.fun();
        System.out.println("Hello world!");
    }
}