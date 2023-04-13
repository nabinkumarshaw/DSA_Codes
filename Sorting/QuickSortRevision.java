public class QuickSortRevision {
    static void print(int[]arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partion(int[]arr,int l,int r){
        int random_idx=(int)(Math.random()*(r-l+1))*l;
       int pivot=arr[random_idx];
       // int pivot=arr[l];
       int count=0;
       for(int i=l+1;i<=r;i++){
           if(arr[i]<=pivot)
               count++;
       }
       int pivot_idx=l+count;
       swap(arr,l,pivot_idx);
       int i=l;int j=r;
       while(i<pivot_idx && j>pivot_idx){
           while(arr[i]<=pivot)
               i++;
           while(arr[j]>pivot)
               j--;
           if(i<pivot_idx && j>pivot_idx){
               swap(arr,i,j);
               i++;
               j--;
           }
       }
       return pivot_idx;
    }
    static void mergesort(int[]arr,int l,int r){
        while(l>=r)
        return;
        int p=partion(arr,l,r);
        mergesort(arr,l,p-1);
        mergesort(arr,p+1,r);
    }

    public static void main(String[] args) {
        int []arr={4,9,1,30,45,2,12};
        mergesort(arr,0, arr.length-1);
        print(arr);
    }
}
