// takes O(N^2); SlOw

public class QuickFindUF{
    private int arr[];

    public void QuickFindUF(int num){
        arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = i;
        }
    }

    public boolean isConnected(int a, int b){
        return arr[a] == arr[b];
    }

    public void union(int a, int b){
        if(arr[a]==arr[b]){
            return;
        }
        else{
            int idA = arr[a];
            int idB = arr[b];
            for(int i=0; i<arr.length; i++){
                if(arr[i] == idA){
                    arr[i] = idB;
                }
            }
        }
    }
}