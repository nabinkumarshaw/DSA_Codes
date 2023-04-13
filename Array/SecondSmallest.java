import java.util.Scanner;

public class SecondSmallest {
    static int secondsmallest(int[]arr){
        int smallest=Integer.MAX_VALUE;
        int sec_smallest= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                sec_smallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<sec_smallest&&arr[i]!=0){
                sec_smallest=arr[i];
            }
        }
        return sec_smallest;
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
        System.out.println("the second smallest element in an array is "+secondsmallest(arr));

        }
    }

