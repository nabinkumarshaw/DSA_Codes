public class Arraymaxminfirstlastoccurance {
    static int maxele(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    static int minele(int[]arr){
        int max=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<max)
                max=arr[i];
        }
        return max;
    }
    static int firstoccmax(int[]arr){
        int first_idx=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==maxele(arr)) {
                first_idx=i;
                break;
            }
        }
        return first_idx;
    }
    static int lastoccmin(int[]arr){
        int lastidx=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==minele(arr)) {
                lastidx=i;
            }
        }
        return lastidx;
    }
    public static void main(String[] args) {
        int[]arr={12,14,12,14,13};
        System.out.println(maxele(arr));
        System.out.println(minele(arr));
        System.out.println(firstoccmax(arr));
        System.out.println(lastoccmin(arr));
    }
}
