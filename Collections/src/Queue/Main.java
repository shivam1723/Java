package Queue;

//class MyThread extends Thread{
//    public void start(){
//        super.start();
//        System.out.println("Start Method");
//    }
//
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("Child run method");
//        }
//    }
//}

class MyRunnable implements Runnable{
    public void run(){
        MyRun myRun=new MyRun();
        Thread t=new Thread(myRun);
        try{
            t.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Run method");
    }
}
class MyRun implements Runnable{
    public void run(){
        System.out.println("Second Run Method");
    }
}
public class Main {
    public static void main(String[] args) {
//        MyThread t=new MyThread();
//        t.start();
//        try{
//            t.start();
//        } catch (IllegalThreadStateException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Main Thread");

        MyRunnable myRunnable=new MyRunnable();
        Thread t=new Thread(myRunnable);
        MyRun myRun=new MyRun();
        Thread t1=new Thread(myRun);
        t.start();
//        try{
//            t.join();
//        }catch(InterruptedException e){
//            System.out.println("Exception");
//        }
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
