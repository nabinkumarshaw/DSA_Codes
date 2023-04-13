public class SelectionSort {
    static void selection(int[]arr){
        for(int i=0;i< arr.length-1;i++){
           int pre_idx=i;
            for(int j=i+1;j< arr.length;j++) {
                if (arr[pre_idx] > arr[j]) {
                    pre_idx = j;               //we have to change the index value not the element
                }
            }
                int temp = arr[pre_idx];
                arr[pre_idx] = arr[i];
                arr[i] = temp;
            }
        }
    public static void main(String[] args) {
        int arr[]={6,3,1,7,2,9,4,3};
        selection(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
