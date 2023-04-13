import java.util.Scanner;

public class BinarySearch {
    static int binary(int[]arr,int item){
       int left=0;
       int right=arr.length-1;
        int mid=(left+right)/2;
       while(left<=right){
           if(arr[mid]==item){
               return mid;
           }
           else if(arr[mid]<item){
               left=mid+1;
           }
           else {
               right=mid-1;
           }
              mid=(left+right)/2;
       }
       return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element in an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element in an array");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("enter the element that you want to find in an array");
        int item=sc.nextInt();
        System.out.println("element found at index "+binary(arr,item));
    }
}
