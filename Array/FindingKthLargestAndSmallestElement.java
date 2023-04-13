import java.util.Scanner;

public class FindingKthLargestAndSmallestElement {
    static void klargest(int[]arr,int k){
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println(k + "th largest element is " + arr[i]);
                break;
            }
        }
            for(int i=0;i< arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    }
    static void ksmallest(int[]arr,int k){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println("");
                System.out.println(k +"th smallest element is "+arr[i]);
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
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
        System.out.println("enter the kth value that you want to find");
        int k=sc.nextInt();
        klargest(arr,k);
        ksmallest(arr,k);
    }
}
