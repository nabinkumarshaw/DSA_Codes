import java.util.Scanner;

public class MissingElementInAnArrayUsingXor {
    static int missing(int[]arr){
        int xor1=arr[0];
        for(int i=1;i<arr.length;i++){
            xor1=xor1^arr[i];
        }
        int xor2=1;
        for(int i=2;i<=arr.length+1;i++){
            xor2=xor2^i;
        }
        return xor1^xor2;
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
        System.out.println(missing(arr));
    }
}
