import java.util.Scanner;

public class SecondLargest {

   public static int seclargest(int []arr){
       int largest=Integer.MIN_VALUE;
       int second_largest= Integer.MIN_VALUE;
       for(int i=0;i< arr.length;i++){
           if(arr[i]>largest){
               second_largest=largest;
               largest=arr[i];
           }
           else if (arr[i]>second_largest&&arr[i]!=largest) {
               second_largest=arr[i];
           }

       }
       return second_largest;
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
        System.out.println("the second largest element in an array is "+seclargest(arr));
    }
}
