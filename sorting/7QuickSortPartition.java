// Complete now
// time O(n) | space O(n)

import java.util.Arrays;

class QuickSortPartition{

    public static int[] partition(int[] arr, int index){
        int right = arr.length-1;
        int left = 0;
        int[] tempArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr[index]) continue;
            if(arr[i] > arr[index]){
                tempArr[right] = arr[i];
                right--;
            }
            else{
                tempArr[left] = arr[i];
                left++;
            }
        }
        tempArr[left] = arr[index];
        return tempArr;
    }

    public static void main(String[] args){
        int[] arr = {3, 8, 5, 12, 10, 7, 1, 2, 29};
        System.out.println(Arrays.toString(arr));
        arr = partition(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}