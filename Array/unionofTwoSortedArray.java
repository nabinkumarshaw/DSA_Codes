public class unionofTwoSortedArray {
    static void union(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        while (i < arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.println(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.println(arr2[j]);
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
            while (i < arr1.length) {
                System.out.println(arr1[i]);
                i++;
            }
            while (j < arr2.length) {
                System.out.println(arr2[j]);
                j++;
        }
    }
    public static void main(String[] args) {
        int arr1[]={2,4,6,8};
        int arr2[]={1,3,4,6};
        union(arr1,arr2);
    }
}
