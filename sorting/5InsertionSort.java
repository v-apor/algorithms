// Best for small number of elements
// It's stable soring algorithm
// Time O(n^2) worst (reverse order) | best time O(n) already sorted

import java.util.Arrays;

class InsertionSort{

    public static int[] iSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = new int[] {5,472,54,754,754,6456546,61};
        System.out.println(Arrays.toString(arr));
        arr = iSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}