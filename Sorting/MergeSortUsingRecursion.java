public class MergeSortUsingRecursion {
    static void print (int[]arr){
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void merge(int []arr,int l,int mid,int r){
        mid=(l+r)/2;
        int n1=mid-l+1;
        int left[]=new int[n1];
        int n2=r-mid;
        int right[]=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++)
            left[i]=arr[l+i];
        for(j=0;j<n2;j++)
            right[j]=arr[mid+1+j];
        i=0;j=0;k=l;
        while(i< n1 && j< n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
              //  k++;i++;
            }
            else
                arr[k++]=right[j++];
         //   k++;j++;
        }
        while(i<n1){
            arr[k++]=left[i++];
          //  k++;i++;
        }
        while (j<n2){
            arr[k++]=right[j++];
            //k++;j++;
        }
    }
    static void mergesort(int[]arr,int l,int r){
       int mid=(l+r)/2;
       //base case
        if(l>=r)
            return ;
        //sub problem
      mergesort(arr,l,mid);
       mergesort(arr,mid+1,r);
        //self work(we make 1 merge function which merges two sorted array)
        merge(arr,l,mid,r);

    }
    public static void main(String[] args) {
        int []arr={6,4,5,1,3,2};
        int n= arr.length;
        System.out.println("array before sorting ");
        print(arr);
        System.out.println();
        mergesort(arr,0,n-1);
        System.out.println("array after sorting");
        print(arr);

    }
}
