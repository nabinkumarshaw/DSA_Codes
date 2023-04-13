public class InsertionSort {
    static void insertion(int[]arr){

        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,7,1,8,10,4};
        insertion(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
