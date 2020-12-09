import java.util.Arrays;
import java.util.Collections;

class  ArraySort{
    public static void main(String[] args){
        int[] arr = {4, 124, 4214, 345};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Sorting subarray
        int[] arr1 = {6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, 3, 6);
        System.out.println(Arrays.toString(arr1));

        // For reverse order we can only use Integer and not int
        Integer[] arr2 = {4, 124, 4214, 345};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }
}