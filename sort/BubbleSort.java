import java.util.Scanner;
public class BubbleSort{

    public static void sort(int[] arr){                 // O(N^2) time ; O(1) space
        int tmp = arr[0];
        for(int itr = arr.length; itr>=2; itr--){
            for(int i=0; i<itr-1; i++){                     
                if(arr[i] > arr[i+1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int[] arr = new int[n];
        while(n-- != 0){
            arr[n] = sObj.nextInt();
        }
        sort(arr);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}