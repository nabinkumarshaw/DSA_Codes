public class CountSortWithSameValuePlace {
    static void printarr(int[]arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int max(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }
    static void count(int[]arr){
        int n= max(arr);
       int[] freq=new int[n+1];
       for(int i=0;i<arr.length;i++){
           freq[arr[i]]++;
       }
       //make prefix sum array of freq arr
       for(int i=1;i<freq.length;i++){
           freq[i]+=freq[i-1];
       }
       int output[]=new int[arr.length];
       //find the index of each element in the orginal array and put it in the output array
       for(int i=arr.length-1;i>=0;i--){
           int idx=freq[arr[i]]-1;
           output[idx]=arr[i];
           freq[arr[i]]--;
       }
       for(int i=0;i< arr.length;i++){
           arr[i]=output[i];
       }
    }
    public static void main(String[] args) {
        int arr[]={2,3,2,4,0,1,4,1,0,2};
        count(arr);
        printarr(arr);
    }
}
