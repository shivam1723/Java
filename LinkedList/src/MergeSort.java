public class MergeSort {
    static void mergeSort(int[] arr,int len){
        if(len<2){
            return;
        }
        int mid=len/2;
        int[] l=new int[mid];
        int[] r=new int[len-mid];

        for(int i=0;i<mid;i++){
            l[i]=arr[i];
        }
        for(int i=mid;i<len;i++){
            r[i-mid]=arr[i];
        }

        mergeSort(l,mid);
        mergeSort(r,len-mid);

        merge(arr,l,r,mid,len-mid);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr={ 5, 1, 6, 2, 3, 4 };
        mergeSort(arr,arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
