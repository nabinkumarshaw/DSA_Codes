import java.util.HashSet;
public class RepeatingElement {
    public static void main(String[] args) {
        int arr[] = {2, 2, 4, 6, 8,8, 4, 9};
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            boolean p = hs.add(arr[i]);
            if (p == false)
                System.out.print(arr[i]+" ");
        }
    }
}