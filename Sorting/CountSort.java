public class CountSort {
    static void print(int[]arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int max_ele(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
static void count(int[]arr){
        int l1=max_ele(arr);
        int freq[]=new int[l1+1];
        for(int i=0;i< arr.length;i++){
            freq[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<freq.length;i++){
            for(int j=0;j<freq[i];j++){
                arr[k]=i;
                k++;
            }
        }
}
    public static void main(String[] args) {
        int []arr={6,1,3,4,2,7};
        count(arr);
        print(arr);
    }
}
