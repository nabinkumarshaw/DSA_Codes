public class Shifting0ToRightSide {
    static void shifting0(int []arr) {
        for (int i = 0; i < arr.length-1;i++){
            int flag=0;
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={0,5,0,0};
        shifting0(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
