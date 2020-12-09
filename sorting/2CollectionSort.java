import java.util.ArrayList;
import java.util.Collections;

class  CollectionSort{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(5);
        arr.add(20);
        arr.add(7);

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);

        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);

    }
}