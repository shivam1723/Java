public class RemoveWhtSpace {
    static String removeSpace(char[] arr){
        String val="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '){
                val=val+arr[i];
            }
        }
        return val;
    }
    public static void main(String[] args) {
        String str="   S H I V A M    ";
        str=str.trim();
        char[] arr=str.toCharArray();
        System.out.println(removeSpace(arr));
    }
}
