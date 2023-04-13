import java.util.Scanner;

public class SecondLargeAndsmallInArrBruteForce {
    static int secondlargest(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                //now arrange the element in descending order
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return arr[1];         //because in second position second largest element is present
    }
    static int secondsmallest(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                //now arrange the element in ascending order
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return arr[1];    //because in second position second smallest element is present
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

        System.out.println("the second largest element present in an array is "+secondlargest(arr));
        System.out.println("the second smallest element present in an array is "+secondsmallest(arr));
    }
}
