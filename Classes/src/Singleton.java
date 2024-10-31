public final class Singleton {

//    private static Singleton INSTANCE;
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        if(INSTANCE == null) {
//            INSTANCE = new Singleton();
//        }
//
//        return INSTANCE;
//    }
    private static Singleton INSTANCE;
    private Singleton(){

    }
    static{
        INSTANCE=new Singleton();
    }

}

class Singelton1{
    public static void main(String[] args) {
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj.equals(obj1));
    }
}
