import java.util.Scanner;
public class SmallestElementinAnArray {
    static int smallest(int[]arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the smallest element in an array is "+smallest(arr));
    }
}
