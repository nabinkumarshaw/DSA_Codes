import java.util.Scanner;

public class FirstDuplicateInArray {

    static void firstduplicate(int[]arr){
        int temp=0;
        System.out.println("first repeating element is ");
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    temp=temp+1;
                   // break;
                }
            }
            if(temp==1){
               break;
            }
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
        firstduplicate(arr);
    }
}
