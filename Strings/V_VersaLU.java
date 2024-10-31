public class V_VersaLU {
    static String LowerUppercase(String str){

        String s="";
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i);
            if(Character.isLowerCase(temp)){
                temp=Character.toUpperCase(temp);
                s+=temp;
            }else{
                temp=Character.toLowerCase(temp);
                s+=temp;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s="GeEkSfOrGeEkS VaM";
        s=LowerUppercase(s);
        System.out.println(s);
    }
}
