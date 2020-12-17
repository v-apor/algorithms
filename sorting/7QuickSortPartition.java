// Not complete

import java.util.Arrays;

class QuickSortPartition{

    public static int[] partition(int[] arr, int index){
        int value = arr[index];
        int pointer = 0;
        int temp = 0;
        int swap = 0;
        for(int i=0; i<=arr.length; i++){
            if(arr[i] < value){
                temp = arr[pointer];
                arr[pointer] = arr[i];
                arr[i] = temp;
                pointer++;
            }
            if(arr[i] == value) swap = i;
        }
        arr[pointer-1] = 
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3, 8, 5, 12, 10, 7, 1, 2, 29};
        System.out.println(Arrays.toString(arr));
        arr = partition(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
}