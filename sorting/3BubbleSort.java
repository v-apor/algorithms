// Note: This is stable sort, relative position is preserved
// Time O(n^2)

import java.util.Arrays;
class BubbleSort{

    // public static int[] bSort(int[] arr){
    //     int temp = 0;
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=1; j<arr.length-i; j++){
    //             if(arr[j-1] > arr[j]){
    //                 temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //         }
    //     }
    //     return arr;
    // }

    // optimising for already sorted
    public static int[] bSort(int[] arr){
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break; // already sorted
        }
        return arr;
    }    

    public static void main(String[] args){
        int[] arr = {12,12,4,124,234,32,523,5,346,45,6};
        System.out.println(Arrays.toString(arr));
        arr = bSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}