public class SmaLar {
    public static void main(String[] args) {
        String s="Hello i am Here";
        String[] arr=s.split(" ");

        int cnt=0;
        String val=" ";
        int minCnt=Integer.MAX_VALUE;
        String min_str=" ";

        for(int i=0;i<arr.length;i++){
            if(cnt<arr[i].length()){
                val=arr[i];
                cnt=arr[i].length();
            }
            if(minCnt>arr[i].length()){
                min_str=arr[i];
                minCnt=arr[i].length();
            }
        }
        System.out.println(val);
        System.out.println(min_str);
    }
}
