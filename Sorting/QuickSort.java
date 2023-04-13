public class QuickSort {
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
    static int partion(int []arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot)
            count++;
        }
        int pivotidx=st+count;
       swap(arr,st,pivotidx);
        //now we have to bring all the smaller and equal ele from the pivot into the left side and greater into the right side
       int i=st;
       int j=end;
        while(i<pivotidx&&j>pivotidx){
            while(arr[i]<=pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(arr[i]>pivot&&arr[j]<pivot){
               swap(arr,i,j);
                i++;
                j--;
            }

        }
        return pivotidx;
    }
    static void quicksort(int[]arr,int st,int end){
        //base case
        if(st>=end)
            return;
        //self work
        int pivot= partion(arr,st,end);
        //sub work(recursive call)
        quicksort(arr,st,pivot-1);
       quicksort(arr,pivot+1,end);
    }
    public static void main(String[] args) {
        int []arr={6,6,3,1,5,4};
        System.out.println("array before sorted");
        System.out.println();
        print(arr);
        quicksort(arr,0, arr.length-1);
        System.out.println("array after sorted");
        print(arr);
    }
}
