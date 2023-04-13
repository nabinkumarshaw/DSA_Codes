import java.util.Scanner;

public class DeleteAnElementInAnArray {
    static void delete(int[]arr,int delete){
        for(int i=0;i<arr.length;i++) {
            if ( delete==arr[i]) {
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the array element");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be deleted ");
        int delete=sc.nextInt();
        delete(arr,delete);
    }
}
