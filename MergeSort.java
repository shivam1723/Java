public class MergeSort {

    public static void Merge(int[] arr,int low,int mid,int high) {
        int left=low;
        int right=mid+1;
        int[] temp=new int[high-low+1];
        int k=0;
        while(left<=mid && right<=high) {
            if(left<right){
                temp[k]=arr[left];
                k++;
                left++;
            }
            else{
                temp[k++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[k++]=arr[left++];
        }
        while(right<=high){
            temp[k++]=arr[right++];
        }
        for(int i=0;i<=high-low;i++){
            arr[low+i]=temp[i];
        }
    }

    public static void MergeSort(int[] arr,int low,int high) {
        if(low>=high) {
            return ;
        }
        int mid=low+(high-low)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1,high);
        Merge(arr,low,mid,high);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        MergeSort(arr,0,arr.length-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
