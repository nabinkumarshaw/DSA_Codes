import java.util.HashSet;
import java.util.Scanner;

public class MergeTwoArray {
    static void merge(int arr1[],int arr2[]){
      int a1= arr1.length;
      int a2= arr2.length;
      int a3=arr1.length+ arr2.length;
      int j=0;
      int[]arr3=new int[a3];
      for(int i=0;i< arr1.length;i++){
          arr3[i]=arr1[i];
      }
        for(int i=0;i< arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("enter the array element ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the array size");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("enter the array element ");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        merge(arr1,arr2);
    }
}
