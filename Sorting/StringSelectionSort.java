public class StringSelectionSort {
    static void selection(String[]arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int curr_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[curr_idx])<0){
                    curr_idx=j;
                }
            }
            String temp = arr[curr_idx];
            arr[curr_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        String fruits[]={"papaya","lime","watermelon","apple","mango","kiwi"};
        selection(fruits);
        for(int i=0;i< fruits.length;i++){
            System.out.print(fruits[i]+" ");
        }
    }
}
