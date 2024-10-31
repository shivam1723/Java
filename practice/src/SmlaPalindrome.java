public class SmlaPalindrome {
    static boolean isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<n;i++,n--){
            if(s.charAt(i)!=s.charAt(n-1)){
                return false;
            }
        }
        return true;
    }

    static void subString(String[] arr,int n){
        int cnt=0;
        String largest="",smallest="";

        for(int i=0;i<n;i++){
            if(isPalindrome(arr[i])){
                cnt++;
                if(cnt==1){
                    smallest=largest=arr[i];
                }else{
                    if(smallest.length()>arr[i].length()){
                        smallest=arr[i];
                        System.out.println(smallest);
                    }
                    if(largest.length()<arr[i].length()){
                        largest=arr[i];
                    }
                }
            }
        }
        if(cnt==0){
            System.out.println("No palindrome found");
        }else{
            System.out.println("Largest substring is "+largest);
            System.out.println("Smallest substring is "+smallest);
        }
    }

    public static void main(String[] args) {
        String s="Wow Madam is driving racecar";
        s=s.toLowerCase();
        String[] arr=s.split(" ");


        subString(arr,arr.length);
    }

}
