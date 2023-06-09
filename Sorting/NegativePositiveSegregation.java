public class NegativePositiveSegregation {
    static void print(int []arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void segregation(int[]arr){
        int pivot=0;
        int l=0;int r= arr.length-1;
        while(l<r){
            while(arr[l]>=pivot)
                l++;
            while(arr[r]<pivot)
                r--;
            if(l<r){
                swap(arr,l,r);
                l++;r--;
            }
        }
       // return pivot;
    }
    public static void main(String[] args) {
        int arr[]={19,0,-20,7,-4,-13,11,-5,3};
        segregation(arr);
        print(arr);
    }
}
