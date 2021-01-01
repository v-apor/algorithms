import java.util.Arrays;
class QuickSort{
    // Using Lomuto partition (returning pivot index)
    public static int partition(int[] arr, int left, int right){
        //System.out.println("before: " + Arrays.toString(arr));
        int pivot = arr[right];
        int lmt = left;
        int temp = 0;
        for(int i=left; i<right; i++){
            if(arr[i] < pivot){
                temp = arr[i];
                arr[i] = arr[lmt];
                arr[lmt] = temp;
                lmt++;
            }
        }
        arr[right] = arr[lmt];
        arr[lmt] = pivot;
        //System.out.println("after: " + Arrays.toString(arr));
        return lmt;
    }

    // p -> pivot
    public static void qSort(int[] arr, int l, int r){
        //System.out.println(l + " " + r);
        if(l < r){
            int pivotIndex = partition(arr, l, r);
            qSort(arr, l, pivotIndex-1);
            qSort(arr, pivotIndex+1, r);
        }
    }    

    public static void main(String[] args){
        //int[] arr = new int[] {123,15,745,7,325,200};
        int[] arr = new int[] {1,2,213,12,3,123,21,3,123,12,41,4,135,23,6};
        System.out.println(Arrays.toString(arr));
        qSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}