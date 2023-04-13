import java.util.Scanner;
import java.util.ArrayList;
public class EvenOddInArray {
    static void evenodd(int[]arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        System.out.println("total numbers of even element in an array is " + even.size());
        for (int ans1 : even) {
            System.out.print(ans1 + " ");
            System.out.println();
            evensum += ans1;
        }
            System.out.println("the summation of an even element is " + evensum);

        System.out.println();
        System.out.println("total numbers of odd element in an array is " + odd.size());
        for (int ans2 : odd) {
            System.out.print(ans2 + " ");
            System.out.println();
            oddsum += ans2;
        }
            System.out.println("the summation of an odd element is " + oddsum);

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

        evenodd(arr);
    }
}
