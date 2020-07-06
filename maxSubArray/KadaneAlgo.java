// Algorithm to find SubArray having maximum sum

//import java.util.Scanner;
import java.lang.Math;
class KadaneAlgo{
    public static void main(String[] args){
        //Scanner sObj = new Scanner(System.in);
        //String[] arr = sObj.nextLine().split(" ");
        //int max = Integer.parseInt(arr[0]);
        int arr[] = {-121, -1, -2 , -1};
        int result, max;
        result = max = arr[0];
        for(int i=1; i<arr.length; i++){
            //System.out.println("max b4: " + max);
            max = Math.max(arr[i], arr[i] + max);
            //System.out.println("max after: " + max);
            if(max > result){
                result = max;
            }
        }
        System.out.println(result);
    }
}