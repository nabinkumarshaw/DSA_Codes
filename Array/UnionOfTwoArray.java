import java.util.HashSet;
import java.util.Scanner;

public class UnionOfTwoArray {
    static void union(int[]arr1,int arr2[]){
        HashSet<Integer> ans=new HashSet<>();
        for(int ele:arr1){
            ans.add(ele);
        }
        for(int ele:arr2){
            ans.add(ele);
        }
        System.out.print(ans+" ");
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
        union(arr1,arr2);
    }
}
