public class Sorting {
    static void printarr(int []arr){
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
//    static void merge(int[]arr,int st,int mid,int end ){
//        int n1=mid-st+1;
//        int n2=end-mid;
//        int left[]=new int[n1];
//        int right[]=new int[n2];
//        for(int i=0;i<n1;i++){
//            left[i]=arr[i+st];
//        }
//        for(int j=0;j<n2;j++){
//            right[j]=arr[j+mid+1];
//        }
//        int i=0;int j=0;int k=st;
//        while(i<n1 && j<n2){
//            if(left[i]<right[j])
//            arr[k++]=left[i++];
//            else
//                arr[k++]=right[j++];
//        }
//        while(i<n1){
//            arr[k++]=left[i++];
//        }
//        while(j<n2){
//            arr[k++]=right[j++];
//        }
//    }
//    static void mergesort(int[]arr,int st,int end){
//        int mid=(end+st)/2;
//        if(st>=end){
//            return;
//        }
//        mergesort(arr,st,mid);
//        mergesort(arr,mid+1,end);
//        merge(arr,st,mid,end);
//    }
    static int partation(int[]arr,int l,int r){
        int pivot=arr[l];
        int count=0;
        for(int i=l+1;i<=r;i++) {
            if (arr[i]<=pivot)
                count++;
        }
        int piv_idx=count+l;
        swap(arr,l,piv_idx);
        int i=l;int j=r;
        while(i<piv_idx && j>piv_idx){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<piv_idx&& j>piv_idx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return piv_idx;
    }
    static void quick(int[]arr,int l,int r){
       // int mid=(l+r)/2;
        if(l>=r) return;
        int p=partation(arr,l,r);
        quick(arr,l,p-1);
        quick(arr,p+1,r);
    }
    public static void main(String[] args) {
        int[]arr={12,5,3,8,12,6};
//        int st=0;
//        int end=arr.length-1;
       // mergesort(arr,0,arr.length-1);
        quick(arr,0,arr.length-1);
        printarr(arr);

    }
}
