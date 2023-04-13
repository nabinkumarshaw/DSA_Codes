public class sort012usingcount {
    static void print(int []arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void count(int[]arr){
        int freq[]=new int[3];
        for(int i=0;i< arr.length;i++)
            freq[arr[i]]++;
        //prefix sum of the frequency array
        for(int i=1;i< freq.length;i++)
            freq[i]+=freq[i-1];
        //now make answer array and put the value there
        int ans[]=new int[arr.length];
        for(int i= arr.length-1;i>=0;i--) {
            int idx = freq[arr[i]]-1;
            ans[idx]=arr[i];
            freq[arr[i]]--;
        }
        for(int i=0;i< arr.length;i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={0,2,2,1,0,1};
        count(arr);
        print(arr);

    }
}
