import java.util.Scanner;
public class lLnearSearch {
    static int linear(int[]arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item)
            return i;
        }
         return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element in an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element in an array");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("enter the element that you want to find in an array");
        int item=sc.nextInt();
        System.out.println("element found at index "+linear(arr,item));
    }
}
