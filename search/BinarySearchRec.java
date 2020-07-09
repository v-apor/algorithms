// // incomplete

// public class BinarySearchRec{

//     public static int search(int[] arr, int elementToFind, int start, int end){
//         if(start < end){
//             int mid = (start + end)/2;
//             if(arr[mid] == elementToFind){
//                 return mid;
//             }
//             else if(elementToFind > arr[mid]){
//                 return search(arr, elementToFind, mid, end);
//             }
//             else{
//                 return search(arr, elementToFind, start, mid);
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args){
//             int arr[] = {3, 14, 17, 61, 64, 75};	//Sorted array input
//             int end = arr.length;
//             int start = 0;
//             int elementToFind = 614;
//             int indexOfElement = search(arr, elementToFind, start, end);
//             System.out.println("Index of " + elementToFind + " is: " + indexOfElement);
//         }
// }

public class BinarySearchRec{
    public static int bSearch(int[] arr, int ele, int left, int right){
        if(left > right) return -1;
        int middle = (left + right)/2;
        if(arr[middle] == ele) return middle;
        if(arr[middle] > ele) return bSearch(arr, ele, left, middle-1);
        else return bSearch(arr, ele, middle+1, right);
    }

    public static void main(String[] args){
        int[] arr = {1,214,12,4,235,23,523,5,23,61,75};
		System.out.println(bSearch(arr, 14, 0, arr.length-1));
    }
}