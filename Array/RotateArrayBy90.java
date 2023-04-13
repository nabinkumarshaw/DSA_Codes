public class RotateArrayBy90 {
    static void printarr(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transpose(int[][]arr){
        for(int i=0;i< arr.length;i++){
            for (int j=i;j<arr[i].length;j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            }
    }
    static void reverse(int[]arr){
        int i=0;int j= arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            reverse(arr[i]);

        }
        transpose(arr);
        printarr(arr);
    }
}
