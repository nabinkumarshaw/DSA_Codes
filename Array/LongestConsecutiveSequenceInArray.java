import java.util.HashSet;

public class LongestConsecutiveSequenceInArray {
    public static void main(String[] args) {
        int arr[]={3,9,1,10,4,2,20};
        HashSet<Integer>ans=new HashSet<>();
        for(int hs:arr){
            ans.add(hs);
        }
        System.out.print(ans+" ");
    }
}
