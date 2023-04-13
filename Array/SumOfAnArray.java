import java.util.Scanner;
public class SumOfAnArray {
    static int sum(int[]arr){
       int sum=0;
       for(int i=0;i< arr.length;i++){
           sum=sum+arr[i];
       }
       return sum;
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
        System.out.println("the sum of the array element is "+sum(arr));

    }
}
