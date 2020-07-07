public class InsertionSort{

    public static void sort(int[] arr){             // O(N^2) cos of inner while too
        int max = arr[0];                           // Best for cases where data is already or mostly sorted
        for(int i=1; i<arr.length; i++){
            int j = i;
            int min;
            if(arr[i] < max){
                min = arr[i];
                while(j >=1 && min < arr[j-1]){
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[j] = min;
            }
            max = arr[i];
            }
        }

    public static void main(String[] args){
        int[] arr = {14,61,12,18,75,3};
        sort(arr);
        for(int ele: arr) System.out.print(ele + " ");
    }
}