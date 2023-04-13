import java.util.Scanner;
import java.util.HashSet;
public class CommonElementOfTwoArrayUsingSimpleHashSet {
    static void commonelement(int[]arr1,int []arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    hs.add(arr1[i]);
                    break;
                }
            }
        }
        for(int ans:hs) {
        }
            System.out.print(hs+" ");
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
        commonelement(arr1,arr2);
    }
}
