public class Sum_Of_Digit {
    static int sum(int n){
        int sum=0;
        while(n>0 ){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(sum>=10) {
            return sum(sum);
        }
        else
            return sum;
    }
    public static void main(String[] args) {
        int n=9294;
        System.out.println(sum(n));
    }
}
