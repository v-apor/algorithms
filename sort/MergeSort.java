// Man!! This was a tough one (Taken from HackerRank/Gayle's Merge Sort clip)

public class MergeSort{
    public static void sort(int[] arr, int[] temp, int LeftStart, int RightEnd){
        if(LeftStart >= RightEnd){
            return;
        }
        int middle = (LeftStart + RightEnd)/2;
        sort(arr, temp, LeftStart, middle);
        sort(arr, temp, middle+1, RightEnd);
        mergeValues(arr, temp, LeftStart, RightEnd);
    }

    public static void mergeValues(int[] arr, int[] temp, int LeftStart, int RightEnd){
        int[] output = new int[arr.length];
        int LeftEnd = (LeftStart + RightEnd)/2;
        int RightStart = LeftEnd + 1;
        int size = RightEnd-LeftStart + 1;

        int left = LeftStart;
        int right = RightStart;
        int index = LeftStart;
        
        while(left <= LeftEnd && right <= RightEnd){
            if(arr[left] <= arr[right]) temp[index] = arr[left++];
            else temp[index] = arr[right++];
            index++;
        }

        System.arraycopy(arr, left, temp, index, LeftEnd - left + 1);
        System.arraycopy(arr, right, temp, index, RightEnd - right + 1);
        System.arraycopy(temp, LeftStart, arr, LeftStart, size);
    }

    public static void main(String[] args){
        int[] arr = {14,61,12,18,75,3};
        sort(arr, new int[arr.length], 0, arr.length-1);
        for(int ele: arr) System.out.print(ele + " ");
    }
}