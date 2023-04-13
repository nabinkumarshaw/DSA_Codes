public class BubbleSort {
    static void bubble(int []arr){
        for(int i=0;i< arr.length-1;i++){
            int flag=0;
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){   //then swap their place
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
        int [] arr={2,1,3,90};
        bubble(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}

//time complexity of this code is ---->0(n)
//average case and worse case tc------->0(n^2)
//space complexity is ----->0(1)
