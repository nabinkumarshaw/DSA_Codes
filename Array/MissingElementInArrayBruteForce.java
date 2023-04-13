import java.util.Scanner;

public class MissingElementInArrayBruteForce {
    static int missing(int[]arr){               //arr={1,2,3,5,6}  //4 is missing here
        int expectedele= arr.length+1;
        int expectedtotal=(expectedele*(expectedele+1))/2;        //n*(n+1)/2
        int arrtotal=0;
        for(int i=0;i< arr.length;i++){
            arrtotal+=arr[i];
        }
        return expectedtotal-arrtotal;
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
        System.out.println("the missing element in an array is "+missing(arr));
    }
}
