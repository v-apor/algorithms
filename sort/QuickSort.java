public class QuickSort{
    public static sort(int[] arr){          // Dang it's complex; take pivot and lesser goes to left
                                            // greater goes to right and subdivide those too

    }

    public static void main(String[] args){
        int[] arr = {14,61,12,18,75,3};
        sort(arr, new int[arr.length], 0, arr.length-1);
        for(int ele: arr) System.out.print(ele + " ");
    }
}