public class Typecastconv {
    public static void main(String[] args){
        // int to float 
        int r=10;
        float s=(float)r;
        System.out.println("Int to Float "+ s);
        // float to String conv 
        float a=1.25f;
        String b=Float.toString(a);
        int c=(int)a;
        System.out.println("String val "+ b);
        System.out.println("Float to int "+ c);
        // Int to String
        int x=10;
        String y=Integer.toString(x);
        System.out.println("Int to String "+ y);
    }
}
