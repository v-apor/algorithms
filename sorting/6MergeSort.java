import java.util.Arrays;
class MergeSort{

    static int[] arr = {123,213,352,346,3464,531,4};
    static int[] arr2 = {10,20,30,40,2,12,26,50};

    public static void merge(int[] arr, int l, int m, int h){
        //System.out.println(Arrays.toString(arr) + "\n left: " + l + " mid: " + m + " right: " + h);
        int[] temp = new int[arr.length];
        int lp = l;
        int rp = m+1;
        int tp = 0;
        while(lp<=m && rp<=h){
            if(arr[lp] > arr[rp]){
                temp[tp] = arr[rp];
                rp++;
            }
            else{
                temp[tp] = arr[lp];
                lp++;
            }
            tp++;
        }
        while(lp <= m){
            temp[tp] = arr[lp];
            lp++;
            tp++;
        }
        while(rp <= h){
            temp[tp] = arr[rp];
            rp++;
            tp++;
        }
        for(int i=0; i<h; i++){
            arr[i] = temp[i];
        }
        //System.out.println(Arrays.toString(arr) + "\n left: " + l + " mid: " + m + " right: " + h);
    }


    public static void mSort(int[] arr, int l, int r){
        if(r<=l) return;
        int mid = (l+r)/2;
        mSort(arr, l, mid);
        mSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }


    public static void main(String[] args){
        System.out.println(Arrays.toString(arr2));
        //mSort(arr, 0, arr.length-1);
        merge(arr2, 0, 3, 7);
        System.out.println(Arrays.toString(arr2));
    }
}