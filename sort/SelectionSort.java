public class SelectionSort{

    public static void sort(int[] arr){             // time O(N^2); space O(1)
        int minIndex;
        int tmp;
        for(int i=0; i<arr.length; i++){
            minIndex = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] =tmp;
        }
    }

    public static void main(String[] args){
        int[] arr = {61,14,75,21,56,8,56};
        sort(arr);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}