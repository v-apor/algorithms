// Problem : Merge two sorted array

import java.util.Arrays;
class MergeSortProblem{

    public static int[] merge(int[] arr1, int[] arr2){
        int pointer1, pointer2;
        pointer1 = pointer2 = 0;
        int resultPointer = 0;
        int[] result = new int[arr1.length + arr2.length];
        while(pointer1<arr1.length && pointer2<arr2.length){
            if(arr1[pointer1]<arr2[pointer2]){
                result[resultPointer] = arr1[pointer1];
                pointer1++;
            }
            else{
                result[resultPointer] = arr2[pointer2];
                pointer2++;
            }
            resultPointer++;
        }

        while(pointer1<arr1.length){
            result[resultPointer] = arr1[pointer1];
            pointer1++;
            resultPointer++;
        }

        while(pointer2<arr2.length){
            result[resultPointer] = arr2[pointer2];
            pointer2++;
            resultPointer++;
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr1 = {1,3,7,9,45};
        int[] arr2 = {2,3,5,11,44};
        int[] result = merge(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}