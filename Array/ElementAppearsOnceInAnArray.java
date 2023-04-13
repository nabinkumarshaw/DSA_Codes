public class ElementAppearsOnceInAnArray {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,4,2,5,7,3,5,4,5};
        int res=arr[0];
        for(int i=1;i< arr.length;i++) {
            res=res^arr[i];
        }
        System.out.println("the only element present in an array is "+res);
    }
}
