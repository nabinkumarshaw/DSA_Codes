import java.util.Scanner;

public class Largestelement {
    static int largest(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the largest  array element is "+largest(arr));

    }
}
