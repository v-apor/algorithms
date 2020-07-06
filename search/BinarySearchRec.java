// incomplete

public class BinarySearchRec{

    public static int search(int[] arr, int elementToFind, int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            if(arr[mid] == elementToFind){
                return mid;
            }
            else if(elementToFind > arr[mid]){
                return search(arr, elementToFind, mid, end);
            }
            else{
                return search(arr, elementToFind, start, mid);
            }
        }
        return -1;
    }

    public static void main(String[] args){
            int arr[] = {3, 14, 17, 61, 64, 75};	//Sorted array input
            int end = arr.length;
            int start = 0;
            int elementToFind = 614;
            int indexOfElement = search(arr, elementToFind, start, end);
            System.out.println("Index of " + elementToFind + " is: " + indexOfElement);
        }
}