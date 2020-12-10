import java.util.Arrays;
class MergeSort{

    public static void merge(){
        
    }


    public static void mSort(int[] arr, int l, int r){
        if(r<=l) return;
        int mid = (l+r)/2;
        mSort(arr, l, mid);
        mSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    public static int[] sort(int[] arr){
        static int[] result = arr.clone();
        mSort(result, 0, result.length);
        return result;
    }

    public static void main(String[] args){
        int[] arr = {123,213,352,346,3464,531,4};
        System.out.println(Arrays.toString(arr));
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}