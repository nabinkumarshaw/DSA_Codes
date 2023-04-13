import java.util.ArrayList;

public class CommonElementFromThreeSortedArray {
    public static void main(String[] args) {
        int a[]={2,4,8};              //all index are assigned by x
        int b[]={2,3,4,8,10,16};      //all index are assigned by y
        int c[]={2,8,17,34};          //all index are assigned by z
        int x=0;
        int y=0;
        int z=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while(x<a.length&&y<b.length&&z<c.length) {
            if (a[x] == b[y] && b[y] == c[z]) {
                ans.add(a[x]);
                x++;
                y++;
                z++;
            } else if (a[x] < b[y]) {
                x++;
            } else if (b[y] < c[z]) {
                y++;
            } else
                z++;
        }
        System.out.print(ans+" ");
        }
    }

