public class Swap {
    public static void main(String[] args) {
        String s1="Shivam";
        String s2="Shravya";

        String temp=s1+s2;
        s2=temp.substring(0,s1.length());
        s1=temp.substring(s1.length());
        System.out.println(s2);
        System.out.println(s1);

    }
}
