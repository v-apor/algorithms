// lomuto partition algorithm
// Time O(n) single pass | aux space O(1)
import java.util.Arrays;
class QuickSortPartitionBetter{
    public static int[] partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int lmt = 0;
        int temp = 0;
        for(int i=left; i<right; i++){
            if(arr[i] < pivot){
                //System.out.println("i: " + i);
                //System.out.println("Swapping " + arr[i] + " and " + arr[lmt]);
                temp = arr[i];
                arr[i] = arr[lmt];
                arr[lmt] = temp;
                lmt++;
            }
        }
        //System.out.println("lmt: " + lmt);
        arr[right] = arr[lmt];
        arr[lmt] = pivot;
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3, 8, 5, 12, 10, 7, 1, 2, 14};
        System.out.println(Arrays.toString(arr));
        arr = partition(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));        
    }
}