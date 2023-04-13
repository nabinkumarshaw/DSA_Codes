import java.util.Scanner;

public class DuplicateElementInArray {
    static void duplicate(int[]arr){
        System.out.print("duplicate element in the array is ");
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]) {
                    System.out.print(arr[j]+" ");
                }
            }
        }
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
        duplicate(arr);
    }
}
