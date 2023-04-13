import java.util.HashSet;
import java.util.Scanner;

public class InsertAnElementInAnArray {
    static void insert(int []arr){
        int element=100;
        int idx=2;
        for(int i= arr.length-1;i>idx;i--){
            arr[i]=arr[i-1];
        }
        arr[idx]=element;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the array element");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        insert(arr);
    }
}
