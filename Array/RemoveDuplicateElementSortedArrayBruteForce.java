public class RemoveDuplicateElementSortedArrayBruteForce {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,9,9,9};
        int j=0;
        int temp[]=new int[arr.length];
      for (int i=0;i< arr.length-1;i++){
          if(arr[i]!=arr[i+1]){
              temp[j]=arr[i];
              j++;
          }
          temp[j]=arr[arr.length-1];
      }
      for(int ele:temp){
          System.out.print(ele+" ");
      }
    }
}
