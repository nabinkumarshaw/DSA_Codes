import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateUsingHashSet {
    static void removeduplicate(int[]arr){
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            hs.add(arr[i]);
        }
        for(int ans:hs){
            System.out.print(ans+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element in an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element in an array");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        removeduplicate(arr);
    }
}
