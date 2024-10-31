//Anonymous inner class implementing interface
public class Main {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Inside Anonymous Class");
                }
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}

            }
        };

        r.run();

        for(int  i=0;i<10;i++){
            System.out.println("Outside Anonymous inner Class");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}