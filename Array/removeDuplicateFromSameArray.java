import java.util.Scanner;

public class removeDuplicateFromSameArray {
    static void removeduplicate(int[]arr){
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]) {
                arr[j] =arr[i];
                j++;
            }
        }
        arr[j]=arr[arr.length-1];
        for(int ele:arr){
            System.out.print(ele+" ");
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
