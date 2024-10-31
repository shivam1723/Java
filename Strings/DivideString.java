public class DivideString {
    public static void main(String[] args) {
        String str="Hello    this is Shivam Pandey";
        int n=5;
        if(str.length()%n!=0){
            System.out.println("Can't be divided into equal parts");
        }else{
            int partSize=str.length()/n;

            for(int i=0;i<str.length();i++){
                if(i%partSize==0){
                    System.out.println("");
                }
                System.out.print(str.charAt(i));
            }
        }



    }
}
