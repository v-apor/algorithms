class QuickUnionUF{
    private int[] arr;

    public void QuickUnionUF(int N){
        arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }
    }

    public int getRoot(int num){
        while(num != arr[num]){
            num = arr[num];
        }
        return num;
    }

    public void union(int a, int b){
        arr[getRoot(a)] = getRoot(b);
    }

    public boolean isConnected(int a, int b){
        return getRoot(a) == getRoot(b);
        }
    }
}