public class SmlaPalindrome {

    static boolean checkPalindrome(String s){
        int n=s.length();
        s=s.toLowerCase();
        for(int i=0;i<n;i++,n--){
            if(s.charAt(i)!=s.charAt(n-1)){
                return  false;
            }
        }
        return true;
    }

    static void lengthPalindrome(String[] s,int n){
        int count=0;
        String largest="",smallest="";

        for(int i=0;i<n;i++){
            if(checkPalindrome(s[i])){
                count++;
                if(count==1){
                    smallest=largest=s[i];
                }
                else{
                    if(smallest.length()>s[i].length()){
                        smallest=s[i];
                    }
                    if (largest.length()
                            < s[i].length())
                        largest = s[i];
                }
            }
        }
        if (count == 0)

            System.out.println("No palindrome found");

        else {

            System.out.println("Smallest palindrome: "
                    + smallest);
            System.out.println("Biggest palindrome: "
                    + largest);
        }

    }

    public static void main(String[] args) {
        String s="Wow Madam is driving racecar";
        String[] arr=s.split(" ");


        lengthPalindrome(arr,arr.length);
    }
}
