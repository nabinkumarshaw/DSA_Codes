import java.util.HashSet;
public class CommonmElementUsingHasSet {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 5, 1, 21,4,4,4,4,1,2};
        int arr2[] = {2, 9, 1, 4, 8,1,2,4,4,4, 7};
        HashSet<Integer>ans1=new HashSet<>();
        HashSet<Integer>ans2=new HashSet<>();
        for(int no:arr1){
            ans1.add(no);
        }
        for(int no:arr2){
            ans2.add(no);
        };
        HashSet<Integer> ans = new HashSet<>();
        for(int no:ans1){
            ans.add(no);
        }
        for(int no:ans2){
            boolean b=ans.add(no);
            if(b==false){
                System.out.print(no+" ");
            }
        }
    }
}
