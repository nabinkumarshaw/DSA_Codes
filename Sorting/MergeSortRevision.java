public class MergeSortRevision {
    static void printarr(int[]arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void merge(int []arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        int k;
        //inserting an element on the left and the right array
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
       int i=0;int j=0;k=l;
       while(i<n1&&j<n2) {
           if (left[i] < right[j]) {
               arr[k++] = left[i++];
           } else
               arr[k++] = right[j++];
       }
       while(i<n1){
           arr[k++]=left[i++];
       }
       while(i<n2){
           arr[k++]=right[j++];
       }
    }
    static void mergesort(int[]arr,int l,int r){
        int mid=(l+r)/2;
        //base case
        if(l>=r)
            return;
        //subcase
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        //self work
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int[]arr={3,6,12,87,1,34};
        int n= arr.length;
        System.out.println("before sorting");
        printarr(arr);
        mergesort(arr,0,n-1);
        System.out.println("after sorting");
        printarr(arr);
    }
}
